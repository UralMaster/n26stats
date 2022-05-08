package com.n26stats.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Contains main info about authenticated application user.
 *
 * @author Ilya Ryabukhin
 * @since 15.04.2022
 */
@Entity
public class Principal {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private UUID id;

  private String name;

  public Principal() {
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

}
