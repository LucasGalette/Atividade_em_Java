public class Caminhao extends Veiculo{
    private Double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco, double cargaMaxima) {
        super(marca, modelo, ano, preco);
        this.cargaMaxima = cargaMaxima;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void imprimirInformacoesCaminhao() {
        imprimirInformacoes();
        System.out.println(cargaMaxima);
    }
}
