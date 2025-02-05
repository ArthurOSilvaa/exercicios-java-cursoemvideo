/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciofatorial;

/**
 *
 * @author Arthur
 */
public class CalculoFatorial {
    static int calculo (int a) {
        int f = 1;
        for (int c = a; c >= 1; c--) {
            f *= c;
        }
        return f;
    }
}
