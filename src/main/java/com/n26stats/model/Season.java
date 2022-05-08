package com.n26stats.model;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Contains main info about {@link Tournament}'s season.
 *
 * @author Ilya Ryabukhin
 * @since 15.04.2022
 */
@Entity
public class Season {

  public enum Division {PLCH_FIRST, PLCH_SECOND, PLCH_THIRD}

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Division division;

  private LocalDate startDate;

  private LocalDate endDate;

  private Tournament tournament;

  private LocalDate created;

  private Principal creator;

  private LocalDate edited;

  private Principal editor;

  private LocalDate removed;

  private Principal remover;

  public Season() {
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

  public Division getDivision() {
    return division;
  }

  public void setDivision(Division division) {
    this.division = division;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Tournament getTournament() {
    return tournament;
  }

  public void setTournament(Tournament tournament) {
    this.tournament = tournament;
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
