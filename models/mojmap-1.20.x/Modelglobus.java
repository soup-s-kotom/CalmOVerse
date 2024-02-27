// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglobus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "globus"), "main");
	private final ModelPart right_leg;
	private final ModelPart body;
	private final ModelPart left_leg;

	public Modelglobus(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(16, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 19.0F, -1.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -15.0F, -6.0F, 12.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition flower_2 = body.addOrReplaceChild("flower_2", CubeListBuilder.create(),
				PartPose.offset(1.0F, -15.0F, 1.0F));

		PartDefinition cube_r1 = flower_2
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(30, 29).addBox(-2.5359F, -8.0F, -0.2679F, 5.0F, 8.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = flower_2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(30, 29).addBox(-2.3359F, -8.0F, -0.2679F, 5.0F, 8.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition flower_3 = body.addOrReplaceChild("flower_3", CubeListBuilder.create(),
				PartPose.offset(3.0F, -15.0F, -3.0F));

		PartDefinition cube_r3 = flower_3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(30, 29).addBox(-2.5359F, -8.0F, -0.2679F, 5.0F, 8.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r4 = flower_3
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(30, 29).addBox(-2.3359F, -8.0F, -0.2679F, 5.0F, 8.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition flower_1 = body.addOrReplaceChild("flower_1", CubeListBuilder.create(),
				PartPose.offset(-4.0F, -15.0F, -2.0F));

		PartDefinition cube_r5 = flower_1
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(30, 29).addBox(-2.3359F, -8.0F, -0.2679F, 5.0F, 8.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r6 = flower_1.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(30, 29).addBox(-2.3859F, -8.0F, -0.0081F, 5.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.0F, -0.6981F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 20)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 19.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}