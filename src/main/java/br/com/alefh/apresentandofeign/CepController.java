package br.com.alefh.apresentandofeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cep")
public class CepController {

    private ClienteViaCep clienteViaCep;
    private ClienteCacheCep clienteCacheCep;

    @Autowired
    public CepController(ClienteViaCep clienteViaCep, ClienteCacheCep clienteCacheCep) {
        this.clienteViaCep = clienteViaCep;
        this.clienteCacheCep = clienteCacheCep;
    }

    @GetMapping("{cep}")
    public ResponseEntity<?> consulta(@PathVariable String cep) {
        System.out.println(cep);
        ViaCepResponse viaCepResponse = clienteViaCep.consultaCep(cep);
        Map<String, Object> retorno = clienteCacheCep.enviaInformacoesDeCep(viaCepResponse);
        return ResponseEntity.ok(retorno);
    }
}
