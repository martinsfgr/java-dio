package entendendo_metodos.src.com.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Quadrilatero.area(3);
        Quadrilatero.area(3d, 4d);
        Quadrilatero.area(3, 4, 5);
        Quadrilatero.area(3f, 4f);
    }
}
