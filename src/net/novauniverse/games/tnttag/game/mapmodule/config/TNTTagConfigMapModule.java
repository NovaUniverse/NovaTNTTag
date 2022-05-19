package net.novauniverse.games.tnttag.game.mapmodule.config;

import org.json.JSONObject;

import net.zeeraa.novacore.spigot.gameengine.module.modules.game.map.mapmodule.MapModule;

public class TNTTagConfigMapModule extends MapModule {
	private int roundTime;
	private int toTagDivision;

	public TNTTagConfigMapModule(JSONObject json) {
		super(json);
		if (json.has("round_time")) {
			this.roundTime = json.getInt("round_time");
		} else {
			this.roundTime = 60 * 2;
		}

		if (json.has("to_tag_division")) {
			this.toTagDivision = json.getInt("to_tag_division");
		} else {
			this.toTagDivision = 3;
		}
	}

	public int getRoundTime() {
		return roundTime;
	}

	public int getToTagDivision() {
		return toTagDivision;
	}
}