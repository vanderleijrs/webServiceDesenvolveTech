package webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webServices.domain.TipoImovel;
import webServices.service.ImovelService;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    ImovelService imovelService;
    @GetMapping("/disponiveis")
    public List buscaImoveisDisponiveis(){
        return imovelService.buscaTodosImoveis();
    }
    @GetMapping("/disponiveis/{tipo}")
    public List buscaImoveisPorTipo(@PathVariable @NonNull TipoImovel tipoImovel){
        return imovelService.buscaImoveisDisponiveisPorTipo(tipoImovel);
    }
}
