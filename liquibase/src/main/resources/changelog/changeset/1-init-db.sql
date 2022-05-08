--liquibase formatted sql

--changeset Ilya Ryabukhin:1
create TABLE principal (
  id UUID NOT NULL,
  name VARCHAR NOT NULL,
  CONSTRAINT principal_id_pkey PRIMARY KEY (id)
);

create TABLE team (
  id UUID NOT NULL,
  name VARCHAR NOT NULL,
  side VARCHAR NOT NULL,
  birthday TIMESTAMP,
  created TIMESTAMP NOT NULL,
  creator UUID NOT NULL,
  edited TIMESTAMP,
  editor UUID,
  removed TIMESTAMP,
  remover UUID,
  CONSTRAINT team_id_pkey PRIMARY KEY (id),
  CONSTRAINT creator_fkey FOREIGN KEY (creator)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT editor_fkey FOREIGN KEY (editor)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT remover_fkey FOREIGN KEY (remover)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
);

create TABLE tournament (
  id UUID NOT NULL,
  name VARCHAR NOT NULL,
  created TIMESTAMP NOT NULL,
  creator UUID NOT NULL,
  edited TIMESTAMP,
  editor UUID,
  removed TIMESTAMP,
  remover UUID,
  CONSTRAINT tournament_id_pkey PRIMARY KEY (id),
  CONSTRAINT creator_fkey FOREIGN KEY (creator)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT editor_fkey FOREIGN KEY (editor)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT remover_fkey FOREIGN KEY (remover)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
);

create TABLE season (
  id UUID NOT NULL,
  name VARCHAR NOT NULL,
  division VARCHAR NOT NULL,
  start_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NOT NULL,
  tournament UUID NOT NULL,
  created TIMESTAMP NOT NULL,
  creator UUID NOT NULL,
  edited TIMESTAMP,
  editor UUID,
  removed TIMESTAMP,
  remover UUID,
  CONSTRAINT season_id_pkey PRIMARY KEY (id),
  CONSTRAINT tournament_fkey FOREIGN KEY (tournament)
        REFERENCES tournament (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT creator_fkey FOREIGN KEY (creator)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT editor_fkey FOREIGN KEY (editor)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT remover_fkey FOREIGN KEY (remover)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
);

create TABLE game (
  id UUID NOT NULL,
  nevsky_team UUID NOT NULL,
  opposite_team UUID NOT NULL,
  nevsky_goals INT NOT NULL,
  opposite_goals INT NOT NULL,
  place VARCHAR NOT NULL,
  dateTime TIMESTAMP NOT NULL,
  referee VARCHAR NOT NULL,
  tournament UUID NOT NULL,
  season UUID NOT NULL,
  created TIMESTAMP NOT NULL,
  creator UUID NOT NULL,
  edited TIMESTAMP,
  editor UUID,
  removed TIMESTAMP,
  remover UUID,
  CONSTRAINT game_id_pkey PRIMARY KEY (id),
  CONSTRAINT nevsky_team_fkey FOREIGN KEY (nevsky_team)
    REFERENCES team (id)
    ON UPDATE RESTRICT
    ON DELETE CASCADE,
  CONSTRAINT opposite_team_fkey FOREIGN KEY (opposite_team)
      REFERENCES team (id)
      ON UPDATE RESTRICT
      ON DELETE CASCADE,
  CONSTRAINT tournament_fkey FOREIGN KEY (tournament)
        REFERENCES tournament (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT season_fkey FOREIGN KEY (season)
        REFERENCES season (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT creator_fkey FOREIGN KEY (creator)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT editor_fkey FOREIGN KEY (editor)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT remover_fkey FOREIGN KEY (remover)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
);

create TABLE player (
  id UUID NOT NULL,
  name VARCHAR NOT NULL,
  birthday TIMESTAMP,
  games INT NOT NULL,
  goals INT NOT NULL,
  assists INT NOT NULL,
  yellow_cards INT NOT NULL,
  red_cards INT NOT NULL,
  first_star INT NOT NULL,
  second_star INT NOT NULL,
  is_active BOOL NOT NULL,
  created TIMESTAMP NOT NULL,
  creator UUID NOT NULL,
  edited TIMESTAMP,
  editor UUID,
  removed TIMESTAMP,
  remover UUID,
  CONSTRAINT player_id_pkey PRIMARY KEY (id),
  CONSTRAINT creator_fkey FOREIGN KEY (creator)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT editor_fkey FOREIGN KEY (editor)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE,
  CONSTRAINT remover_fkey FOREIGN KEY (remover)
        REFERENCES principal (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
);

create TABLE participance (
  id UUID NOT NULL,
  player UUID NOT NULL,
  game UUID NOT NULL,
  goals INT NOT NULL,
  assists INT NOT NULL,
  yellow_cards INT NOT NULL,
  red_cards INT NOT NULL,
  is_first_star BOOL NOT NULL,
  is_second_star BOOL NOT NULL,
  CONSTRAINT participance_id_pkey PRIMARY KEY (id),
  CONSTRAINT player_fkey FOREIGN KEY (player)
    REFERENCES player (id)
    ON UPDATE RESTRICT
    ON DELETE CASCADE,
  CONSTRAINT game_fkey FOREIGN KEY (game)
      REFERENCES game (id)
      ON UPDATE RESTRICT
      ON DELETE CASCADE
);