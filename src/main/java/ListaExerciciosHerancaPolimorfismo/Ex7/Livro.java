package ListaExerciciosHerancaPolimorfismo.Ex7;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca {
    public Livro (String titulo, LocalDate dataPublicacao){
        super(titulo,dataPublicacao);
    }

    public int getPrazoEmprestimoDias(){
        return 15;
    }
}
