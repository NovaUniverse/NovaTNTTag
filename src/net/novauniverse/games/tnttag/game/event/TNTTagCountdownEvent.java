package net.novauniverse.games.tnttag.game.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TNTTagCountdownEvent extends Event {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	protected final int secondsLeft;

	public TNTTagCountdownEvent(int secondsLeft) {
		this.secondsLeft = secondsLeft;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}
	
	public int getSecondsLeft() {
		return secondsLeft;
	}
}