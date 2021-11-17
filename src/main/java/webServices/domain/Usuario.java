package webServices.domain;

public class Usuario {
    private String user;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario(String user, String senha, TipoUsuario tipoUsuario) {
        this.user = user;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
