package br.info4.league.dto;

import javax.validation.constraints.NotBlank;

public class CriarUsuarioDTO {
    @NotBlank
    
    private String nomeUsuario;

    @NotBlank
    
    private String senhaUsuario;

    @NotBlank
   
    private String confirmaSenha;

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

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

}