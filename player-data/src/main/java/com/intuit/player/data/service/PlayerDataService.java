package com.intuit.player.data.service;

import com.intuit.player.data.csv.CsvReader;
import com.intuit.player.data.entity.Player;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PlayerDataService implements IPlayerDataService
{
    @Autowired
    private CsvReader reader;

    @Autowired
    private PlayerDataServiceConfiguration configuration;

    private Map<String, Player> data;

    @PostConstruct
    public void init() throws Exception
    {
        data = reader
                .readCsv(configuration.getFilePath())
                .stream()
                .collect(Collectors.toMap(Player::getId, Function.identity()));
    }

    @Override
    public List<Player> findAll()
    {
        return data.values().stream().toList();
    }

    @Override
    public Optional<Player> findById(String id)
    {
        return Optional.ofNullable(data.get(id));

    }
}
