/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("A segunda nota: ");
        float n2= teclado.nextFloat();
        
        float m = (n1 + n2) / 2;
        System.out.format("Sua média foi %.2f", m);
        
        if (m>=7) {
            System.out.println("Parabéns você foi APROVADO");
        }
    }
    
}
