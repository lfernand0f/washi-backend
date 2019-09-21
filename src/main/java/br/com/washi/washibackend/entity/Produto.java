package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_PRODUTO")
@Entity
public class Produto {

    @Id
    @Column(name = "PDTCOD")
    private int codigo;

    @Column(name = "PDTDES", length = 100)
    private String descricao;

    @Column(name = "PDTVLR")
    private double produto;

    @Column(name = "PDTIOFVLR")
    private double iof;

    @OneToMany(mappedBy = "produto")
    private List<Solicitacao> solicitacoes;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getProduto() {
        return produto;
    }

    public double getIof() {
        return iof;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProduto(double produto) {
        this.produto = produto;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}