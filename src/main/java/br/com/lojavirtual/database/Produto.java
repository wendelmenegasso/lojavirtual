package br.com.lojavirtual.database;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoProduto_Produto", referencedColumnName = "id")
    private TipoProduto tipoProduto;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fabricante_Produto", referencedColumnName = "id")
    private Fabricante fabricante;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "modelo_Produto", referencedColumnName = "id")
    private Modelo modelo;
    private LocalDate dataDaCriacao;
    private LocalDate dataDaAlteracao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public LocalDate getDataDaCriacao() {
        return dataDaCriacao;
    }

    public void setDataDaCriacao(LocalDate dataDaCriacao) {
        this.dataDaCriacao = dataDaCriacao;
    }

    public LocalDate getDataDaAlteracao() {
        return dataDaAlteracao;
    }

    public void setDataDaAlteracao(LocalDate dataDaAlteracao) {
        this.dataDaAlteracao = dataDaAlteracao;
    }
}
