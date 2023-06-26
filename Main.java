import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class  Main{
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Estacao estacao1 = new Estacao("Recife");
        Estacao estacao2 = new Estacao("Joana Bezerra");
        Estacao estacao3 = new Estacao("Largo da Paz");
        Estacao estacao4 = new Estacao("Imbiribeira");
        Estacao estacao5 = new Estacao("Antonio Falcao");
        Estacao estacao6 = new Estacao("Shopping");
        Estacao estacao7 = new Estacao("Trancredo Neves ");
        Estacao estacao8 = new Estacao("Aeroporto");
        Estacao estacao9 = new Estacao("Porta Larga");
        Estacao estacao10 = new Estacao("Monte dos Guararapes");
        Estacao estacao11 = new Estacao("Prazeres");
        Estacao estacao12 = new Estacao("Cajueiro seco");



        List<Estacao> estacoes = new ArrayList<>();
        estacoes.add(estacao1);
        estacoes.add(estacao2);
        estacoes.add(estacao3);
        estacoes.add(estacao4);
        estacoes.add(estacao5);
        estacoes.add(estacao6);
        estacoes.add(estacao7);
        estacoes.add(estacao8);
        estacoes.add(estacao9);
        estacoes.add(estacao10);
        estacoes.add(estacao11);
        estacoes.add(estacao12);


        Rota rota = new Rota(estacoes, veiculo);

        // Adicionar passageiros aleatórios ao metrô
        List<Passageiro> passageirosAleatorios = gerarPassageirosAleatorios();
        veiculo.getPassageiros().addAll(passageirosAleatorios);

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("");
            System.out.println("Estação atual: " + rota.getEstacaoAtual().getNome());
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            System.out.println("0 - Finalizar");
            System.out.println("1 - Ir para a próxima estação");
            System.out.println("2 - Sair do metrô");
            System.out.println("3 - Conversar com pessoa aleatória");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                case 1:
                    rota.proximaEstacao();
                    break;
                case 2:
                    rota.sairDoMetro();
                    break;
                case 3:
                    rota.conversarComPessoaAleatoria();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static List<Passageiro> gerarPassageirosAleatorios() {
        List<Passageiro> passageiros = new ArrayList<>();
        passageiros.add(new Passageiro("João"));
        passageiros.add(new Passageiro("Maria"));
        passageiros.add(new Passageiro("Pedro"));
        passageiros.add(new Passageiro("Ana"));
        passageiros.add(new Passageiro("Carlos"));
        passageiros.add(new Passageiro("Laura"));
        passageiros.add(new Passageiro("Rafael"));
        passageiros.add(new Passageiro("Mariana"));
        passageiros.add(new Passageiro("Lucas"));
        passageiros.add(new Passageiro("Isabela"));
        return passageiros;
    }
}
