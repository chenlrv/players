package com.intuit.player.data.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Player
{
    private String id;

    private Integer birthYear;

    private Integer birthMonth;

    private Integer birthDay;

    private String birthCountry;

    private String birthState;

    private String birthCity;

    private Integer deathYear;

    private Integer deathMonth;

    private Integer deathDay;

    private String deathCountry;

    private String deathState;

    private String deathCity;

    private String firstName;

    private String lastName;

    private String givenName;

    private Integer weight;

    private Integer height;

    private String batSide;

    private String throwSide;

    private LocalDate debut;

    private LocalDate finalGame;

    private String retroId;

    private String bbrefId;

    public Player()
    {
    }

    public Player(
            String id,
            Integer birthYear,
            Integer birthMonth,
            Integer birthDay,
            String birthCountry,
            String birthState,
            String birthCity,
            Integer deathYear,
            Integer deathMonth,
            Integer deathDay,
            String deathCountry,
            String deathState,
            String deathCity,
            String firstName,
            String lastName,
            String givenName,
            Integer weight,
            Integer height,
            String batSide,
            String throwSide,
            LocalDate debut,
            LocalDate finalGame,
            String retroId,
            String bbrefId)
    {
        this.id = id;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthCountry = birthCountry;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.deathYear = deathYear;
        this.deathMonth = deathMonth;
        this.deathDay = deathDay;
        this.deathCountry = deathCountry;
        this.deathState = deathState;
        this.deathCity = deathCity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.givenName = givenName;
        this.weight = weight;
        this.height = height;
        this.batSide = batSide;
        this.throwSide = throwSide;
        this.debut = debut;
        this.finalGame = finalGame;
        this.retroId = retroId;
        this.bbrefId = bbrefId;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Integer getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear)
    {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth()
    {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth)
    {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay)
    {
        this.birthDay = birthDay;
    }

    public String getBirthCountry()
    {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry)
    {
        this.birthCountry = birthCountry;
    }

    public String getBirthState()
    {
        return birthState;
    }

    public void setBirthState(String birthState)
    {
        this.birthState = birthState;
    }

    public String getBirthCity()
    {
        return birthCity;
    }

    public void setBirthCity(String birthCity)
    {
        this.birthCity = birthCity;
    }

    public Integer getDeathYear()
    {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear)
    {
        this.deathYear = deathYear;
    }

    public Integer getDeathMonth()
    {
        return deathMonth;
    }

    public void setDeathMonth(Integer deathMonth)
    {
        this.deathMonth = deathMonth;
    }

    public Integer getDeathDay()
    {
        return deathDay;
    }

    public void setDeathDay(Integer deathDay)
    {
        this.deathDay = deathDay;
    }

    public String getDeathCountry()
    {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry)
    {
        this.deathCountry = deathCountry;
    }

    public String getDeathState()
    {
        return deathState;
    }

    public void setDeathState(String deathState)
    {
        this.deathState = deathState;
    }

    public String getDeathCity()
    {
        return deathCity;
    }

    public void setDeathCity(String deathCity)
    {
        this.deathCity = deathCity;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getGivenName()
    {
        return givenName;
    }

    public void setGivenName(String givenName)
    {
        this.givenName = givenName;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight(Integer weight)
    {
        this.weight = weight;
    }

    public Integer getHeight()
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public String getBatSide()
    {
        return batSide;
    }

    public void setBatSide(String batSide)
    {
        this.batSide = batSide;
    }

    public String getThrowSide()
    {
        return throwSide;
    }

    public void setThrowSide(String throwSide)
    {
        this.throwSide = throwSide;
    }

    public LocalDate getDebut()
    {
        return debut;
    }

    public void setDebut(LocalDate debut)
    {
        this.debut = debut;
    }

    public LocalDate getFinalGame()
    {
        return finalGame;
    }

    public void setFinalGame(LocalDate finalGame)
    {
        this.finalGame = finalGame;
    }

    public String getRetroId()
    {
        return retroId;
    }

    public void setRetroId(String retroId)
    {
        this.retroId = retroId;
    }

    public String getBbrefId()
    {
        return bbrefId;
    }

    public void setBbrefId(String bbrefId)
    {
        this.bbrefId = bbrefId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(id, player.id) &&
                Objects.equals(birthYear, player.birthYear) &&
                Objects.equals(birthMonth, player.birthMonth) &&
                Objects.equals(birthDay, player.birthDay) &&
                Objects.equals(birthCountry, player.birthCountry) &&
                Objects.equals(birthState, player.birthState) &&
                Objects.equals(birthCity, player.birthCity) &&
                Objects.equals(deathYear, player.deathYear) &&
                Objects.equals(deathMonth, player.deathMonth) &&
                Objects.equals(deathDay, player.deathDay) &&
                Objects.equals(deathCountry, player.deathCountry) &&
                Objects.equals(deathState, player.deathState) &&
                Objects.equals(deathCity, player.deathCity) &&
                Objects.equals(firstName, player.firstName) &&
                Objects.equals(lastName, player.lastName) &&
                Objects.equals(givenName, player.givenName) &&
                Objects.equals(weight, player.weight) &&
                Objects.equals(height, player.height) &&
                Objects.equals(batSide, player.batSide) &&
                Objects.equals(throwSide, player.throwSide) &&
                Objects.equals(debut, player.debut) &&
                Objects.equals(finalGame, player.finalGame) &&
                Objects.equals(retroId, player.retroId) &&
                Objects.equals(bbrefId, player.bbrefId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                id,
                birthYear,
                birthMonth,
                birthDay,
                birthCountry,
                birthState,
                birthCity,
                deathYear,
                deathMonth,
                deathDay,
                deathCountry,
                deathState,
                deathCity,
                firstName,
                lastName,
                givenName,
                weight,
                height,
                batSide,
                throwSide,
                debut,
                finalGame,
                retroId,
                bbrefId);
    }
}


