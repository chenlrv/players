package com.intuit.player.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.intuit.player"})
@ComponentScan(basePackages = {"com.intuit.player"})
public class PlayerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(PlayerApplication.class, args);
    }
}
