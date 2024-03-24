
package net.mcreator.calmoverse.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.calmoverse.entity.SoulEntity;
import net.mcreator.calmoverse.client.model.ModelSoul;

public class SoulRenderer extends MobRenderer<SoulEntity, ModelSoul<SoulEntity>> {
	public SoulRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSoul(context.bakeLayer(ModelSoul.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoulEntity entity) {
		return new ResourceLocation("calmoverse:textures/entities/soultex.png");
	}

}
