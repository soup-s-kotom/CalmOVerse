
package net.mcreator.calmoverse.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.calmoverse.entity.AstralSlimeEntity;
import net.mcreator.calmoverse.client.model.Modelmodel;

import com.mojang.blaze3d.vertex.PoseStack;

public class AstralSlimeRenderer extends MobRenderer<AstralSlimeEntity, Modelmodel<AstralSlimeEntity>> {
	public AstralSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodel(context.bakeLayer(Modelmodel.LAYER_LOCATION)), 0.7f);
	}

	@Override
	protected void scale(AstralSlimeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(AstralSlimeEntity entity) {
		return new ResourceLocation("calmoverse:textures/entities/texture.png");
	}

}
