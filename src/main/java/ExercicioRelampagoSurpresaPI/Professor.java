package ExercicioRelampagoSurpresaPI;

public class Professor extends Pessoa {

    public Professor (String nome, Escolaridade escolaridade, Cidade cidade){
        super(nome, cidade);
        setEscolaridade(escolaridade);
    }

}
