import java.util.Scanner;

public class Friends {

    private String[] friends = new String [5];
    private int total_friends = 0;

    Scanner input = new Scanner(System.in);

    public void setFriend() {
        System.out.println("\nDigite o nome do usuario que voce deseja adicionar: ");
        String user_friend = input.nextLine();
        friends[total_friends] = user_friend;
        total_friends++;
        System.out.println("Solicitacao de amizade enviada!");

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

    public String getTotalFriends(int i)
    {
        return friends[i];
        
    }
    

    public void finishFriends(){
        friends = null;
    }
    
}
