package br.com.lojavirtual.database;

import java.time.LocalDate;

public class Produto {
    private long id;
    private TipoProduto tipoProduto;
    private Fabricante fabricante;
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
