package academy.devdojo.maratonajava.introducao;

public class MeusExercícios03 {
    public static void main(String[] args) {
        byte diaSemana = 5;
        //Dado os numeros de 1 a 7, com switch escreva os dias da semana, e quais sao fim de semana
        switch (diaSemana) {
            case 1:
                case 7:
                    System.out.println("Fim de Semana");
                    break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}