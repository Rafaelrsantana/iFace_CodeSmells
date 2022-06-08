import java.util.Scanner;

public class Interaction extends Create {

    private String[] friends = new String[5];
    private String[] message = new String[5];
    private String[] community = new String[5];
    private String[] membros = new String[5];
    private String[] received = new String[5];
    private int total_friends = 0;
    private int total_messages = 0;
    private int total_communities = 0;
    Scanner input = new Scanner(System.in);

    public void sendMessage() {
        System.out.println(
                "\nVoce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite o numero da opcao que voce deseja executar:\n1 - Amigo\n2 - Comunidade\n3 - Feed\n4 - Voltar");
        String option = input.nextLine();
        while (option.equals("4") == false) {
            if (option.equals("1")) {
                try{
                    if (total_friends == 0) {
                        System.out.println(
                                "Voce nao tem amigos adicionados! Voce pode adicionar amigos indo em Adicionar amigos no menu iFace.");
                    } else {
                        System.out
                                .println("Digite o login do amigo que voce deseja enviar a mensagem: ");
                        String key = input.nextLine();
                        System.out.println("Digite a mensagem que voce deseja enviar: ");
                        String message = input.nextLine();
                        setMessage(message, total_messages, key);
                        total_messages++;
                        System.out.println("Mensagem enviada!");
                    }

                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Máximo de mensagens diárias enviadas atingido!");
                }

            } else if (option.equals("2")) {
                try{
                    System.out.println("Digite o nome da comunidade que voce deseja enviar a mensagem: ");
                    String key = input.nextLine();
                    System.out.println("Digite a mensagem: ");
                    String message = input.nextLine();
                    setMessage(message, total_messages, key);
                    total_messages++;
                    System.out.println("Mensagem enviada!");
                }catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Máximo de mensagens diárias enviadas atingido!");

                }

            } else if (option.equals("3")) {
                try {
                    System.out.println("Digite a mensagem: ");
                    String message = input.nextLine();
                    setMessage(message, total_messages, "feed");
                    System.out.println("Mensagem enviada!");
                    total_messages++;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Máximo de mensagens diárias enviadas atingido!");
                }
            }
            System.out.println(
                    "\nVoce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite o numero da opcao que voce deseja executar:\n1 - Amigo\n2 - Comunidade\n3 - Feed\n4 - Voltar");
            option = input.nextLine();
        }
    }

    public void setFriend() {
        System.out.println("\nDigite o nome do usuario que voce deseja adicionar: ");
        String user_friend = input.nextLine();
        this.friends[total_friends] = user_friend;
        total_friends++;
        System.out.println("Solicitacao de amizade enviada!");

    }

    public void setMessage(String message, int i, String received) {
        this.message[i] = message;
        this.received[i] = received;
    }

    public void setCommunity() {
        try {
            System.out.println("Digite o nome da comunidade que voce deseja entrar: ");
            String community = input.nextLine();
            this.community[total_communities] = community;
            System.out.println("Voce entrou na comunidade " + community + " com sucesso!");
            total_communities++;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você só pode fazer parte de 10 comunidades!");
        }

    }

    public void setMyCommunity() {
        try {
            System.out.println("Digite o nome da comunidade que voce deseja criar: ");
            String community = input.nextLine();
            this.community[total_communities] = community;
            this.membros[total_communities] = getUser();
            System.out.println("Digite a descrição dessa comunidade: ");
            String description = input.nextLine();
            System.out.println("Sua comunidade " + community + " foi criada com sucesso!");
            membros[total_communities] = getUser();
            total_communities++;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você só pode fazer parte de 5 comunidades!");
        }
    }

    public void getFriend() {
        if (total_friends == 0) {
            System.out.println(
                    "Voce nao tem amigos adicionados! Voce pode adicionar amigos indo em Adicionar amigos no menu iFace.");
        } else {
            System.out.println("Seus amigos são: ");
            for (int i = 0; i < friends.length; i++) {
                if (friends[i] != null) {
                    System.out.println(friends[i]);
                }
            }

        }
    }

    public void getMessage() {
        if (total_messages == 0) {
            System.out.println(
                    "Voce nao tem mensagens! Voce pode enviar mensagens indo em Mensagens no menu iFace.");
        } else {
            System.out.println("Suas mensagens são: ");
            for (int i = 0; i < message.length; i++) {
                if (message[i] != null) {
                    System.out.println(message[i] + " -> enviado para: " + received[i]);
                }
            }
        }
    }

    public void getCommunity() {
        if (total_communities == 0) {
            System.out.println(
                    "Voce nao tem comunidades! Voce pode criar ou fazer parte de comunidades indo em Comunidades no menu iFace.");
        } else {
            System.out.println("Suas comunidades são: ");
            for (int i = 0; i < community.length; i++) {
                if (community[i] != null) {
                    System.out.println(community[i]);
                }
            }
            System.out
                    .println("Voce deseja saber os membros da sua comunidade? Digite sim ou nao:");
            String option = input.nextLine();
            if (option.equals("sim")) {
                System.out.println("Os membros da sua comunidade são: ");
                getMembers();
            }
        }
    }

    public void getMembers() {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null) {
                System.out.println(membros[i]);
            }
        }
    }

    public void finish() {
        friends = null;
        message = null;
        community = null;
        System.out.println("Voce encerrou sua conta com sucesso!");

    }
}