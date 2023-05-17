    package br.com.praticar.Spring.service.impl;

    import br.com.praticar.Spring.service.CalculadoraService;
    import org.springframework.stereotype.Service;

    @Service
    public class CalculadoraServiceImpl implements CalculadoraService {
        @Override
        public String calculoSomar(double valor1, double valor2) {
            double soma = valor1 + valor2;
            return "Resulado Soma = " + soma;
        }

        @Override
        public String calculoSubtrair(double valor1, double valor2) {
            double subtracao = valor1 - valor2;
            return "Resulado Subtracao = " + subtracao;
        }

        @Override
        public String calculoMultiplicar(double valor1, double valor2) {
            double multiplicacao = valor1 * valor2;
            return "Resulado Multiplicacao = " + multiplicacao;
        }

        @Override
        public String calculoDividir(double valor1, double valor2) {
            double divisao = valor1 / valor2;
            return "Resulado Divisão = " + divisao;
        }
    }
