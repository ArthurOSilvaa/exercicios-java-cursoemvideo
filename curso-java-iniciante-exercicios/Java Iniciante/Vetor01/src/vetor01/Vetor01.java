/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author Arthur
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n = new int[6];
        n[0] = 3;
        n[1] = 2;
        n[2] = 8;
        n[3] = 7;
        n[4] = 5;
        n[5] = 4;
        */
        int n[] = {3,2,8,7,5,4};
        
        for (int c=0; c<n.length; c++) {
            System.out.print("{" + n[c] + "} ");
        }
        
    }
    
}
