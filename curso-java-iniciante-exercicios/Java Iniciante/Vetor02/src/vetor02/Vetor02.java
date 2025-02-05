/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Arthur
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c=0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + dia[c] + " dias.");
        }
        
        int totDias = 0;
        
        for (int c = 0; c < dia.length; c++) {
            totDias += dia[c];
        }
        
        if (totDias == 366) {
            System.out.println("Esse ano é bissexto");
        } else if (totDias == 365) {
            System.out.println("Esse ano é normal");
        }
    }
    
}
