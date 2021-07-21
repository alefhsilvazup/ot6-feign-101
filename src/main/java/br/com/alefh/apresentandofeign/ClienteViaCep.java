package br.com.alefh.apresentandofeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "via-cep", url = "https://viacep.com.br/ws/")
public interface ClienteViaCep {

    @GetMapping("{cep}/json")
    ViaCepResponse consultaCep(@PathVariable String cep);

}
