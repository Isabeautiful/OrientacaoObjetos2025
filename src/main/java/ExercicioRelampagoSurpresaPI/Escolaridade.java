package ExercicioRelampagoSurpresaPI;

public class Escolaridade {
    private String graduacao;

    public Escolaridade(String graduacao){
        setGraduacao(graduacao);
    }

    public String getGraduacao() {
        return this.graduacao;
    }

    public void setGraduacao(String graduacao) {
        if(graduacao.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento graduacao nao pode ser vazio");
        }
        if(!graduacao.equalsIgnoreCase("MESTRANDO") && !graduacao.equalsIgnoreCase("DOUTORANDO")){
            throw new IllegalArgumentException("Erro: argumento graduacao só pode ser mestrando ou doutorando");
        }
        this.graduacao = graduacao.toUpperCase();
    }
}
