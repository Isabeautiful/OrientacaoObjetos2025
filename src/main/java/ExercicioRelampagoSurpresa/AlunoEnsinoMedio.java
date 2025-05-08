package ExercicioRelampagoSurpresa;

public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome, String matricula, int nota1, int nota2) {
        super(nome);
        setMatricula(matricula);
        setNota1(nota1);
        setNota2(nota2);
    }

    public boolean verificarAprovacao(){
        double resultado = calcularMedia();
        return !(resultado < 6);
    }
}
