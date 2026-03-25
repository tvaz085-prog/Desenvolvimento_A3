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

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, String status, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.gerente = gerente;
    }

    public void adicionarEquipe(Equipe e) {
        if (!equipes.contains(e)) {
            equipes.add(e);
        }
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public void exibir() {
        System.out.println("\nProjeto: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Início: " + dataInicio);
        System.out.println("Fim: " + dataFim);
        System.out.println("Status: " + status);
        System.out.println("Gerente: " + gerente.nome);

        if (!equipes.isEmpty()) {
            for (Equipe e : equipes) {
                e.exibir();
            }
        }

        System.out.println("Tarefas:");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
        } else {
            for (Tarefa t : tarefas) {
                t.exibir();
            }
        }
    }
}
