package com.intuit.player.data.mapper;

import com.intuit.player.data.entity.Player;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.function.Function;

@Component
public class PlayerMapper
{
    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd" ))
            .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy" ))
            .toFormatter();

    public Player map(List<String> list)
    {
        return new Player(
                list.get(0),
                convert(list.get(1), Integer::parseInt),
                convert(list.get(2), Integer::parseInt),
                convert(list.get(3), Integer::parseInt),
                convert(list.get(4), s -> s),
                convert(list.get(5), s -> s),
                convert(list.get(6), s -> s),
                convert(list.get(7), Integer::parseInt),
                convert(list.get(8), Integer::parseInt),
                convert(list.get(9), Integer::parseInt),
                convert(list.get(10), s -> s),
                convert(list.get(11), s -> s),
                convert(list.get(12), s -> s),
                convert(list.get(13), s -> s),
                convert(list.get(14), s -> s),
                convert(list.get(15), s -> s),
                convert(list.get(16), Integer::parseInt),
                convert(list.get(17), Integer::parseInt),
                convert(list.get(18), s -> s),
                convert(list.get(19), s -> s),
                convert(list.get(20), s -> LocalDate.parse(s, DATE_TIME_FORMATTER)),
                convert(list.get(21), s -> LocalDate.parse(s, DATE_TIME_FORMATTER)),
                convert(list.get(22), s -> s),
                convert(list.get(23), s -> s));
    }

    private <T> T convert(String s, Function<String, T> function)
    {
        return Strings.isBlank(s) ? null : function.apply(s);
    }
}
