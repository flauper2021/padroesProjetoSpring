package com.digitalinnovation.gofspring.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalinnovation.gofspring.model.Cliente;
import com.digitalinnovation.gofspring.model.ClienteRepository;
import com.digitalinnovation.gofspring.model.Endereco;
import com.digitalinnovation.gofspring.model.EnderecoRepository;
import com.digitalinnovation.gofspring.service.ClienteService;
import com.digitalinnovation.gofspring.service.ViaCepService;



@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    
    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
        
    }

    public void atualizar(Long id, Cliente cliente){
        Optional<Cliente> clientebd = clienteRepository.findById(id);
        if (clientebd.isPresent()){
            salvarClienteComCep(cliente);
        }

    }

    public void deletar(long id){
        clienteRepository.deleteById(id);

    }



    public void salvarClienteComCep(Cliente cliente){

        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);

    }
    
}
