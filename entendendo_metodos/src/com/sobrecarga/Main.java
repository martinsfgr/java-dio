package entendendo_metodos.src.com.sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println(Quadrilatero.area(3));
        System.out.println(Quadrilatero.area(3d, 4d));
        System.out.println(Quadrilatero.area(3, 4, 5));
        System.out.println(Quadrilatero.area(3f, 4f));
    }
}
