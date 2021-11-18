package webServices.service;

import org.springframework.stereotype.Service;
import webServices.domain.Imovel;
import webServices.domain.TipoImovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ImovelService {
    ArrayList<Imovel> imoveis = new ArrayList();
    public List buscaTodosImoveis() {
       List imoveisDisponiveis =new ArrayList();
      return  imoveisDisponiveis= imoveis.stream()
              .filter(iterator-> iterator.isDisponibilidade()==true)
              .collect(Collectors.toList());
    }

    public List buscaImoveisDisponiveisPorTipo(TipoImovel tipoImovel) {
        List imoveisDisponiveisPorTipo =new ArrayList();
        return  imoveisDisponiveisPorTipo= imoveis.stream()
                                            .filter(iterator-> iterator.isDisponibilidade()==true && iterator
                                            .getTipoImovel().equals(tipoImovel)).collect(Collectors.toList());
    }
}
