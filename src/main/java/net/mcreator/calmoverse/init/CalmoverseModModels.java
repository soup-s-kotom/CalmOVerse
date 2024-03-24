
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.mcreator.calmoverse.client.model.Modelmodel;
import net.mcreator.calmoverse.client.model.ModelSoul;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CalmoverseModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(ModelSoul.LAYER_LOCATION, ModelSoul::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelmodel.LAYER_LOCATION, Modelmodel::createBodyLayer);
	}
}
