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
 * Contains main info about team.
 *
 * @author Ilya Ryabukhin
 * @since 15.04.2022
 */
@Entity
public class Team {

  public enum GameSide {NEVSKY, OTHER}

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;

  private String name;

  @Enumerated(EnumType.STRING)
  private GameSide side;

  private LocalDate birthday;

  private LocalDate created;

  private Principal creator;

  private LocalDate edited;

  private Principal editor;

  private LocalDate removed;

  private Principal remover;

  public Team() {
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

  public GameSide getSide() {
    return side;
  }

  public void setSide(GameSide side) {
    this.side = side;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
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
