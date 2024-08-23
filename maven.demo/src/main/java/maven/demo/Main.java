package maven.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DAO dao = new DAO();
        dao.conectar();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Inserir usuário");
            System.out.println("2. Mostrar usuários do sexo masculino");
            System.out.println("3. Atualizar usuário");
            System.out.println("4. Excluir usuário");
            System.out.println("5. Mostrar todos os usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Inserir um usuário
                    Usuario usuario = new Usuario(11, "pablo", "pablo", 'M');
                    if (dao.inserirUsuario(usuario)) {
                        System.out.println("Inserção com sucesso -> " + usuario.toString());
                    }
                    break;

                case 2:
                    // Mostrar usuários do sexo masculino
                    System.out.println("==== Mostrar usuários do sexo masculino === ");
                    Usuario[] usuariosMasculinos = dao.getUsuariosMasculinos();
                    for (Usuario u : usuariosMasculinos) {
                        System.out.println(u.toString());
                    }
                    break;

                case 3:
                    // Atualizar um usuário
                    Usuario usuarioAtualizar = new Usuario(11, "pablo", "nova senha", 'M');
                    dao.atualizarUsuario(usuarioAtualizar);
                    System.out.println("Usuário atualizado -> " + usuarioAtualizar.toString());
                    break;

                case 4:
                    // Excluir um usuário
                    dao.excluirUsuario(11);
                    System.out.println("Usuário excluído.");
                    break;

                case 5:
                    // Mostrar todos os usuários
                    System.out.println("==== Mostrar todos os usuários === ");
                    Usuario[] todosUsuarios = dao.getUsuarios();
                    for (Usuario u : todosUsuarios) {
                        System.out.println(u.toString());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        dao.close();
        scanner.close();
    }
}
