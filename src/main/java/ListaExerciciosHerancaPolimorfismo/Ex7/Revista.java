package ListaExerciciosHerancaPolimorfismo.Ex7;

import java.time.LocalDate;

public class Revista extends MaterialBiblioteca {
    public Revista (String titulo, LocalDate dataPublicacao){
        super(titulo,dataPublicacao);
    }

    public int getPrazoEmprestimoDias(){
        return 7;
    }
}
