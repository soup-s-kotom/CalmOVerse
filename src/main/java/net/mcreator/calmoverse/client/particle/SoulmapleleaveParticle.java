
package net.mcreator.calmoverse.client.particle;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class SoulmapleleaveParticle extends TextureSheetParticle {
	public static SoulmapleleaveParticleProvider provider(SpriteSet spriteSet) {
		return new SoulmapleleaveParticleProvider(spriteSet);
	}

	public static class SoulmapleleaveParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public SoulmapleleaveParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new SoulmapleleaveParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected SoulmapleleaveParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize((float) 0.2, (float) 0.2);
		this.quadSize *= (float) 1.3;
		this.lifetime = (int) Math.max(1, 7 + (this.random.nextInt(2) - 1));
		this.gravity = (float) 0.3;
		this.hasPhysics = true;
		this.xd = vx * 0.3;
		this.yd = vy * 0.3;
		this.zd = vz * 0.3;
		this.angularVelocity = (float) 0.3;
		this.angularAcceleration = (float) 0.14;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;
	}
}
