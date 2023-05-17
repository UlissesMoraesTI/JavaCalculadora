package br.com.praticar.Spring.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculadoraService {

    String calculoSomar(double valor1, double valor2);

    String calculoSubtrair(double valor1, double valor2);

    String calculoMultiplicar(double valor1, double valor2);

    String calculoDividir(double valor1, double valor2);

}
