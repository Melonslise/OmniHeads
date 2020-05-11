package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class HeadBlock extends HorizontalRotationBlock
{
	public static final VoxelShape SHAPE = Block.makeCuboidShape(3d, 0d, 3d, 13d, 9d, 13d);

	public HeadBlock(Properties props)
	{
		super(props);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		return SHAPE;
	}
}