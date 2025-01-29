/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class ExercicioRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n;
      int totValores = 0;
      int totPar = 0;
      int totImpar = 0;
      int maiorq100 = 0;
      float mValores = 0;
      int tot = 0;
      
      do {
          
         n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "<html>Informe um número: <br>(valor 0 interrompe)</html>"));
         tot += n;
            if (n != 0) {
              totValores += 1;  
            } else if (n % 2 == 0) {
                totPar += 1;
            } else if (n % 2 == 1) {
                totImpar += 1;
            } else if (n > 100) {
                maiorq100 += 1;
            }
      } while (n != 0);
      
      mValores = tot / totValores;
      
      JOptionPane.showMessageDialog(null, 
              "<html>Resultado: <br> <hr> <br> "
                      + "Total de Valores: " + totValores + "<br>"
                      + "Total de Pares: " + totPar + "<br>"
                      + "Total de Ímpares: " + totImpar + "<br>"
                      + "Acima de 100: " + maiorq100 + "<br>"
                      + "Média dos Valores: " + mValores + "</html>");
      
    }
    
}
