package com.androidmontreal.rhok;
import com.androidmontreal.rhok.WaterSupplyGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopClient {
	
	public static void main(String[] args) {
		LwjglApplication application = new LwjglApplication(new WaterSupplyGame(), "Game", 480, 320, false);
		int version = application.getVersion();
		System.out.println("version :" + version);
	}
	
}
