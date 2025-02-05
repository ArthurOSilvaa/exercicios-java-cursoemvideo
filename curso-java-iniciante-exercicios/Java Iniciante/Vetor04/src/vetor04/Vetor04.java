/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Arthur
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {6, 8, 6, 9, 11, 2, 1};
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
