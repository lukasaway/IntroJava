package introjava;

import java.util.Scanner;


public class IntroJava {


   
    public static void main(String[] args) {
     /*
        Scanner teste = new Scanner(System.in);
        System.out.println("Informe um valor");
        int retorno = teste.nextInt();
        
        while (retorno != 0){
            System.out.println("Informe outro valor");
            retorno = teste.nextInt();
        }
        System.out.println("Informado com sucesso!");
    */
        
        Aves objPassaro = new Aves();
             String resultado = objPassaro.Comer("mais");
             
        
             if(resultado == "mais"){
                 System.out.println("Vou enviar mais comida.");
             }
        
    }
    
    
    
    
}
