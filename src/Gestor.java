public class Gestor extends Funcionario {

    public Gestor() {
    }

    public Gestor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gestor " + getNome() + " está coordenando a equipe e acompanhando metas.");
    }

    public void atribuirTarefas() {
        System.out.println("Gestor " + getNome() + " está atribuindo tarefas aos colaboradores.");
    }
}
