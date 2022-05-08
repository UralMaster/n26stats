package com.n26stats.model;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Contains main info about player.
 *
 * @author Ilya Ryabukhin
 * @since 15.04.2022
 */
@Entity
public class Player {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;

  private String name;

  private LocalDate birthday;

  private int games;

  private int goals;

  private int assists;

  private int yellowCards;

  private int redCards;

  private int firstStar;

  private int secondStar;

  private boolean isActive;

  private LocalDate created;

  private Principal creator;

  private LocalDate edited;

  private Principal editor;

  private LocalDate removed;

  private Principal remover;

  public Player() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public int getGames() {
    return games;
  }

  public void setGames(int games) {
    this.games = games;
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

  public int getFirstStar() {
    return firstStar;
  }

  public void setFirstStar(int firstStar) {
    this.firstStar = firstStar;
  }

  public int getSecondStar() {
    return secondStar;
  }

  public void setSecondStar(int secondStar) {
    this.secondStar = secondStar;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    this.isActive = active;
  }

  public LocalDate getCreated() {
    return created;
  }

  public void setCreated(LocalDate created) {
    this.created = created;
  }

  public Principal getCreator() {
    return creator;
  }

  public void setCreator(Principal creator) {
    this.creator = creator;
  }

  public LocalDate getEdited() {
    return edited;
  }

  public void setEdited(LocalDate edited) {
    this.edited = edited;
  }

  public Principal getEditor() {
    return editor;
  }

  public void setEditor(Principal editor) {
    this.editor = editor;
  }

  public LocalDate getRemoved() {
    return removed;
  }

  public void setRemoved(LocalDate removed) {
    this.removed = removed;
  }

  public Principal getRemover() {
    return remover;
  }

  public void setRemover(Principal remover) {
    this.remover = remover;
  }

}
