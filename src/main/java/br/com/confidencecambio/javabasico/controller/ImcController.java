package br.com.confidencecambio.javabasico.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.ImcService;

@RestController
public class ImcController {
	
	private ImcService service;
	
	public ImcController(final ImcService service) {

        this.service = service;
    }
	
   
    @GetMapping("/imc")
    public  ResponseEntity<String> calcularIMC(@RequestParam("peso") double peso, @RequestParam("altura") double altura) {
    	 String retorno = service.retornaImc(peso, altura);
         return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
