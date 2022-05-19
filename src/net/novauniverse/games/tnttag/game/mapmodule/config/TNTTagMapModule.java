package net.novauniverse.games.tnttag.game.mapmodule.config;

import org.json.JSONObject;

import net.zeeraa.novacore.spigot.gameengine.module.modules.game.map.mapmodule.MapModule;

public class TNTTagMapModule extends MapModule {
	private int roundTime;
	
	public TNTTagMapModule(JSONObject json) {
		super(json);
		if(json.has("round_time")) {
			this.roundTime = json.getInt("round_time");
		} else {
			this.roundTime = 60 * 2;
		}
	}
	
	public int getRoundTime() {
		return roundTime;
	}
}