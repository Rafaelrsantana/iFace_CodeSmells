import java.util.Scanner;

public class Communities extends Login {
    
    private String[] community = new String[5];
    private String[] membros = new String[5];
    private int total_communities = 0;
    private String description;

    Scanner input = new Scanner(System.in);
    

    public void setCommunity() {
        try {
            System.out.println("Digite o nome da comunidade que voce deseja entrar: ");
            String community = input.nextLine();
            this.community[total_communities] = community;
            System.out.println("Voce entrou na comunidade " + community + " com sucesso!");
            total_communities++;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você só pode fazer parte de 5 comunidades!");
        }

    }

    public void setMyCommunity() {
        try {
            System.out.println("Digite o nome da comunidade que voce deseja criar: ");
            String community = input.nextLine();
            this.community[total_communities] = community;
            System.out.println("Digite a descrição dessa comunidade: ");
            description = input.nextLine();
            System.out.println("Sua comunidade " + community + " foi criada com sucesso!");
            total_communities++;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você só pode fazer parte de 5 comunidades!");
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
                    System.out.println("Descrição: " + description);
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
        community = null;
        System.out.println("Voce encerrou sua conta com sucesso!");

    }
}