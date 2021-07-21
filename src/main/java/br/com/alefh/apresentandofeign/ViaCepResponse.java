package br.com.alefh.apresentandofeign;

public class ViaCepResponse {

    private String cep, logradouro, bairro, uf;

    public ViaCepResponse(String cep, String logradouro, String bairro, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUf() {
        return uf;
    }
}
