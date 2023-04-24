package net.novauniverse.games.tnttag.game.event;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TNTTagPlayerTaggedEvent extends Event {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	protected final Player taggedPlayer;
	@Nullable
	protected final Player attacker;

	public TNTTagPlayerTaggedEvent(Player taggedPlayer, @Nullable Player attacker) {
		this.taggedPlayer = taggedPlayer;
		this.attacker = attacker;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	@Nullable
	public Player getAttacker() {
		return attacker;
	}

	public Player getTaggedPlayer() {
		return taggedPlayer;
	}
}