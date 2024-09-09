package contratacao.domain.model;

public class Taxa {

    private Moeda moedaOrigem;
    private Moeda moedaDestino;
    private double taxa;

    public Taxa(Moeda moedaOrigem, Moeda moedaDestino, double taxa) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.taxa = taxa;
    }

    public Moeda getMoedaOrigem() {
        return moedaOrigem;
    }

    public void setMoedaOrigem(Moeda moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }

    public Moeda getMoedaDestino() {
        return moedaDestino;
    }

    public void setMoedaDestino(Moeda moedaDestino) {
        this.moedaDestino = moedaDestino;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
