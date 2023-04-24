package net.novauniverse.games.tnttag.game.event;

import java.util.List;
import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TNTTagRoundEndEvent extends Event {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	private final List<UUID> eliminatedPlayers;

	public TNTTagRoundEndEvent(List<UUID> eliminatedPlayers) {
		this.eliminatedPlayers = eliminatedPlayers;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	public List<UUID> getEliminatedPlayers() {
		return eliminatedPlayers;
	}
}