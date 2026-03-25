Sistema de Gestão de Projetos e Equipes

## Descrição

Sistema desenvolvido em **Java** com base nos princípios de **Programação Orientada a Objetos (POO)**, com o objetivo de gerenciar:

- Projetos  
- Equipes  
- Usuários  
- Tarefas  

A solução permite organizar colaboradores, distribuir atividades e acompanhar o progresso dos projetos de forma estruturada.

---

## Funcionalidades

✔ Cadastro de usuários (Administrador, Gerente e Colaborador)  
✔ Autenticação (login)  
✔ Cadastro de equipes com múltiplos membros  
✔ Cadastro de projetos  
✔ Associação de equipes aos projetos  
✔ Cadastro de tarefas com responsável  
✔ Listagem de dados do sistema  

---

## Conceitos Aplicados

- Programação Orientada a Objetos (POO)  
- Encapsulamento  
- Relacionamento entre classes  
- Estruturas de dados (`ArrayList`)  
- Controle de fluxo com menus interativos  

---

## Estrutura do Projeto

```
 src
 ├── Usuario.java
 ├── Equipe.java
 ├── Projeto.java
 ├── Tarefa.java
 ├── Sistema.java
 └── Main.java
```

## Exemplo de Execução

```text
Projeto: Projeto A
Gerente: Thiago
Status: Planejado

Equipe: Equipe 1
João - colaborador

Tarefa: Criar sistema - Pendente - Responsável: João
```

---

## Perfis de Usuário

| Perfil         | Função                          |
|---------------|--------------------------------|
| Administrador | Controle total do sistema      |
| Gerente       | Gestão dos projetos            |
| Colaborador   | Execução das tarefas           |

---

## Regras do Sistema

- Todos os usuários são considerados colaboradores da empresa  
- O perfil define apenas o nível de acesso  
- O responsável da tarefa é vinculado ao projeto  
- O envio de e-mail é apenas simulado  

---

## 👨‍💻 Autor

**Thiago Vaz**  
 *Programação de Soluções Computacionais*
