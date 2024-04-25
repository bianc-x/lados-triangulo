/* Faça um programa que leia três coordenadas num espaço 2D e indique
se formam um triângulo, juntamente com o seu tipo (equilátero, isósceles
e escaleno). */

import java.util.Scanner;


public class Main {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira 1 valor do par A: ");
        int X1 = teclado.nextInt();
        
        System.out.println("Insira 2 valor do par a: ");
        int X2 = teclado.nextInt();
        
        System.out.println("Insira 1 valor do par B: ");
        int Y1 = teclado.nextInt();
        
        System.out.println("Insira 2 valor do par B: ");
        int Y2 = teclado.nextInt();
        
        System.out.println("Insira 1 valor do par C: ");
        int Z1 = teclado.nextInt();
        
        System.out.println("Insira 2 valor do par C: ");
        int Z2 = teclado.nextInt();
        
        double D1 = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));
        double D2 = Math.sqrt(Math.pow((Y2 - Y1),2) + Math.pow((Z2 - Z1),2));
        double D3 = Math.sqrt(Math.pow((Z2 - Z1),2) + Math.pow((X2 - X1),2));
        
        
        System.out.println("A distancia entre o ponto A e o ponto B eh: "+D1);
        System.out.println("A distancia entre o ponto B e o ponto C eh: "+D2);
        System.out.println("A distancia entre o ponto C e o ponto A eh: "+D3);
        
        if(D1 == D2 && D2 == D3){
            System.out.println("O triangulo eh equilatero!");
            } else if (D1 == D2 || D2 == D3 || D1 == D3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
    }
}