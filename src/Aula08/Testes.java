package Aula08;

public class Testes {
    public static void main(String[] args) {
        Novo i1 = new Novo();
        Velho i2 = new Velho();

        i1.setPreco(3500f);
        i1.setEndereco("Rua 1");
        i1.setAdicional(500f);
        i1.imprimirImovel();

        i2.setPreco(3500f);
        i2.setEndereco("Rua 2");
        i2.setDesconto(800f);
        i2.imprimirImovel();


    }
}
