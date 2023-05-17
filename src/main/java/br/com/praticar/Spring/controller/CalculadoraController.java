package br.com.praticar.Spring.controller;

import br.com.praticar.Spring.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("somar")
    public String calculoSoma(double valor1, double valor2) {
        return calculadoraService.calculoSomar(valor1, valor2);
    }

    @GetMapping("subtrair")
    public String calculoSubtracao(double valor1, double valor2) {
        return calculadoraService.calculoSubtrair(valor1, valor2);
    }

    @GetMapping("multiplicar")
    public String calculoMultiplicacao(double valor1, double valor2) {
        return calculadoraService.calculoMultiplicar(valor1, valor2);
    }

    @GetMapping("dividir")
    public String calculoDivisao(double valor1, double valor2) {
        return calculadoraService.calculoDividir(valor1, valor2);
    }

}
