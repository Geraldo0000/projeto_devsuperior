package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BelongingPK implements Serializable {

    private Long gameId;
    private Long listId;

    public BelongingPK() {
    }

    public BelongingPK(Long gameId, Long listId) {
        this.gameId = gameId;
        this.listId = listId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, listId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BelongingPK)) return false;
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(gameId, other.gameId) && Objects.equals(listId, other.listId);
    }
}




