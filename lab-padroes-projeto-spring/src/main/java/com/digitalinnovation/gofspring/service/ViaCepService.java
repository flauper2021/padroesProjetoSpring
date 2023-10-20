package com.digitalinnovation.gofspring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.digitalinnovation.gofspring.model.Endereco;

@FeignClient(name= "viaCep", url = "https://viacep.com.br/ws" )
public interface ViaCepService {
    
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);    
    
}
