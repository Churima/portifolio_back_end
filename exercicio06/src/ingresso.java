public class ingresso {
    private cliente cliente;
    private filme filme;
    private String assento;

    public ingresso(cliente cliente, filme filme, String assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "Ingresso vendido: " + filme.getNome() + " - " + assento + " - " + cliente.getNome();
    }

    public String getAssento() {
        return assento;
    }
}
