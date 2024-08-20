package Questao2;

public class Aluno {
    int matricula;
    String nome;
    int nota1, nota2, notaTrabalho;

    public Aluno(int matricula, String nome, int nota1, int nota2, int notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public int media(int nota1, int nota2, int notaTrabalho) {
        double peso1, peso2, pesoTrabalho, mediaPonderada, somaPesos;
        peso1 = 2.5;
        peso2 = 2.5;
        pesoTrabalho = 2;
        somaPesos = peso1 + peso2 + pesoTrabalho;
        mediaPonderada = (nota1 * peso1 + nota2 * peso2 + notaTrabalho * pesoTrabalho) / somaPesos;
        System.out.println("A media ponderada é " + mediaPonderada);
        return (int) mediaPonderada;
    }

    public void mediaFinal(int mediaPonderada) {
        if(mediaPonderada < 7){
            System.out.println("O aluno precisa ir para prova final");
        }else {
            System.out.println("O aluno não precisa ir para prova final");
        }
    }
}
