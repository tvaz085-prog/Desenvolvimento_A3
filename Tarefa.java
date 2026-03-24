public class Tarefa {
    String nome;
    String descricao;
    String status;
    Usuario responsavel;

    public Tarefa(String nome, String descricao, Usuario responsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.status = "Pendente";
    }

    public void exibir() {
        System.out.println("Tarefa: " + nome + " - " + status);
    }
}
