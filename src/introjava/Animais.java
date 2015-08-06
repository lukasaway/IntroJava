package introjava;


public class Animais {
    String nome, CorDosOlhos;
    int idade, peso;

    public String Comer(String mensagem) {
        System.out.println("Quero comer");
        String resultado = "mais";
        if(mensagem != "mais"){
            System.out.println("Satisfeito");
            resultado = "Obrigado";
        }else{
            System.out.println("Ainda estou com fome");
        }      
        return resultado;
    }

    public int Dormir() {
        System.out.println("Já comi e agora vou bodiar!");
        return 1;
    
    }

}


