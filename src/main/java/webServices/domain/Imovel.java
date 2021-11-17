package webServices.domain;

public class Imovel {
    private String nomeImovel;
    private boolean disponibilidade;
    private String cidade;
    private TipoImovel tipoImovel;
    private double precoDoAluguelPorDia;
    private String locatario;
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
        this.nomeImovel = nomeImovel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public double getPrecoDoAluguelPorDia() {
        return precoDoAluguelPorDia;
    }

    public void setPrecoDoAluguelPorDia(double precoDoAluguelPorDia) {
        this.precoDoAluguelPorDia = precoDoAluguelPorDia;
    }


    public Imovel() {
    }

}
