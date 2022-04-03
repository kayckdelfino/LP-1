package Aula08;

public class Novo extends Imovel{
    private float adicional;

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    @Override
    public void imprimirImovel(){
        System.out.println("Valor adicional: " + this.adicional);
    }
}
