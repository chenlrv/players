package com.intuit.player.data.service;

import com.intuit.player.data.entity.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerDataService
{
    List<Player> findAll();

    Optional<Player> findById(String id);
}
