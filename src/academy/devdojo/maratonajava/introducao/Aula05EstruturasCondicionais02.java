package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // idade < 15 Categoria infantil
        // idade >= 15 && idade < 18 Categoria juvenil
        // idade >= 18 Categoria adulto
        int idade = 19;

        if(idade < 15){
            System.out.println("categoria infantil");
        }else if(idade >=15 && idade < 18){
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }
    }
}
