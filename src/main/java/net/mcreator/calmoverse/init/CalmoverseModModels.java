
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.mcreator.calmoverse.client.model.Modelglobus;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CalmoverseModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelglobus.LAYER_LOCATION, Modelglobus::createBodyLayer);
	}
}
