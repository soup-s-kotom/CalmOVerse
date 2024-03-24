package net.mcreator.calmoverse.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.calmoverse.network.CalmoverseModVariables;

public class AstralSlimeJumpConstantlyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (CalmoverseModVariables.CVTime == 20) {
			if (world.getBlockState(BlockPos.containing(x, y - 0.01, z)).canOcclude()) {
				entity.setDeltaMovement(new Vec3(0, 0.1, 0));
			}
		}
	}
}
