package com.n26stats.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Contains main info about particular game.
 *
 * @author Ilya Ryabukhin
 * @since 15.04.2022
 */
@Entity
public class Game {

  public enum GamePlace{FABRICA, COSMOS, KRASNOPUTILOVSKAYA, DACHNOYE}

  public enum Referee{PRISYAZHNYUK, KAZAKOV}

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private UUID id;

  private Team nevskyTeam;

  private Team oppositeTeam;

  private int nevskyGoals;

  private int oppositeGoals;

  @Enumerated(EnumType.STRING)
  private GamePlace place;

  private LocalDateTime dateTime;

  @Enumerated(EnumType.STRING)
  private Referee referee;

  private Tournament tournament;

  private Season season;

  private LocalDate created;

  private Principal creator;

  private LocalDate edited;

  private Principal editor;

  private LocalDate removed;

  private Principal remover;

  public Game() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Team getNevskyTeam() {
    return nevskyTeam;
  }

  public void setNevskyTeam(Team nevskyTeam) {
    this.nevskyTeam = nevskyTeam;
  }

  public Team getOppositeTeam() {
    return oppositeTeam;
  }

  public void setOppositeTeam(Team oppositeTeam) {
    this.oppositeTeam = oppositeTeam;
  }

  public int getNevskyGoals() {
    return nevskyGoals;
  }

  public void setNevskyGoals(int nevskyGoals) {
    this.nevskyGoals = nevskyGoals;
  }

  public int getOppositeGoals() {
    return oppositeGoals;
  }

  public void setOppositeGoals(int oppositeGoals) {
    this.oppositeGoals = oppositeGoals;
  }

  public GamePlace getPlace() {
    return place;
  }

  public void setPlace(GamePlace place) {
    this.place = place;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Referee getReferee() {
    return referee;
  }

  public void setReferee(Referee referee) {
    this.referee = referee;
  }

  public Tournament getTournament() {
    return tournament;
  }

  public void setTournament(Tournament tournament) {
    this.tournament = tournament;
  }

  public Season getSeason() {
    return season;
  }

  public void setSeason(Season season) {
    this.season = season;
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
