package introjava;

import java.io.IOException;
import java.util.Scanner;


public class IntroJava {


   
    public static void main(String[] args) throws IOException {
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
        
       /*
        Aves objPassaro = new Aves();
             String resultado = objPassaro.Comer("mais");
             
        
             if(resultado == "mais"){
                 System.out.println("Vou enviar mais comida.");
             }
        */
        
        
        char choice;
        
        System.out.println("Help on");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.print("Choose one: ");
        choice = (char) System.in.read();
        
        System.out.println("\n");
        
        switch(choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                double earthweight;
                double moonweight;
                
                earthweight = 165;
                
                moonweight = earthweight * 0.17;
                
                System.out.println(earthweight + " earth-pounds is equivalent to " + moonweight + " moon-pounds.");
                break;
            case '4':
                int x;
                x = 10;
                if(x == 10) {
                    int y = 20;
                    
                    System.out.println("x and y: " + x + " " + y);
                    x = y * 2;
                    
                }
                System.out.println("x is " + x);
                break;
            case '5':
                double z, y;
                byte b;
                int i;
                char ch;
                
                z = 10.0;
                y = 3.0;
                
                i = (int) (z/y);
                System.out.println("Integer outcome of x / y: " +i);
                
                i = 100;
                b = (byte) i;
                System.out.println("Value of b: " + b);
                
                i = 257;
                b = (byte) i;
                System.out.println("Value of b: " + b);
                
                b = 90; //ASCII code for Z
                ch = (char) b;
                System.out.println("ch: " + ch);
                break;
            case '6':
                char ch2;
                
                ch2 = 'A';
                System.out.println("ch2 contains " + ch2);
                
                ch2++;
                System.out.println("ch2 is now " + ch2);
                
                ch2 = 90;
                System.out.println("ch2 is now " + ch2);
                break;
            case '7':
                double gallons;
                double liters;
                
                gallons = 10;
                
                liters = gallons * 3.7854;
                
                System.out.println(gallons + " gallons is " + liters + " liters.");
                break;
            case '8':
                int i2, j2;
                boolean b1,b2;
                
                i2 = 10;
                j2 = 11;
                if(i2 < j2) System.out.println("i2 < j2");
                if(i2 <= j2) System.out.println("i2 <= j2");
                if(i2 != j2) System.out.println("i2 != j2");
                if(i2 == j2) System.out.println("this won't execute");
                if(i2 >= j2) System.out.println("this won't execute");
                if(i2 > j2) System.out.println("this won't execute");
                
                b1 = true;
                b2 = false;
                
                if(b1 & b2) System.out.println("this won't execute");
                if(!(b1 && b2)) System.out.println("!(b1 && b2)is true");
                if(b1 | b2) System.out.println("b1 | b2 is true");
                if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
                break;
            
            case '9':
                
                int a5, b5, c5 = 0;
                
                a5 = 2;
                b5 = 3;
                
                if(a5 < b5) System.out.println("a is less than b");
                
                if(a5 == b5) System.out.println("you won't see this");
                System.out.println();        
                
                System.out.println("c5 contains -1");
                if(c5 >= 0) System.out.println("c5 is non-negative");
                if(c5 < 0) System.out.println("c5 is negative");
                
                System.out.println();
                
                c5 = b5 - a5;
                System.out.println("c5 contains 1");
                if(c5>= 0) System.out.println("c5 is non-negative");
                if(c5 < 0) System.out.println("c5 os negative");
                
                
                break;          
            
            case '0':
                double num; 
                double sroot = 0, rerr;
                
                for(num = 1.0; num < 100.0; num++){
                    sroot = Math.sqrt(num);
                    System.out.println("Square root of " + num + " is " + sroot);
                }
                
                rerr = num - (sroot * sroot);
                System.out.println("Rounding error is " + rerr);
                System.out.println();
                
                break;
            default:
                 System.out.println("Selection not found.");
        
        
        }   
    
    
    
    
    }
}