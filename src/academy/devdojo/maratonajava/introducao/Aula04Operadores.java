package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        //+ - / *
        double numero01 = 10;
        double numero02 = 20;
        System.out.println(numero02 * numero01);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // <  > <= >= (== comparacao) !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // operadores lógicos
        // && (and), || (or) !
        int idade = 26;
        float salario = 3500F;
        boolean isDentroDaleiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaleiMaiorQueTrinta);
        System.out.println(isDentroDaleiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 30000;
        float valorPlaystation = 5274.57F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);
        //operadores aritiméticos
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1200;
        bonus -= 1500;
        System.out.println(bonus);
        //
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        --contador;
        ++contador;
        ++contador;
        System.out.println(contador);

    }
}
