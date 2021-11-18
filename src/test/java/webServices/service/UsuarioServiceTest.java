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
        usuarioService.iniciar();
    }

    @Test
    void cadastraUsuario() {
        usuario=new Usuario("Vanessa","234", TipoUsuario.LOCADOR);
        String  usuarioSalvo= usuarioService.cadastraUsuario(usuario);
        Assertions.assertEquals(usuarioSalvo,"Usuario cadastrado com sucesso!!");
    }
    @Test
    void usuarioJaExiste() {
        usuario=new Usuario("Van","8", TipoUsuario.LOCADOR);
        String usuarioSalvo= usuarioService.cadastraUsuario(usuario);
        Assertions.assertEquals(usuarioSalvo,"Usuario já existe!!");
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