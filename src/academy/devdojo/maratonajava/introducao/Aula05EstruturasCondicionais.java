package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 15;

        boolean isNotAutorizadoAcomprarBebida = true;
        if(idade >= 18){
            System.out.println("Pode comprar");
        } else {
            System.out.println("pode nao amigo");
        }
    }
}

