/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Arthur
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {9.66, 29.63, 150, 2.4, 2.75, 3.66, 5.55};
        Arrays.sort(v);
        for (double valor: v) {
            System.out.println(valor);
        }
    }
    
}
