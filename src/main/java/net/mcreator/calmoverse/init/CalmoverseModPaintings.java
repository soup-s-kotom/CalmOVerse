
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.calmoverse.CalmoverseMod;

public class CalmoverseModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "this_is_not_hell"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "behind_the_fire"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "leave_your_mind"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "is_it_overworld"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "party_room"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CalmoverseMod.MODID, "this_is_the_end"), new PaintingVariant(32, 16));
	}
}
