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



//package com.devsuperior.dslist.entities;
//
//
//import jakarta.persistence.Embedded;
//import jakarta.persistence.EmbeddedId;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//import java.util.Objects;
//
//// configurando a tabela
//@Entity
//@Table(name = "tb_belonging")
//
////classe que fica no meio do relacionamento muitos para muitos (tabela de associação)
//public class Belonging {
//
//    // preciso ter uma referencia para o game
//    //private Game game;
//    // uma referencia para a lista
//    //private GameList list;
//    // dado adicional (posição)
//    // por fim vou usar a classe belonginPK para usar a chave estrangeira
//    // como composição das chaves primarias das tabelas Game e GameList
//
//    @EmbeddedId // mesmo encapsulamento usado na classe BelongingPK
//    private BelongingPK id;
//
//    private Integer position;
//
//    // construtor vazio
//    public Belonging() {
//    }
//
//    //generation construtore in fields
//
//    // o belonging tem que ter uma associação pro game e o gameList
//    public Belonging(Game game, GameList list, Integer position) {
//        id.setGame(game);
//        id.setList(list);
//        this.position = position;
//    }
//
//    //getter e setters
//
//    public BelongingPK getId() {
//        return id;
//    }
//
//    public void setId(BelongingPK id) {
//        this.id = id;
//    }
//
//    public Integer getPosition() {
//        return position;
//    }
//
//    public void setPosition(Integer position) {
//        this.position = position;
//    }
//
//    //hashCode e equals
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
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
//        Belonging other = (Belonging) obj;
//        return Objects.equals(id, other.id);
//    }
//}
//
