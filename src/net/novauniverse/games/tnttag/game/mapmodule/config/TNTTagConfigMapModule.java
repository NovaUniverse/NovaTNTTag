package net.novauniverse.games.tnttag.game.mapmodule.config;

import org.json.JSONObject;

import net.zeeraa.novacore.spigot.gameengine.module.modules.game.map.mapmodule.MapModule;

public class TNTTagConfigMapModule extends MapModule {
	private int roundTime;
	private int roundWaitingTime;
	private int toTagDivision;

	private boolean enableTrackers;

	private boolean enableSpeed;

	public TNTTagConfigMapModule(JSONObject json) {
		super(json);
		if (json.has("round_time")) {
			this.roundTime = json.getInt("round_time");
		} else {
			this.roundTime = 60 * 2;
		}

		if (json.has("round_waiting_time")) {
			this.roundWaitingTime = json.getInt("round_waiting_time");
		} else {
			this.roundWaitingTime = 10;
		}

		if (json.has("to_tag_division")) {
			this.toTagDivision = json.getInt("to_tag_division");
		} else {
			this.toTagDivision = 3;
		}

		if (json.has("enable_trackers")) {
			this.enableTrackers = json.getBoolean("enable_trackers");
		} else {
			this.enableTrackers = true;
		}

		if (json.has("enable_speed")) {
			this.enableSpeed = json.getBoolean("enable_speed");
		} else {
			this.enableSpeed = true;
		}
	}

	public int getRoundWaitingTime() {
		return roundWaitingTime;
	}

	public int getRoundTime() {
		return roundTime;
	}

	public int getToTagDivision() {
		return toTagDivision;
	}

	public boolean isEnableTrackers() {
		return enableTrackers;
	}

	public boolean isEnableSpeed() {
		return enableSpeed;
	}
}