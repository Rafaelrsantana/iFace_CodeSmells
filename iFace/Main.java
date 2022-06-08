import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static int loadInput() {
        Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        int key = 0;
        while (!correctInput) {
            try {
                key = Integer.parseInt(input.next());
                correctInput = true;
            } catch (Exception e) {
                System.out.println("Voce não digitou um numero(s)! Digite um numero(s) inteiro! ");

            }
        }
        return key;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Create_Edit user0 = new Create_Edit();
        Interaction interaction = new Interaction();
        Feed feed = new Feed();
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        ArrayList<Create> info_profile = new ArrayList();

        while (true) {
            login.setLogin();

            System.out.println(
                    "\nOla! Seja bem vindo(a) ao iFace! Digite o numero da opcao que voce deseja executar:\n1 - Editar perfil\n2 - Adicionar amigos\n3 - Enviar mensagem\n4 - Comunidades\n5 - Recuperar informacoes\n6 - Encerrar conta\n7 - Privacidade\n8 - Sair");
            String option2 = input.nextLine();

            while (option2.equals("8") == false) {
                if (option2.equals("1")) {
                    System.out.println(
                            "\nDigite o numero da opcao que voce deseja editar ou se deseja criar um atributo:\n1 - Nome\n2 - Idade\n3 - Genero\n4 - Endereco\n5 - Telefone\n6 - Criar atributo\n7 - Voltar");
                    String option3 = input.nextLine();
                    while (option3.equals("7") == false) {
                        if (option3.equals("1")) {
                            user0.setName();
                        } else if (option3.equals("2")) {
                            System.out.println("Digite a nova idade: ");
                            int key = loadInput();
                            user0.setAge(key);

                        } else if (option3.equals("3")) {
                            user0.setGender();

                        } else if (option3.equals("4")) {
                            user0.setAddress();

                        } else if (option3.equals("5")) {
                            user0.setPhone();

                        } else if (option3.equals("6")) {
                            try { 
                                user0.Create();

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("O número máximo de atributos criados ja foi atingido!");
                            }
                        }
                        System.out.println(
                                "\nDigite o numero da opcao que voce deseja editar ou se deseja criar um atributo:\n1 - Nome\n2 - Idade\n3 - Genero\n4 - Endereco\n5 - Telefone\n6 - Criar atributo\n7 - Voltar");
                        option3 = input.nextLine();

                    }

                } else if (option2.equals("2")) {
                    try {
                        interaction.setFriend();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Limite máximo de amigos atingido!");
                    }

                } else if (option2.equals("3")) {
                    interaction.sendMessage();

                } else if (option2.equals("4")) {
                    System.out.println(
                            "\nVoce deseja criar ou entrar em uma comunidade? Digite o numero da opcao que voce deseja executar:\n1 - Criar\n2 - Entrar");
                    String option5 = input.nextLine();

                    if (option5.equals("1")) {
                        interaction.setMyCommunity();

                    } else if (option5.equals("2")) {
                        interaction.setCommunity();

                    }

                } else if (option2.equals("5")) {
                    System.out.println(
                            "\nDigite o numero da informacao que voce deseja recuperar:\n1 - Perfil\n2 - Amigos\n3 - Mensagens\n4 - Comunidades\n5 - Voltar");
                    String option6 = input.nextLine();
                    while (option6.equals("5") == false) {
                        if (option6.equals("1")) {
                            user0.getName();
                            user0.getAge();
                            user0.getGender();
                            user0.getAddress();
                            user0.getPhone();
                            user0.getAttribute();

                        } else if (option6.equals("2")) {
                            interaction.getFriend();

                        } else if (option6.equals("3")) {
                            interaction.getMessage();

                        } else if (option6.equals("4")) {
                            interaction.getCommunity();
                        }
                        System.out.println(
                                "\nDigite o numero da informacao que voce deseja recuperar:\n1 - Perfil\n2 - Amigos\n3 - Mensagens\n4 - Comunidades\n5 - Voltar");
                        option6 = input.nextLine();
                    }

                } else if (option2.equals("6")) {
                    System.out.println(
                            "Voce realmente deseja encerrar sua conta? Digite a opcao que voce deseja executar: sim ou nao");
                    String option7 = input.nextLine();
                    if (option7.equals("sim")) {
                        user0.delete();
                        interaction.finish();
                        System.exit(0);
                    } else if (option7.equals("nao")) {
                        System.out.println("Eba! Voce nao encerrou sua conta!");
                    }
                } else if (option2.equals("7")) {
                    System.out.println(
                            "Voce deseja que todos os usuarios possam ver suas mensagens no feed ou somente amigos? Digite 1 para Todos ou 2 para Somente amigos.");
                    String public_feed_response = input.nextLine();
                    try {
                        int key = Integer.parseInt(public_feed_response);
                        if (key == 1) {
                            feed.messageFeedAll();
                        } else if (key == 2) {
                            feed.messageFeedFriends();

                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Opcao invalida! Digite uma resposta válida.");
                    }

                } else if (option2.equals("8")) {
                    System.exit(0);
                }

                System.out.println(
                        "\nDigite o numero da opcao que voce deseja executar:\n1 - Editar perfil\n2 - Adicionar amigos\n3 - Enviar mensagem\n4 - Comunidades\n5 - Recuperar informacoes\n6 - Encerrar conta\n7 - Privacidade\n8 - Sair");
                option2 = input.nextLine();
            }

            info_profile.add(user0);

        }

    }
}