package net.novauniverse.games.tnttag.game.event;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TNTTagRoundStartEvent extends Event{
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	protected final List<Player> taggedPlayers;
	protected final int roundTime;

	public TNTTagRoundStartEvent(List<Player> taggedPlayers, int roundTime) {
		this.taggedPlayers = taggedPlayers;
		this.roundTime = roundTime;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	public List<Player> getTaggedPlayers() {
		return taggedPlayers;
	}
	
	public int getRoundTime() {
		return roundTime;
	}
}