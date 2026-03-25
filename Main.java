import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        Usuario usuarioLogado = null;

        while (usuarioLogado == null) {
            System.out.println("\n1 - Login");
            System.out.println("2 - Novo usuário");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Login: ");
                String login = sc.nextLine();
                System.out.print("Senha: ");
                String senha = sc.nextLine();

                usuarioLogado = sistema.login(login, senha);

                if (usuarioLogado == null) {
                    System.out.println("Login inválido");
                } else {
                    System.out.println("Bem-vindo, " + usuarioLogado.nome);
                }

            } else if (op == 2) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();
                System.out.print("Login: ");
                String novoLogin = sc.nextLine();
                System.out.print("Senha: ");
                String novaSenha = sc.nextLine();

                System.out.println("Selecione o perfil:");
                System.out.println("1 - Administrador");
                System.out.println("2 - Gerente");
                System.out.println("3 - Colaborador");

                int tipo = sc.nextInt();
                sc.nextLine();

                String perfil;

                if (tipo == 1) perfil = "administrador";
                else if (tipo == 2) perfil = "gerente";
                else perfil = "colaborador";

                Usuario u = new Usuario(nome, cpf, email, cargo, novoLogin, novaSenha, perfil);
                sistema.cadastrarUsuario(u);

                System.out.println("Usuário cadastrado com sucesso");
                System.out.println("Um e-mail de confirmação será enviado para o endereço informado.");
                System.out.println("Acesse seu e-mail para ativar sua conta.");

            } else if (op == 0) {
                sc.close();
                return;
            }
        }

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Usuário / Colaborador");
            System.out.println("2 - Cadastrar equipe");
            System.out.println("3 - Cadastrar projeto");
            System.out.println("4 - Cadastrar tarefa");
            System.out.println("5 - Listar projetos");
            System.out.println("6 - Listar equipes");
            System.out.println("7 - Listar Usuários / Colaboradores");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Login: ");
                    String login = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    System.out.println("Selecione o perfil:");
                    System.out.println("1 - Administrador");
                    System.out.println("2 - Gerente");
                    System.out.println("3 - Colaborador");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    String perfil;

                    if (tipo == 1) perfil = "administrador";
                    else if (tipo == 2) perfil = "gerente";
                    else perfil = "colaborador";

                    Usuario usuario = new Usuario(nome, cpf, email, cargo, login, senha, perfil);
                    sistema.cadastrarUsuario(usuario);

                    System.out.println("Usuário cadastrado com sucesso");
                    break;

                case 2:
                    System.out.print("Nome da equipe: ");
                    String nomeEquipe = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descEquipe = sc.nextLine();

                    Equipe equipe = new Equipe(nomeEquipe, descEquipe);

                    if (!sistema.usuarios.isEmpty()) {

                        int opcaoAdicionar;

                        do {
                            System.out.println("Escolha um usuário:");

                            for (int i = 0; i < sistema.usuarios.size(); i++) {
                                Usuario u = sistema.usuarios.get(i);

                                if (!equipe.membros.contains(u)) {
                                    System.out.println(i + " - " + u.nome);
                                }
                            }

                            int idx = sc.nextInt();
                            sc.nextLine();

                            Usuario selecionado = sistema.usuarios.get(idx);

                            if (!equipe.membros.contains(selecionado)) {
                                equipe.adicionarMembro(selecionado);
                            }

                            System.out.println("Adicionar outro usuário?");
                            System.out.println("1 - Sim");
                            System.out.println("0 - Não");

                            opcaoAdicionar = sc.nextInt();
                            sc.nextLine();

                        } while (opcaoAdicionar == 1);
                    }

                    sistema.cadastrarEquipe(equipe);
                    break;

                case 3:
                    System.out.print("Nome do projeto: ");
                    String nomeProj = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descProj = sc.nextLine();
                    System.out.print("Data início: ");
                    String inicio = sc.nextLine();
                    System.out.print("Data fim: ");
                    String fim = sc.nextLine();
                    System.out.print("Status: ");
                    String status = sc.nextLine();

                    Projeto projeto = new Projeto(nomeProj, descProj, inicio, fim, status, usuarioLogado);

                    if (!sistema.equipes.isEmpty()) {
                        System.out.println("Escolha equipe:");
                        for (int i = 0; i < sistema.equipes.size(); i++) {
                            System.out.println(i + " - " + sistema.equipes.get(i).nome);
                        }

                        int e = sc.nextInt();
                        sc.nextLine();

                        projeto.adicionarEquipe(sistema.equipes.get(e));
                    }

                    sistema.cadastrarProjeto(projeto);
                    break;

                case 4:
                    if (sistema.projetos.isEmpty()) break;

                    System.out.print("Nome da tarefa: ");
                    String nomeT = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descT = sc.nextLine();
                    System.out.print("Status: ");
                    String statusT = sc.nextLine();

                    System.out.println("Escolha responsável:");
                    for (int i = 0; i < sistema.usuarios.size(); i++) {
                        System.out.println(i + " - " + sistema.usuarios.get(i).nome);
                    }

                    int r = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escolha projeto:");
                    for (int i = 0; i < sistema.projetos.size(); i++) {
                        System.out.println(i + " - " + sistema.projetos.get(i).nome);
                    }

                    int p = sc.nextInt();
                    sc.nextLine();

                    Tarefa tarefa = new Tarefa(nomeT, descT, sistema.usuarios.get(r), statusT);
                    sistema.projetos.get(p).adicionarTarefa(tarefa);
                    break;

                case 5:
                    sistema.listarProjetos();
                    break;

                case 6:
                    sistema.listarEquipes();
                    break;

                case 7:
                    sistema.listarUsuarios();
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
