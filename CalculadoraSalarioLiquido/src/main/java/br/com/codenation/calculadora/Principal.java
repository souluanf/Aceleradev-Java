package br.com.codenation.calculadora;

public class Principal {
  public static void main(String[] args) {
    CalculadoraSalario calculadora = new CalculadoraSalario();

    double salario1 = calculadora.calcularSalarioLiquido(1000);
    System.out.println(salario1);
    double salario2 = calculadora.calcularSalarioLiquido(1500);
    System.out.println(salario2);
    double salario4 = calculadora.calcularSalarioLiquido(1500.01);
    System.out.println(salario4);
    double salario3 = calculadora.calcularSalarioLiquido(10000);
    System.out.println(salario3);
  }
}
