/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.calmoverse.item.SoulArmorItem;
import net.mcreator.calmoverse.CalmoverseMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CalmoverseModItems {
	public static Item SOUL_MAPLE_WOOD;
	public static Item SOUL_MAPLE_LOG;
	public static Item SOUL_MAPLE_PLANKS;
	public static Item SOUL_MAPLE_SLAB;
	public static Item SOUL_MAPLE_STAIRS;
	public static Item SOUL_MAPLE_FENCE;
	public static Item SOUL_MAPLE_FENCE_GATE;
	public static Item SOUL_MAPLE_BUTTON;
	public static Item SOUL_MAPLE_PRESSURE_PLATE;
	public static Item SOUL_MAPLE_DOOR;
	public static Item SOUL_MAPLE_TRAPDOOR;
	public static Item BURNED_WOOD;
	public static Item BURNED_LOG;
	public static Item STRIPPED_BURNED_WOOD;
	public static Item STRIPPED_BURNED_LOG;
	public static Item BURNED_PLANKS;
	public static Item BURNED_FENCE;
	public static Item BURNED_SLAB;
	public static Item BURNED_STAIRS;
	public static Item BURNED_FENCE_GATE;
	public static Item BURNED_BUTTON;
	public static Item BURNED_PRESSURE_PLATE;
	public static Item BURNED_DOOR;
	public static Item BURNED_TRAP_DOOR;
	public static Item FLAIMING_ROOTS;
	public static Item FLAMES_TEAR_STONE;
	public static Item FLAME_OROSE;
	public static Item GLOBE_FLOWER;
	public static Item SOUL_MAPLE_LEAVES;
	public static Item GEYSER;
	public static Item IGNIY;
	public static Item ASH;
	public static Item OVERHEATED_ASH;
	public static Item HEATED_ASH;
	public static Item FOSSILS;
	public static Item BURNED_VALLEY_PORTAL;
	public static Item SOUL_ARMOR_HELMET;
	public static Item SOUL_ARMOR_CHESTPLATE;
	public static Item SOUL_ARMOR_LEGGINGS;
	public static Item SOUL_ARMOR_BOOTS;

	public static void load() {
		SOUL_MAPLE_WOOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_wood"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_WOOD));
		SOUL_MAPLE_LOG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_log"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_LOG));
		SOUL_MAPLE_PLANKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_planks"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_PLANKS));
		SOUL_MAPLE_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_slab"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_SLAB));
		SOUL_MAPLE_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_stairs"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_STAIRS));
		SOUL_MAPLE_FENCE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_fence"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_FENCE));
		SOUL_MAPLE_FENCE_GATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_fence_gate"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_FENCE_GATE));
		SOUL_MAPLE_BUTTON = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_button"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_BUTTON));
		SOUL_MAPLE_PRESSURE_PLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_pressure_plate"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_PRESSURE_PLATE));
		SOUL_MAPLE_DOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_door"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_DOOR));
		SOUL_MAPLE_TRAPDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_trapdoor"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_TRAPDOOR));
		BURNED_WOOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_wood"), new BlockItem(CalmoverseModBlocks.BURNED_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_WOOD));
		BURNED_LOG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_log"), new BlockItem(CalmoverseModBlocks.BURNED_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_LOG));
		STRIPPED_BURNED_WOOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "stripped_burned_wood"), new BlockItem(CalmoverseModBlocks.STRIPPED_BURNED_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(STRIPPED_BURNED_WOOD));
		STRIPPED_BURNED_LOG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "stripped_burned_log"), new BlockItem(CalmoverseModBlocks.STRIPPED_BURNED_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(STRIPPED_BURNED_LOG));
		BURNED_PLANKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_planks"), new BlockItem(CalmoverseModBlocks.BURNED_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_PLANKS));
		BURNED_FENCE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_fence"), new BlockItem(CalmoverseModBlocks.BURNED_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_FENCE));
		BURNED_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_slab"), new BlockItem(CalmoverseModBlocks.BURNED_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_SLAB));
		BURNED_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_stairs"), new BlockItem(CalmoverseModBlocks.BURNED_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_STAIRS));
		BURNED_FENCE_GATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_fence_gate"), new BlockItem(CalmoverseModBlocks.BURNED_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_FENCE_GATE));
		BURNED_BUTTON = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_button"), new BlockItem(CalmoverseModBlocks.BURNED_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_BUTTON));
		BURNED_PRESSURE_PLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_pressure_plate"), new BlockItem(CalmoverseModBlocks.BURNED_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_PRESSURE_PLATE));
		BURNED_DOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_door"), new BlockItem(CalmoverseModBlocks.BURNED_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_DOOR));
		BURNED_TRAP_DOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_trap_door"), new BlockItem(CalmoverseModBlocks.BURNED_TRAP_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_TRAP_DOOR));
		FLAIMING_ROOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "flaiming_roots"), new BlockItem(CalmoverseModBlocks.FLAIMING_ROOTS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(FLAIMING_ROOTS));
		FLAMES_TEAR_STONE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "flames_tear_stone"), new BlockItem(CalmoverseModBlocks.FLAMES_TEAR_STONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(FLAMES_TEAR_STONE));
		FLAME_OROSE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "flame_orose"), new BlockItem(CalmoverseModBlocks.FLAME_OROSE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(FLAME_OROSE));
		GLOBE_FLOWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "globe_flower"), new BlockItem(CalmoverseModBlocks.GLOBE_FLOWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(GLOBE_FLOWER));
		SOUL_MAPLE_LEAVES = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_maple_leaves"), new BlockItem(CalmoverseModBlocks.SOUL_MAPLE_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(SOUL_MAPLE_LEAVES));
		GEYSER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "geyser"), new BlockItem(CalmoverseModBlocks.GEYSER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(GEYSER));
		IGNIY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "igniy"), new BlockItem(CalmoverseModBlocks.IGNIY, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(IGNIY));
		ASH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "ash"), new BlockItem(CalmoverseModBlocks.ASH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(ASH));
		OVERHEATED_ASH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "overheated_ash"), new BlockItem(CalmoverseModBlocks.OVERHEATED_ASH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(OVERHEATED_ASH));
		HEATED_ASH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "heated_ash"), new BlockItem(CalmoverseModBlocks.HEATED_ASH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(HEATED_ASH));
		FOSSILS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "fossils"), new BlockItem(CalmoverseModBlocks.FOSSILS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(FOSSILS));
		BURNED_VALLEY_PORTAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "burned_valley_portal"), new BlockItem(CalmoverseModBlocks.BURNED_VALLEY_PORTAL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CalmoverseModTabs.TAB_CALM_O_VERSE).register(content -> content.accept(BURNED_VALLEY_PORTAL));
		SOUL_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_armor_helmet"), new SoulArmorItem.Helmet());
		SOUL_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_armor_chestplate"), new SoulArmorItem.Chestplate());
		SOUL_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_armor_leggings"), new SoulArmorItem.Leggings());
		SOUL_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CalmoverseMod.MODID, "soul_armor_boots"), new SoulArmorItem.Boots());
	}

	public static void clientLoad() {
	}
}
