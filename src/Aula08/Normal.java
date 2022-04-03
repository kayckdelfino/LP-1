package Aula08;

public class Normal extends Ingresso{

    @Override
    public void imprimeValor(){
        System.out.println("Valor: " + this.getValor());
    }
    public void Normal(){
        System.out.println("Ingresso Normal.");
    }
}
