package net.novauniverse.games.tnttag.game.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerKilledPlayerInTNTTagEvent extends Event {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	private OfflinePlayer killer;
	private OfflinePlayer killedPlayer;

	public PlayerKilledPlayerInTNTTagEvent(OfflinePlayer killer, OfflinePlayer killedPlayer) {
		this.killer = killer;
		this.killedPlayer = killedPlayer;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	public OfflinePlayer getKiller() {
		return killer;
	}

	public OfflinePlayer getKilledPlayer() {
		return killedPlayer;
	}
}