
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.calmoverse.entity.SoulEntity;
import net.mcreator.calmoverse.entity.AstralSlimeEntity;
import net.mcreator.calmoverse.CalmoverseMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class CalmoverseModEntities {
	public static EntityType<SoulEntity> SOUL;
	public static EntityType<AstralSlimeEntity> ASTRAL_SLIME;

	public static void load() {
		SOUL = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CalmoverseMod.MODID, "soul"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SoulEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SoulEntity.init();
		FabricDefaultAttributeRegistry.register(SOUL, SoulEntity.createAttributes());
		ASTRAL_SLIME = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CalmoverseMod.MODID, "astral_slime"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, AstralSlimeEntity::new).dimensions(new EntityDimensions(0.7f, 0.7f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		AstralSlimeEntity.init();
		FabricDefaultAttributeRegistry.register(ASTRAL_SLIME, AstralSlimeEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
