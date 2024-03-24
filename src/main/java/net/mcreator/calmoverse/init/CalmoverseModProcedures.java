
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.mcreator.calmoverse.procedures.TimerProcedure;
import net.mcreator.calmoverse.procedures.SoulmappleleavesUpdateTickProcedure;
import net.mcreator.calmoverse.procedures.SoulStaffRightclickedProcedure;
import net.mcreator.calmoverse.procedures.SoulStaffItemInHandTickProcedure;
import net.mcreator.calmoverse.procedures.SoulArmorBootsTickProcedure;
import net.mcreator.calmoverse.procedures.ReactiveGloveRightClickProcedure;
import net.mcreator.calmoverse.procedures.EntityWalksOnGeyserProcedure;
import net.mcreator.calmoverse.procedures.BurnedValleyPortalTpToBurnedWalleyProcedure;
import net.mcreator.calmoverse.procedures.AstralSlimeJumpConstantlyProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CalmoverseModProcedures {
	public static void load() {
		new TimerProcedure();
		new SoulmappleleavesUpdateTickProcedure();
		new SoulArmorBootsTickProcedure();
		new ReactiveGloveRightClickProcedure();
		new SoulStaffItemInHandTickProcedure();
		new BurnedValleyPortalTpToBurnedWalleyProcedure();
		new EntityWalksOnGeyserProcedure();
		new SoulStaffRightclickedProcedure();
		new AstralSlimeJumpConstantlyProcedure();
	}
}
