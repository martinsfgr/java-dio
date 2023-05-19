package entendendo_metodos.src.com.exercicio_basico;

public class Mensagem {
    public static void enviarMensagem (int horario) {
        if (4 < horario && horario < 12) {
            enviarBomDia();
        } else if (12 <= horario && horario < 18) {
            enviarBoaTarde();
        } else if (18 <= horario && horario <= 24
                || 0 <= horario && horario <= 4) {
            enviarBoaNoite();
        } else {
            System.out.println("Horário inválido.");
        }
    }

    public static void enviarBomDia () {
        System.out.println("Bom dia!");
    }

    public static void enviarBoaTarde () {
        System.out.println("Bom tarde!");
    }

    public static void enviarBoaNoite () {
        System.out.println("Boa noite!");
    }
}
