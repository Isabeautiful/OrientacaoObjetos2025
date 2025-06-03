package ListaExerciciosHerancaPolimorfismo.Ex7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//teste
public abstract class MaterialBiblioteca {
    private String titulo;
    private LocalDate dataPublicacao;

    public MaterialBiblioteca(String titulo, LocalDate dataPublicacao){
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento titulo nao pode ser string vazia");
        }
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public abstract int getPrazoEmprestimoDias();

    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo){
        return dataEmprestimo.plusDays(getPrazoEmprestimoDias());
    }
}
