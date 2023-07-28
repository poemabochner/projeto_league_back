package br.info4.league.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "campeao")

public class Campeao {

   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeao")  
    private Long idCampeao;

    @NotBlank
    @Column(name = "nome_campeao", nullable = false, length = 30, unique = false)
    private String nomeCampeao;

    @NotBlank
    @Column(name = "funcao_campeao", nullable = false, length = 30, unique = false)
    private String funcaoCampeao;

    @NotBlank
    @Column(name = "epiteto_campeao", nullable = false, length = 255, unique = false)
    private String epitetoCampeao;

    @NotBlank
    @Column(name = "dificuldade_campeao", nullable = false, length = 30, unique = false)
    private String dificuldadeCampeao;

    @NotBlank
    @Column(name = "url_imagem_campeao", nullable = false, length = 255, unique = false)
    private String urlImagemCampeao;

    @NotBlank
    @Column(name = "historia_campeao", nullable = false, length = 2048, unique = false)
    private String historiaCampeao;

    @OneToMany(mappedBy = "campeao", cascade = CascadeType.ALL)
    private List<Habilidade> listaHabilidade;

     public Campeao(Long idCampeao, @NotBlank String nomeCampeao, @NotBlank String funcaoCampeao,
            @NotBlank String epitetoCampeao, @NotBlank String dificuldadeCampeao, @NotBlank String urlImagemCampeao,
            @NotBlank String historiaCampeao, List<Habilidade> listaHabilidade) {
        this.idCampeao = idCampeao;
        this.nomeCampeao = nomeCampeao;
        this.funcaoCampeao = funcaoCampeao;
        this.epitetoCampeao = epitetoCampeao;
        this.dificuldadeCampeao = dificuldadeCampeao;
        this.urlImagemCampeao = urlImagemCampeao;
        this.historiaCampeao = historiaCampeao;
        this.listaHabilidade = listaHabilidade;
    }

    public Campeao() {
    }

    public Long getIdCampeao() {
        return idCampeao;
    }

    public void setIdCampeao(Long idCampeao) {
        this.idCampeao = idCampeao;
    }

    public String getNomeCampeao() {
        return nomeCampeao;
    }

    public void setNomeCampeao(String nomeCampeao) {
        this.nomeCampeao = nomeCampeao;
    }

    public String getFuncaoCampeao() {
        return funcaoCampeao;
    }

    public void setFuncaoCampeao(String funcaoCampeao) {
        this.funcaoCampeao = funcaoCampeao;
    }

    public String getEpitetoCampeao() {
        return epitetoCampeao;
    }

    public void setEpitetoCampeao(String epitetoCampeao) {
        this.epitetoCampeao = epitetoCampeao;
    }

    public String getDificuldadeCampeao() {
        return dificuldadeCampeao;
    }

    public void setDificuldadeCampeao(String dificuldadeCampeao) {
        this.dificuldadeCampeao = dificuldadeCampeao;
    }

    public String getUrlImagemCampeao() {
        return urlImagemCampeao;
    }

    public void setUrlImagemCampeao(String urlImagemCampeao) {
        this.urlImagemCampeao = urlImagemCampeao;
    }

    public String getHistoriaCampeao() {
        return historiaCampeao;
    }

    public void setHistoriaCampeao(String historiaCampeao) {
        this.historiaCampeao = historiaCampeao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCampeao == null) ? 0 : idCampeao.hashCode());
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
        Campeao other = (Campeao) obj;
        if (idCampeao == null) {
            if (other.idCampeao != null)
                return false;
        } else if (!idCampeao.equals(other.idCampeao))
            return false;
        return true;
    }

    public List<Habilidade> getListaHabilidade() {
        return listaHabilidade;
    }

    public void setListaHabilidade(List<Habilidade> listaHabilidade) {
        this.listaHabilidade = listaHabilidade;
    }
}
