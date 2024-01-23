package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);
        //System.out.println(notasAlunoA[4]); ERRO!

        double totalAlunoA = 0;
        for(double nota : notasAlunoA){
            totalAlunoA += nota;
        }

        System.out.println(totalAlunoA / notasAlunoA.length + " Fim 1 ");

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalAlunoB = 0;
        for(double notab : notasAlunoB){
            totalAlunoB += notab;
        }

        System.out.println(totalAlunoB / notasAlunoB.length + " Fim 2 ");
    }
}
