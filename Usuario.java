public class Usuario {
    String nome;
    String cpf;
    String email;
    String cargo;
    String login;
    String senha;
    String perfil;

    public Usuario(String nome, String cpf, String email, String cargo, String login, String senha, String perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void exibir() {
        System.out.println(nome + " - " + perfil);
    }
}
