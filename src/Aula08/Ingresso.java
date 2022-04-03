package Aula08;

public abstract class Ingresso {
    protected float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract void imprimeValor();
}
