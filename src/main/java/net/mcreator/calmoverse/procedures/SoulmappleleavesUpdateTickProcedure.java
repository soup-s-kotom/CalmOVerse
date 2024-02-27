package net.mcreator.calmoverse.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.calmoverse.init.CalmoverseModParticleTypes;

public class SoulmappleleavesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CalmoverseModParticleTypes.SOULMAPLELEAF), x, y, z, 5, 3, 3, 3, 0.3);
	}
}
