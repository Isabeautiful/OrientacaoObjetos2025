package Avaliacao2;

public class Ocorrencia {
    private int mesOcorrencia;
    private int anoOcorrencia;
    private boolean tipoOcorrencia;
    private float valorOcorrencia;
    private String descricaoOcorrencia;


    public int getMesOcorrencia() {
        return this.mesOcorrencia;
    }

    public void setMesOcorrencia(int mesOcorrencia) {
        if(mesOcorrencia <= 0 || mesOcorrencia > 12){
            throw new IllegalArgumentException("Erro: mesOcorrencia invalido");
        }
        this.mesOcorrencia = mesOcorrencia;
    }

    public int getAnoOcorrencia() {
        return this.anoOcorrencia;
    }

    public void setAnoOcorrencia(int anoOcorrencia) {
        if(anoOcorrencia < 0){
            throw new IllegalArgumentException("Erro: anoOcorrencia invalido");
        }
        this.anoOcorrencia = anoOcorrencia;
    }

    public boolean getTipoOcorrencia() {
        return this.tipoOcorrencia;
    }

    public void setTipoOcorrencia(boolean tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public float getValorOcorrencia() {
        return this.valorOcorrencia;
    }

    public void setValorOcorrencia(float valorOcorrencia) {
        if(valorOcorrencia <= 0){
            throw new IllegalArgumentException("Erro: Valor Ocorrencia Invalido");
        }
        this.valorOcorrencia = valorOcorrencia;
    }

    public String getDescricaoOcorrencia() {
        return this.descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        if(descricaoOcorrencia.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: string descricaoOcorrencia invalida");
        }
        this.descricaoOcorrencia = descricaoOcorrencia;
    }
}
