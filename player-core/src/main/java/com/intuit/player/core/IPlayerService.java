package com.intuit.player.core;

import com.intuit.player.data.entity.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService
{
    List<Player> getPlayers();

    Optional<Player> getPlayerById(String playerId);
}
