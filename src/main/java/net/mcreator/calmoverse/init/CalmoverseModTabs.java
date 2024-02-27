
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.calmoverse.CalmoverseMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class CalmoverseModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CALM_O_VERSE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CalmoverseMod.MODID, "calm_o_verse"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CALM_O_VERSE, FabricItemGroup.builder().title(Component.translatable("item_group." + CalmoverseMod.MODID + ".calm_o_verse")).icon(() -> new ItemStack(Blocks.LAVA)).build());
	}
}
