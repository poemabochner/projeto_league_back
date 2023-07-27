package br.info4.league.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "habilidade")

public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habilidade")
    private Long idHabilidade;

    @NotBlank
    @Column(name = "tecla_habilidade", nullable = false, length = 15, unique = false)
    private String teclaHabilidade;

    @NotBlank
    @Column(name = "nome_habilidade", nullable = false, length = 100, unique = false)
    private String nomeHabilidade;

    @NotBlank
    @Column(name = "descricao_habilidade", nullable = false, length = 255, unique = false)
    private String descricaoHabilidade;

    @ManyToOne
    @JoinColumn(name = "id_campeao")
    private Campeao campeao;

    
    public Habilidade(Long idHabilidade, @NotBlank String teclaHabilidade, @NotBlank String nomeHabilidade,
            @NotBlank String descricaoHabilidade, Campeao campeao) {
        this.idHabilidade = idHabilidade;
        this.teclaHabilidade = teclaHabilidade;
        this.nomeHabilidade = nomeHabilidade;
        this.descricaoHabilidade = descricaoHabilidade;
        this.campeao = campeao;
    }

    public Habilidade() {
    }

    public Long getIdHabilidade() {
        return idHabilidade;
    }

    public void setIdHabilidade(Long idHabilidade) {
        this.idHabilidade = idHabilidade;
    }

    public String getTeclaHabilidade() {
        return teclaHabilidade;
    }

    public void setTeclaHabilidade(String teclaHabilidade) {
        this.teclaHabilidade = teclaHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public String getDescricaoHabilidade() {
        return descricaoHabilidade;
    }

    public void setDescricaoHabilidade(String descricaoHabilidade) {
        this.descricaoHabilidade = descricaoHabilidade;
    }

    public Campeao getCampeao() {
        return campeao;
    }

    public void setCampeao(Campeao campeao) {
        this.campeao = campeao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idHabilidade == null) ? 0 : idHabilidade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Habilidade other = (Habilidade) obj;
        if (idHabilidade == null) {
            if (other.idHabilidade != null)
                return false;
        } else if (!idHabilidade.equals(other.idHabilidade))
            return false;
        return true;
    }

}
