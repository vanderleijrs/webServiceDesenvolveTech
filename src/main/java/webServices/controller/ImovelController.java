package webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webServices.service.ImovelService;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    ImovelService imovelService;
    @GetMapping
    public List buscaImovel(){
        return imovelService.buscaTodosImoveis();
    }
}
