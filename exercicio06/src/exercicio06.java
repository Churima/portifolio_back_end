import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        cinema cinema = new cinema();

        cinema.adicionarFilme(new filme("Homem Aranha", 15.00, 12));
        cinema.adicionarFilme(new filme("Avatar", 20.00, 14));
        cinema.adicionarFilme(new filme("O Rei Leão", 10.00, 0));
        cinema.adicionarFilme(new filme("Vingadores", 18.00, 13));
        cinema.adicionarFilme(new filme("Coringa", 22.00, 18));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que filme você deseja assistir?");
            String nomeFilme = scanner.nextLine();

            filme filmeEscolhido = null;
            for (filme filme : cinema.getFilmesDisponiveis()) {
                if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                    filmeEscolhido = filme;
                    break;
                }
            }

            if (filmeEscolhido == null) {
                System.out.println("Filme não encontrado.");
                continue;
            }

            System.out.println("Qual assento você deseja?");
            String assento = scanner.nextLine();

            System.out.println("Qual o seu nome?");
            String nomeCliente = scanner.nextLine();

            System.out.println("Qual a sua idade?");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine();

            cliente cliente = new cliente(nomeCliente, idadeCliente);

            try {
                cinema.venderIngresso(cliente, filmeEscolhido, assento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja comprar outro ingresso? (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                break;
            }
        }

        scanner.close();
    }
}
