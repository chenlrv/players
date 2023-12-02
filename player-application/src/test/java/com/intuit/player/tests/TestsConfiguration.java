package com.intuit.player.tests;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.TestPropertySource;

@Profile("test")
@Configuration
@ComponentScan(basePackages = {"com.intuit.player"})
@TestPropertySource("classpath:application-test.properties")
@EnableAutoConfiguration
public class TestsConfiguration
{

}
