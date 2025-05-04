package br.com.lojavirtual.database;

import jakarta.persistence.*;

@Entity
@Table
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeFabricante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
}
