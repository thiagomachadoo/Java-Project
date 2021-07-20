package academy.devdojo.maratonajava.introducao;

public class MeusExercícios02 {
    public static void main(String[] args) {
        double toBemDeGrana= 10;
        String queroUmaFatiadoraDeFrios = "Vou comprar a fatiadora agora";
        String queroMasToSemGrana = "Vou juntar grana para o mês que vem";
        String resultado = toBemDeGrana >= 1000  ? queroUmaFatiadoraDeFrios : queroMasToSemGrana;
        System.out.println(resultado);

    }
}
