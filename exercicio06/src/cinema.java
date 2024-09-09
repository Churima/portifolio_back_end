import java.util.ArrayList;
import java.util.List;
public class cinema {
    private List<filme> filmesDisponiveis = new ArrayList<>();
    private List<ingresso> ingressosVendidos = new ArrayList<>();
    private List<String> assentosDisponiveis = new ArrayList<>();

    public cinema() {
        for (char row = 'A'; row <= 'F'; row++) {
            for (int seat = 1; seat <= 5; seat++) {
                assentosDisponiveis.add(row + String.valueOf(seat));
            }
        }
    }

    public void adicionarFilme(filme filme) {
        filmesDisponiveis.add(filme);
    }

    public List<filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public void venderIngresso(cliente cliente, filme filme, String assento) throws Exception {
        if (!assentosDisponiveis.contains(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois o assento não está mais disponível!");
        }
        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }
        assentosDisponiveis.remove(assento);

        ingresso ingresso = new ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        System.out.println(ingresso);
    }
}
