import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pergunta 1: Você prefere café (1) ou chá (2)?");
        int resposta1 = scanner.nextInt();

        if (resposta1 != 1 && resposta1 != 2) {
            System.out.println("Resposta inválida. Programa encerrado.");
            return;
        }

        System.out.println("Pergunta 2: Você prefere trabalhar de manhã (1) ou à noite (2)?");
        int resposta2 = scanner.nextInt();

        if (resposta2 != 1 && resposta2 != 2) {
            System.out.println("Resposta inválida. Programa encerrado.");
            return;
        }

        switch (resposta1) {
            case 1:
                switch (resposta2) {
                    case 1:
                        System.out.println("Comece o dia com uma xícara de café e aproveite a manhã para ser produtivo!");
                        break;
                    case 2:
                        System.out.println("Desfrute de um café à tarde para manter o foco à noite.");
                        break;
                }
                break;

            case 2:
                switch (resposta2) {
                    case 1:
                        System.out.println("Um chá pela manhã pode ser uma maneira suave de começar o seu dia.");
                        break;
                    case 2:
                        System.out.println("Relaxar com um chá à noite pode ajudar você a se preparar para uma noite produtiva.");
                        break;
                }
                break;

            default:
                System.out.println("Respostas inválidas. Programa encerrado.");
                break;
        }

        scanner.close();
    }
}