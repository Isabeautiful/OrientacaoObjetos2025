package ExercicioRelampagoSurpresaPI;

public class Professor extends Pessoa {

    public Professor (String nome, Escolaridade escolaridade){
        super(nome);
        setEscolaridade(escolaridade);
    }

    public String getNomeGraduacao(){
        return getEscolaridade().getGraduacao();
    }
}
