package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public GameList() {
    }

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof GameList)) return false;
        GameList other = (GameList) obj;
        return Objects.equals(id, other.id);
    }
}




//package com.devsuperior.dslist.entities;
//
//import jakarta.persistence.*;
//
//import java.util.Objects;
//
//@Entity
//@Table(name = "tb_game_list")
//
////criando a classe GameList no pacote entities
//public class GameList {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    // quais são os campos?
//    private Long id;
//    private String name;
//
//    //construtor vazio para ter opção de instanciar um objeto
//    // sem precisar informar nada pra ele
//    public GameList() {
//    }
//
//    //construtor que ja passa os argumentos (generation construtores in field)
//    public GameList(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    // getters end setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // fazer o equals e hashCode( generetion override methods ) para que eu possa comparar
//    // um gameList com o outro
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        GameList other = (GameList) obj;
//        return Objects.equals(id, other.id);
//    }
//}
