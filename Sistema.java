import java.util.ArrayList;

public class Sistema {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Projeto> projetos = new ArrayList<>();
    ArrayList<Equipe> equipes = new ArrayList<>();

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void cadastrarEquipe(Equipe e) {
        equipes.add(e);
    }

    public void cadastrarProjeto(Projeto p) {
        projetos.add(p);
    }

    public void listarProjetos() {
        for (Projeto p : projetos) {
            p.exibir();
        }
    }
}
