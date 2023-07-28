package br.info4.league.dto;

import br.info4.league.model.Usuario;

public class UsuarioDTO {

    private Long idUsuario;

    private String nomeUsuario;

    private String senhaUsuario;

    public UsuarioDTO() {
        super();
    }

    public UsuarioDTO(Long idUsuario, String nomeUsuario, String senhaUsuario) {
        super();
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public UsuarioDTO(Usuario usuario) {
        super();
        this.idUsuario = usuario.getIdUsuario();
        this.nomeUsuario = usuario.getNomeUsuario();
        this.senhaUsuario = usuario.getSenhaUsuario();
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    

}