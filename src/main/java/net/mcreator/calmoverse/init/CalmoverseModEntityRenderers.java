
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.mcreator.calmoverse.client.renderer.SoulRenderer;
import net.mcreator.calmoverse.client.renderer.AstralSlimeRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CalmoverseModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(CalmoverseModEntities.SOUL, SoulRenderer::new);
		EntityRendererRegistry.register(CalmoverseModEntities.ASTRAL_SLIME, AstralSlimeRenderer::new);
	}
}
