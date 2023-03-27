package AtividadePOO;

import java.util.Scanner;

public class Atividades {
    Scanner sc = new Scanner(System.in);
    public void atividade1() {
        System.out.println("Escreva um número decimal");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Escreva outro número decimal (exceto 0)");
        double segundoNumero = sc.nextDouble();
        System.out.println("Agora , Escolha uma operação aritmética (1-Adiçao, 2-Subtração, 3-Multiplicação, 4-Divisão)");
        int operacao = sc.nextInt();
        double resultado;
        if (operacao == 1) {
            resultado = primeiroNumero + segundoNumero;
            System.out.println("Realizando uma soma entre eles o resultado é de: "+resultado);
        } else if (operacao == 2) {
            resultado = primeiroNumero - segundoNumero;
            System.out.println("Realizando uma subtração entre eles o resultado é de: "+resultado);
        } else if (operacao == 3) {
            resultado = primeiroNumero*segundoNumero;
            System.out.println("Realizando uma multiplicação entre eles o resultado é de: "+resultado);;
        } else {
            resultado = primeiroNumero/segundoNumero;
            System.out.println("Realizando uma divisão entre eles o valor é de: "+resultado);
        }
    }
    public void atividade2() {
        System.out.println("Escreva o número da matrícula do aluno");
        int numeroMatricula = sc.nextInt();
        if (numeroMatricula%4 == 0) {
            System.out.println("O aluno fará parte do Time do Chris");
        } else if (numeroMatricula%4 == 1){
            System.out.println("o aluno fará parte do Time do Greg");
        } else if (numeroMatricula%4 == 2) {
            System.out.println("O aluno fará parte do Time do Caruso");
        } else if (numeroMatricula%4 == 3) {
            System.out.println("O aluno fará parte do Time do Jerome");
        }     
    }
    public void atividade3() {
        System.out.println("Escreva quantos KG de morangos você irá comprar");
        double nMorangos = sc.nextDouble();
        System.out.println("Escreva quantos KG de maçã você irá comprar");
        double nMacas = sc.nextDouble();
        System.out.println("Escreva quantos KG de banana você irá comprar");
        double nBananas = sc.nextDouble();
        double quantidadeKG = nMorangos+nBananas+nMacas;
        double valor = (nMorangos*3.5)+(nMacas*2.3)+(nBananas*1.8);
        double desconto = 0.0;
        if (quantidadeKG>15 || valor>30.00) {
            desconto = 10*valor/100;
        }
        double valorFinal = valor-desconto;
        System.out.println("O valor a ser pago é de: R$"+valorFinal);
    }
}
