package poo.src.com;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Palio");
        carro1.setCapacidadeTanque(100);

        System.out.println(carro1.getModelo() + " " + carro1.getCor());
        System.out.println(carro1.totalValorTanque(5.47));
    }
}
