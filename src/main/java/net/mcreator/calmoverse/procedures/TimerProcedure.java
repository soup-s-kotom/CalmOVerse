package net.mcreator.calmoverse.procedures;

import net.mcreator.calmoverse.network.CalmoverseModVariables;

public class TimerProcedure {
	public static void execute() {
		if (CalmoverseModVariables.CVTime == 20) {
			CalmoverseModVariables.CVTime = 0;
		} else {
			CalmoverseModVariables.CVTime = CalmoverseModVariables.CVTime + 1;
		}
	}
}
