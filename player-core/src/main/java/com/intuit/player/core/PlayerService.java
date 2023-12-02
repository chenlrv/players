package com.intuit.player.core;

import com.intuit.player.data.service.IPlayerDataService;
import com.intuit.player.data.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService implements IPlayerService
{
    @Autowired
    private IPlayerDataService dataService;

    @Override
    public List<Player> getPlayers()
    {
        return dataService.findAll();
    }

    @Override
    public Optional<Player> getPlayerById(String playerId)
    {
        return dataService.findById(playerId);
    }
}
