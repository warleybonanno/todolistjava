package br.com.warleybonanno.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Camada entre a requisição e demais camadas (negócio, banco de dados)
// Primeira camada de acesso

@RestController
@RequestMapping("/primeiraRota")

public class MinhaPrimeiraController {

    /**
     * Métodos de acesso do HTTP
     * GET - Buscar um dado/informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado/informação
     * PATCH - Alterar somente uma parte do dado/informação
     * 
     */

     // Método (Funcionalidade) de uma classe
     @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
    
}
