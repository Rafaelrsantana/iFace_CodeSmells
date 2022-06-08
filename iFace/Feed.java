public class Feed extends Interaction{
    
    public void messageFeedFriends(){
        System.out.println("Agora somente seus amigos: ");  getFriend(); System.out.println("podem ver suas mensagens do feed!");
    }

    public void messageFeedAll(){
        System.out.println("Agora todos os usuários podem ver suas mensagens do feed!");
    }
}
