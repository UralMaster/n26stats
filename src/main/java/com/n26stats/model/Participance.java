package com.n26stats.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participance {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;

  private Player player;

  private Game game;

  private int goals;

  private int assists;

  private int yellowCards;

  private int redCards;

  private boolean isFirstStar;

  private boolean isSecondStar;

  public Participance() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) {
    this.goals = goals;
  }

  public int getAssists() {
    return assists;
  }

  public void setAssists(int assists) {
    this.assists = assists;
  }

  public int getYellowCards() {
    return yellowCards;
  }

  public void setYellowCards(int yellowCards) {
    this.yellowCards = yellowCards;
  }

  public int getRedCards() {
    return redCards;
  }

  public void setRedCards(int redCards) {
    this.redCards = redCards;
  }

  public boolean isFirstStar() {
    return isFirstStar;
  }

  public void setFirstStar(boolean firstStar) {
    isFirstStar = firstStar;
  }

  public boolean isSecondStar() {
    return isSecondStar;
  }

  public void setSecondStar(boolean secondStar) {
    isSecondStar = secondStar;
  }
}
