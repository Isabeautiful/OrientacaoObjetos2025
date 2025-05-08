package ExercicioRelampagoSurpresa;

public class Professor extends Pessoa {
    private String titulacaoMaxima;

    public Professor(String titulacaoMaxima, String nome){
        super(nome);
        setTitulacaoMaxima(titulacaoMaxima);
    }
    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
}
