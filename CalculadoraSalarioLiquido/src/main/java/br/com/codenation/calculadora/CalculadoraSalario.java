package br.com.codenation.calculadora;

public class CalculadoraSalario {

  public long calcularSalarioLiquido(double salarioBase) {
    if (salarioBase < 1039) {
      return Math.round(0.0);
    }
    return Math.round(calcularIRRF(calcularInss(salarioBase)));
  }

  private double calcularInss(double salarioBase) {
    if (salarioBase <= 1500) {
      salarioBase -= salarioBase * 0.08;
    } else if (salarioBase <= 4000) {
      salarioBase -= salarioBase * 0.09;
    } else {
      salarioBase -= salarioBase * 0.11;
    }
    return salarioBase;
  }

  private double calcularIRRF(double salarioBrutoInss) {
    if (salarioBrutoInss <= 3000) {
      return salarioBrutoInss;
    } else if (salarioBrutoInss > 3000 && salarioBrutoInss <= 6000) {
      return salarioBrutoInss - salarioBrutoInss * 0.075;
    } else {
      return salarioBrutoInss - salarioBrutoInss * 0.15;
    }
  }
}
