import java.util.Scanner;

public class Login extends Manager {

    Scanner input = new Scanner(System.in);
    
    public void setLogin(){
        boolean in = false;
        System.out.println(
                        "Ola! Seja bem vindo(a) ao iFace! Digite o número da opção que deseja executar:\n1 - Criar conta\n2 - Entrar");
                String option = input.nextLine();
                while (!in) {
                    if (option.equals("1")) {
                        try {
                            setAccounts();
                            setPasswords();
                            setName();
                            in = true;
                            break;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Limite de contas criadas no iFace atingido!");
                        }
    
                    } else if (option.equals("2")) {
                        System.out.println("\nInsira o login: ");
                        String user = input.nextLine();
                        int var = -1;
                        for (int i = 0; i < 3; i++) {
                            if (user.equals(getAccounts(i))) {
                                var = i;
                                break;
                            }
                        }
                        try {
                            System.out.println("Insira a senha(somente números!): ");
                            String password = input.nextLine();
                            if (password.equals(getPasswords(var))) {
                                in = true;
                                break;
                            } else {
                                System.out.println("Senha incorreta!");
                            }
    
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Senha ou login incorretos! Ou conta não exixste.\n");
                        }
    
                    }
    
                    System.out.println(
                            "Ola! Seja bem vindo(a) ao iFace! Digite o número da opção que deseja executar:\n1 - Criar conta\n2 - Entrar");
                    option = input.nextLine();
    
                }
    }
}
