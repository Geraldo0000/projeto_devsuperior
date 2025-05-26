package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    @ManyToOne
    @MapsId("gameId")
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @MapsId("listId")
    @JoinColumn(name = "list_id")
    private GameList list;

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        this.game = game;
        this.list = list;
        this.position = position;
        this.id = new BelongingPK(game.getId(), list.getId());
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
        this.id.setGameId(game.getId());
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
        this.id.setListId(list.getId());
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Belonging)) return false;
        Belonging other = (Belonging) obj;
        return Objects.equals(id, other.id);
    }
}


