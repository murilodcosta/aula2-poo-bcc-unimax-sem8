import model.FuncProducao;
import model.Gestor;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Produto ===");
        Produto p1 = new Produto("Notebook", 3500.00);
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: R$ " + p1.getPreco());
        System.out.println("Quantidade inicial em estoque: " + p1.getQuantidadeEmEstoque());

        p1.setQuantidadeEmEstoque(15);
        System.out.println("Quantidade atualizada em estoque: " + p1.getQuantidadeEmEstoque());

        System.out.println("\n=== Teste da Hierarquia de Funcionários ===");
        FuncProducao operario = new FuncProducao("Carlos", 2800.00, "Noturno");
        operario.trabalhar();
        operario.operar();

        System.out.println();

        Gestor gerente = new Gestor("Ana", 7500.00);
        gerente.trabalhar();
        gerente.atribuirTarefas();
    }
}