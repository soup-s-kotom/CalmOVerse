
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calmoverse.init;

import net.mcreator.calmoverse.procedures.TimerProcedure;
import net.mcreator.calmoverse.procedures.SoulmappleleavesUpdateTickProcedure;
import net.mcreator.calmoverse.procedures.SoulArmorBootsTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CalmoverseModProcedures {
	public static void load() {
		new TimerProcedure();
		new SoulmappleleavesUpdateTickProcedure();
		new SoulArmorBootsTickProcedure();
	}
}
