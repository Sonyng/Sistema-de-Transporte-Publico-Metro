import java.util.List;
import java.util.Random;


public class Rota {
    private List<Estacao> estacoes;
    private Veiculo veiculo;
    private int estacaoAtualIndex;

    public Rota(List<Estacao> estacoes, Veiculo veiculo) {
        this.estacoes = estacoes;
        this.veiculo = veiculo;
        this.estacaoAtualIndex = 0;
    }

    public Estacao getEstacaoAtual() {
        return (Estacao)this.estacoes.get(this.estacaoAtualIndex);
    }

    public void proximaEstacao() {
        if (this.estacaoAtualIndex < this.estacoes.size() - 1) {
            ++this.estacaoAtualIndex;
            System.out.println("Você chegou à estação " + this.getEstacaoAtual().getNome());
        } else {
            System.out.println("Você já está na última estação.");
        }

    }

    public void sairDoMetro() {
        Estacao estacaoAtual = this.getEstacaoAtual();
        System.out.println("Você saiu do metrô na estação " + estacaoAtual.getNome());
        List<Passageiro> passageiros = this.veiculo.getPassageiros();
        if (!passageiros.isEmpty()) {
            Passageiro passageiro = (Passageiro)passageiros.get((new Random()).nextInt(passageiros.size()));
            this.veiculo.removerPassageiro(passageiro);
            System.out.println("Passageiro " + passageiro.getNome() + " saiu do metrô.");
        } else {
            System.out.println("Não há passageiros no metrô.");
        }

    }

    public void conversarComPessoaAleatoria() {
        List<Passageiro> passageiros = this.veiculo.getPassageiros();
        if (!passageiros.isEmpty()) {
            Passageiro passageiro = (Passageiro)passageiros.get((new Random()).nextInt(passageiros.size()));
            System.out.println("Você está conversando com " + passageiro.getNome());
        } else {
            System.out.println("Não há passageiros no metrô para conversar.");
        }

    }
}
