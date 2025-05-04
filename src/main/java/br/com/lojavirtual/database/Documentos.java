package br.com.lojavirtual.database;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Documentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private TipoDeDocumento tipoDeDocumento;
    private String numeroDocumento;
    private LocalDate dataDeExpedicao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getDataDeExpedicao() {
        return dataDeExpedicao;
    }

    public void setDataDeExpedicao(LocalDate dataDeExpedicao) {
        this.dataDeExpedicao = dataDeExpedicao;
    }
}
