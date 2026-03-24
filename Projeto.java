import java.util.ArrayList;

public class Projeto {
    String nome;
    String descricao;
    String dataInicio;
    String dataFim;
    String status;
    Usuario gerente;

    ArrayList<Equipe> equipes = new ArrayList<>();
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.gerente = gerente;
        this.status = "Planejado";
    }

    public void adicionarEquipe(Equipe e) {
        equipes.add(e);
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public void exibir() {
        System.out.println("\nProjeto: " + nome);
        System.out.println("Gerente: " + gerente.nome);
        System.out.println("Status: " + status);

        System.out.println("Equipes:");
        for (Equipe e : equipes) {
            e.exibir();
        }

        System.out.println("Tarefas:");
        for (Tarefa t : tarefas) {
            t.exibir();
        }
    }
}
