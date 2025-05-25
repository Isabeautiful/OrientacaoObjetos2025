package ListaExerciciosHerancaPolimorfismo.Ex7;

import java.time.LocalDate;

public class Filme extends MaterialBiblioteca {
    public Filme (String titulo, LocalDate dataPublicacao){
        super(titulo,dataPublicacao);
    }

    public int getPrazoEmprestimoDias(){
        return 5;
    }
}
