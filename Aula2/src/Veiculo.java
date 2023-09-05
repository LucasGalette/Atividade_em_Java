public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(String marca, String modelo, int ano, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void imprimirInformacoes() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(preco);
    }


}
