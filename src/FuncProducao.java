public class FuncProducao extends Funcionario {
    private String turno;

    public FuncProducao() {
    }

    public FuncProducao(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário de produção " + getNome() + " está trabalhando no turno " + turno + ".");
    }

    public void operar() {
        System.out.println("Funcionário de produção " + getNome() + " está operando o maquinário.");
    }
}
