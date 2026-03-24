import java.util.ArrayList;

public class Equipe {
    String nome;
    String descricao;
    ArrayList<Usuario> membros = new ArrayList<>();

    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarMembro(Usuario u) {
        membros.add(u);
    }

    public void exibir() {
        System.out.println("Equipe: " + nome);
        for (Usuario u : membros) {
            u.exibir();
        }
    }
}
