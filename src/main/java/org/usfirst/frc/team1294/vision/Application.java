package org.usfirst.frc.team1294.vision;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.loadLibrary("ntcore");
		NetworkTable.setClientMode();
		NetworkTable.setTeam(1294);
		NetworkTable visionTable = NetworkTable.getTable("vision");
	}

}
