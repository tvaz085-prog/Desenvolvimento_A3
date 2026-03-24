public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Usuario gerente = new Usuario("Thiago", "123", "email@email.com", "Gerente", "admin", "123", "gerente");
        Usuario dev = new Usuario("Thiago Vaz", "456", "thiagovaz@email.com", "Dev", "user", "123", "colaborador");

        sistema.cadastrarUsuario(gerente);
        sistema.cadastrarUsuario(dev);

        Equipe equipe = new Equipe("Equipe 1", "Equipe de desenvolvimento");
        equipe.adicionarMembro(dev);

        sistema.cadastrarEquipe(equipe);

        Projeto projeto = new Projeto("Projeto A3", "Sistema Java", "01/04", "10/04", gerente);
        projeto.adicionarEquipe(equipe);

        Tarefa tarefa = new Tarefa("Criar sistema", "Desenvolver código", dev);
        projeto.adicionarTarefa(tarefa);

        sistema.cadastrarProjeto(projeto);

        sistema.listarProjetos();
    }
}
