package Aula08;

public class VIP extends Ingresso{
    private String valor_adicional;

    public String getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(String valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    @Override
    public void imprimeValor(){
        System.out.println("Valor do ingresso VIP:" + (getValor()+getValor_adicional()));
    }
}
