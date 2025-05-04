package br.com.lojavirtual.database;

import jakarta.persistence.*;

@Entity
@Table
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDoModelo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fabricante_Modelo", referencedColumnName = "id")
    private Fabricante fabricante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
