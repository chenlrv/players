package com.intuit.player.data.csv;

import com.intuit.player.data.entity.Player;
import com.intuit.player.data.mapper.PlayerMapper;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class CsvReader
{
    @Autowired
    private PlayerMapper mapper;

    public List<Player> readCsv(String filePath) throws Exception
    {
        List<Player> players = new LinkedList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath)))
        {
            List<String[]> records = reader.readAll();

            IntStream.range(1, records.size())
                    .boxed()
                    .forEach(i -> players.add(mapper.map(Arrays.stream(records.get(i)).toList())));

            return players;
        }
    }
}
