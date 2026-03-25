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

    public void listarEquipes() {
        for (Equipe e : equipes) {
            e.exibir();
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            for (Usuario u : usuarios) {
                u.exibir();
            }
        }
    }

    public Usuario login(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.login.equals(login) && u.senha.equals(senha)) {
                return u;
            }
        }
        return null;
    }
}
