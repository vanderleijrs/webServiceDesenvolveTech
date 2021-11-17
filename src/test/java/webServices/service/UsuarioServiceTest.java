package webServices.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webServices.domain.TipoUsuario;
import webServices.domain.Usuario;

class UsuarioServiceTest {
    private UsuarioService usuarioService;
    private Usuario usuario;
    @BeforeEach
    public void beforeAll() {
        usuarioService =new UsuarioService();
        usuario=new Usuario("Van","8", TipoUsuario.LOCADOR);
        usuarioService.iniciar();
    }

    @Test
    void cadastraUsuario() {
        Usuario usuarioSalvo= usuarioService.cadastraUsuario(usuario);
        Assertions.assertEquals(usuarioSalvo.getSenha(),"8");
    }

    @Test
    void buscaUsuario() {
        Usuario usuarioSalvo= usuarioService.buscaUsuario("Van");
        Assertions.assertEquals(usuarioSalvo.getUser(),"Van");
    }


    @Test
    void delete() {
       String resposta= usuarioService.delete("Van");
       Assertions.assertEquals(resposta,"Removido com sucesso!!");
    }

    @Test
    void valida() {
        Assertions.assertEquals(usuarioService.valida("Van","8"),"Locador Logado");
    }
}