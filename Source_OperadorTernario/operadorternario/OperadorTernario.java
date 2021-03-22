/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author micae
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n1, n2 , r ;
        n1 = 2;
        n2 = 3;
        r = (n1>n2)?0:1 ;
        System.out.println(r);*/
        String nome1= "AAA";
        String nome2= "AAA";
        String nome3 = new String ("AAA");
        String res ;
        res = (nome1.equals(nome3))?"==":"!="; // .equals verifica se o conteúdo é igual, não o tipo
        System.out.printf(":%s\n",res);
        
// TODO code application logic here
    }
    
}
