/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Arthur
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Arthur";
        String nome2 = "Arthur";
        String nome3 = new String("Arthur");
        String res;
        //res = (nome1 == nome2)?"Igual":"Diferente";
        res = (nome1.equals(nome3)?"Nome igual":"Nome diferente");
        System.out.println(res);
    }
    
}
