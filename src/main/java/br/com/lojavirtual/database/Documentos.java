package br.com.lojavirtual.database;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "documentos")
public class Documentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_de_documento_id")
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
