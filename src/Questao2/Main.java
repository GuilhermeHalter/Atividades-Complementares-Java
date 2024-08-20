/*Calcular media ponderada de um aluno e se o aluno precisa ou não para a prova final*/
package Questao2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(2024569, "Pedro", 7,7,8);

        System.out.println(a1.matricula);
        System.out.println(a1.nome);
        int mediaPonderada = a1.media(a1.nota1, a1.nota2, a1.notaTrabalho);
        a1.mediaFinal(mediaPonderada);
    }
}
