package academy.devdojo.maratonajava.introducao;

public class MeusExercícios01 {
    public static void main(String[] args) {
        int idade = 18;
        String tirarCNH = "consigo tirar";
        String naotirarCNH = "ainda não consigo, mas falta pouco";
        String jaTireiePerdi = "perdi com várias multas";
            if(idade >= 18){
                System.out.println(tirarCNH);
            }else if(idade < 18){
                System.out.println(naotirarCNH);
            }else
                System.out.println(jaTireiePerdi);
    }
}
