package webServices.service;

import org.springframework.stereotype.Service;
import webServices.domain.TipoUsuario;
import webServices.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import static webServices.controller.UsuarioController.locadorLogado;
import static webServices.controller.UsuarioController.locatarioLogado;

@Service
public class UsuarioService {
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public void iniciar(){
        listaUsuarios.add(new Usuario("Van","8", TipoUsuario.LOCADOR));
        listaUsuarios.add(new Usuario("Vitor","9", TipoUsuario.LOCATARIO));
    }
    public Usuario cadastraUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        return usuario;
    }
    public List busca(){
       return listaUsuarios;
    }
    public Usuario buscaUsuario(String user){
        for(int i=0; i<listaUsuarios.size();i++){
           if(listaUsuarios.get(i).getUser().equals(user))
               return listaUsuarios.get(i);
        }
        return null;
    }
    public String delete(String user){
        String resposta=null;
        for(int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getUser().equals(user)){
                listaUsuarios.remove(i);
                resposta="Removido com sucesso!!";
            }else{
               resposta="Usuario não encontrado!!";
            }
        }
        return resposta;
    }

    public String valida(String user, String senha) {
      Usuario usuario= listaUsuarios.stream().filter(iterator->iterator.getUser().equals(user)).findFirst().get();
      if(usuario.getSenha().equals(senha)&& usuario.getTipoUsuario().equals(TipoUsuario.LOCADOR)){
          locadorLogado=true;
          return "Locador Logado";
      }else if(usuario.getSenha().equals(senha)&& usuario.getTipoUsuario().equals(TipoUsuario.LOCADOR)){
          locatarioLogado=true;
          return "Locatario Logado";
        }
        return "Não logado";
    }
}
