package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // Criação de scanner para capturar entradas do usuário
        Scanner sc = new Scanner(System.in);
        
         // Criação do scanner para capturar entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicitar os coeficientes da equação ax + b = 0
        System.out.println("=== Resolva a Equação do 1º Grau ===");
        
        // Coeficiente 'a'
        System.out.print("Digite o valor de a (coeficiente de x): ");
        double a = sc.nextDouble();
        
        // Coeficiente 'b'
        System.out.print("Digite o valor de b (constante): ");
        double b = sc.nextDouble();
        
        // Verificar se o coeficiente 'a' é zero, pois não podemos dividir por zero
        if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero em uma equação do 1º grau!");
        } else {
            // Calcular o valor de x usando a fórmula x = -b / a
            double x = -b / a;
            
            // Exibir o resultado da equação
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é:");
            System.out.println("x = " + x);
        }
        
        // Fechar o scanner
        sc.close();
    }
}
