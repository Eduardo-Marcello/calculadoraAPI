package com.marcello.calculadoraapi.controller;

import com.marcello.calculadoraapi.model.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    Calculadora numeros;

    @PostMapping("/numeros")
    String postNumeros(@RequestBody Calculadora numeros) {
        this.numeros = new Calculadora (numeros.getNumero1(), numeros.getNumero2());

       return "Números 1: " + numeros.getNumero1() + ", " + numeros.getNumero2() + " adiconados!";
    }
    @GetMapping("/numeros")
    Calculadora getNumeros(){
        return numeros;
    }

    @GetMapping("/somar")
    Float somarNumeros() {
        return numeros.somar();
    }

    @GetMapping("/subtrair")
    Float subtrairNumeros() {
        return numeros.subtrair();
    }

    @GetMapping("/multiplicar")
    Float multiplicarNumeros() {
        return numeros.multiplicar();
    }

    @GetMapping("/dividir")
    Float dividirNumeros() {
        return numeros.dividir();
    }
}
