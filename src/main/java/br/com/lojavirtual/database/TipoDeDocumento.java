package br.com.lojavirtual.database;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tipoDeDocumento")
public class TipoDeDocumento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tipoDeDocumento;
    private String descricao;

    @OneToOne(mappedBy = "tipoDeDocumento")
    private Documentos documentos;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
