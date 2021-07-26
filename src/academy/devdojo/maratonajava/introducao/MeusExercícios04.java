package academy.devdojo.maratonajava.introducao;

public class MeusExercícios04 {
    public static void main(String[] args) {
        byte convidados = 1;
        String pessoasDesconhecidas = "Vim de intruso";
        switch (convidados){
            case 1:
                System.out.println("Opa só bora");

            case 2:
                System.out.println("hm");
                break;
            default:
                System.out.println(pessoasDesconhecidas);
        }


    }
}
