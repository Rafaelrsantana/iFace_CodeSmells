import java.util.Scanner;

public class Messages extends Friends {
    private String[] message = new String[5];
    private int total_messages = 0;
    private String[] received = new String[5];

    Scanner input = new Scanner(System.in);

    public void sendMessage() {
        System.out.println(
                "\nVoce deseja enviar uma mensagem para um amigo, comunidade ou no feed de noticias? Digite o numero da opcao que voce deseja executar:\n1 - Amigo\n2 - Comunidade\n3 - Feed\n4 - Voltar");
        String option = input.nextLine();
        while (option.equals("4") == false) {
            if (option.equals("1")) {
                try {
                    System.out
                                .println("Digite o login do amigo que voce deseja enviar a mensagem: ");
                    String key = input.nextLine();
                    int var = -1;

                    for (int i = 0; i < 5; i++) {
                        if (key.equals(getTotalFriends(i))) {
                            var = 1;
                            
                        }
                        
                    }
                    
                    if(var == 1){
                        System.out.println("Digite a mensagem que voce deseja enviar: ");
                        String message = input.nextLine();
                        setMessage(message, total_messages, key);
                        total_messages++;
                        System.out.println("Mensagem enviada!");
                    }else {
                        System.out.println("Amigo nao encontrado! Voce pode adicionar amigos indo em Adicionar amigos no menu iFace.");
                        
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Máximo de mensagens diárias enviadas atingido!");
                }

            } else if (option.equals("2")) {
                try {
                    System.out.println("Digite o nome da comunidade que voce deseja enviar a mensagem: ");
                    String key = input.nextLine();
                    System.out.println("Digite a mensagem: ");
                    String message = input.nextLine();
                    setMessage(message, total_messages, key);
                    total_messages++;
                    System.out.println("Mensagem enviada!");
                } catch (ArrayIndexOutOfBoundsException e) {
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

    public void messageFeedFriends(){
        System.out.println("Esses são os seus amigos que podem ver suas mensagens no FEED: "); getFriend(); 
    }

    public void messageFeedAll(){
        System.out.println("Agora todos os usuários podem ver suas mensagens do feed!");
    }

    public void setMessage(String message, int i, String received) {
        this.message[i] = message;
        this.received[i] = received;
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

    public void finishMessage() {
        message = null;
    }

}
