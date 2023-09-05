public class Garagem{
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "x2", 2010, 330.9, 2);
        carro.imprimirInformacoesCarro();
        System.out.println("_______________________________________________________________");
        Moto moto = new Moto("Honda", "Biz", 2023, 18.00, 125);
        moto.imprimirInformacoesMoto();
        System.out.println("_______________________________________________________________");
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2013, 843.0, 100.0);
        caminhao.imprimirInformacoesCaminhao();
        System.out.println("_______________________________________________________________");
    }
}
