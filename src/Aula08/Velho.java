package Aula08;

public class Velho extends Imovel{
    private float desconto;

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void imprimirImovel(){
        System.out.println("Valor do desconto: " + this.desconto);
    }
}
