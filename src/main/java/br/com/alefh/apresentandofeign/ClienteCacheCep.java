package br.com.alefh.apresentandofeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "cache-cep", url = "https://en6iixc81qau79x.m.pipedream.net")
public interface ClienteCacheCep {

    @PostMapping
    Map<String, Object> enviaInformacoesDeCep(@RequestBody ViaCepResponse viaCepResponse);
}
