/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.calmoverse.client.particle.SoulmapleleaveParticle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class CalmoverseModParticleTypes {
	public static final SimpleParticleType SOULMAPLELEAF = FabricParticleTypes.simple(false);

	public static void clientLoad() {
		ParticleFactoryRegistry.getInstance().register(SOULMAPLELEAF, SoulmapleleaveParticle::provider);
	}

	public static void load() {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("calmoverse", "soulmapleleaf"), SOULMAPLELEAF);
	}
}
