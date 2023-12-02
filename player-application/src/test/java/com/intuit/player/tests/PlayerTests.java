package com.intuit.player.tests;

import com.intuit.player.data.entity.Player;
import com.intuit.player.data.service.IPlayerDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = TestsConfiguration.class)
@ActiveProfiles("test")
public class PlayerTests
{
    @Autowired
    private IPlayerDataService dataService;

    @Test
    public void getPlayerByIdExists()
    {
        Optional<Player> p1 = dataService.findById("aardsda01");
        assertTrue(p1.isPresent());

        Player p2 = new Player(
                "aardsda01",
                1981,
                12,
                27,
                "USA",
                "CO",
                "Denver",
                null,
                null,
                null,
                null,
                null,
                null,
                "David",
                "Aardsma",
                "David Allan",
                215,
                75,
                "R",
                "R",
                LocalDate.parse("2004-04-06"),
                LocalDate.parse("2015-08-23"),
                "aardd001",
                "aardsda01");

        assertEquals(p1.get(), p2);
    }

    @Test
    public void getPlayerByIdNotExists()
    {
        Optional<Player> p = dataService.findById("abvc");
        assertTrue(p.isEmpty());
    }

    @Test
    public void getAllPlayers()
    {
        List<Player> l1 = dataService.findAll();
        assertEquals(2, l1.size());

        List<Player> l2 = List.of(
                getFirstPlayer(),
                getSecondPlayer());
        assertEquals(l1, l2);
    }

    //TODO: add additional tests

    private Player getFirstPlayer()
    {
       return new Player(
                "aardsda01",
                1981,
                12,
                27,
                "USA",
                "CO",
                "Denver",
                null,
                null,
                null,
                null,
                null,
                null,
                "David",
                "Aardsma",
                "David Allan",
                215,
                75,
                "R",
                "R",
                LocalDate.parse("2004-04-06"),
                LocalDate.parse("2015-08-23"),
                "aardd001",
                "aardsda01");
    }

    private Player getSecondPlayer()
    {
        return new Player(
                "aaronha01",
                1934,
                2,
                5,
                "USA",
                "AL",
                "Mobile",
                null,
                null,
                null,
                null,
                null,
                null,
                "Hank",
                "Aaron",
                "Henry Louis",
                180,
                72,
                "R",
                "R",
                LocalDate.parse("1954-04-13"),
                LocalDate.parse("1976-10-03"),
                "aaroh101",
                "aaronha01");
    }
}