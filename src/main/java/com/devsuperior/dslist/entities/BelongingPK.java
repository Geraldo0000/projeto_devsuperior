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






//package com.devsuperior.dslist.entities;
//
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//
//import java.util.Objects;
//
//// configurando o ID
//@Embeddable // estou encapsulando 2 atributos em uma só classe (BelonginPK)
//public class BelongingPK {
//    // vou colocar uma configuração da JPA par fazer o
//    // mapeamento do objeto relacional juntando as duas classe: Game e GameList
//    @ManyToOne
//    @JoinColumn(name = "game_id") // configurando o nome da chave estrangeira
//    private Game game;
//
//    @JoinColumn(name = "list_id") // configurando o nome da chave estrangeira
//    private GameList list;
//
//    //construtor da classe BelonginPK
//    public BelongingPK() {
//    }
//
//    public BelongingPK(Game game, GameList list) {
//        this.game = game;
//        this.list = list;
//    }
//
//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//
//    public GameList getList() {
//        return list;
//    }
//
//    public void setList(GameList list) {
//        this.list = list;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(game, list);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        BelongingPK other = (BelongingPK) obj;
//        return Objects.equals(game, other.game) && Objects.equals(list, other.list);
//    }
//}
