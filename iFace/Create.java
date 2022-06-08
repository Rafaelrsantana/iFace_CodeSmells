import java.util.Scanner;

public class Create
{
    private String name;
    private String login;
    private String password;
    Scanner input = new Scanner(System.in);

    public void setName() {
        System.out.println("Insira seu nome de usuário: ");
        String name = input.nextLine();
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login; 
            
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getName()
    {
        if (name == null) {
            System.out.println(
                    "Nome nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
        } else {
            System.out.println("Nome: " + name);
        }
        
    }

    public String getUser()
    {
        return login;
    }

    public String getPass()
    {
        return password;
    }

    public void delete()
    {
        this.name = null;
        this.login = null;
        this.password = null;

    }
}