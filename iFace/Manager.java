import java.util.Scanner;

public class Manager extends Create
{
    private String[] accounts = new String [3];
    private String[] passwords = new String [3];
    private int total_accounts = 0;
    private int total_passwords = 0;
    int key = 0;
    Scanner input = new Scanner(System.in);

    public void setAccounts() {
        while(true){
            System.out.println("\nInsira o login: ");
            String user = input.nextLine();
            for(int i=0; i<accounts.length; i++) {
                if(user.equals(accounts[i])) {
                    key++;
                }
            }

            if(key > 0){
                System.out.println("\nLogin já existente!");
                key = 0;
            }
            else {
                accounts[total_accounts] = user;
                total_accounts++;
                setLogin(user);
                key = 0;
                break;
            }
        }

    }

    public void setPasswords() {
        System.out.println("Insira a senha(somente números!): ");
        String password = input.nextLine();
        this.passwords[total_passwords] = password;
        total_passwords++;
    }

    public String getAccounts(int i)
    {
        return accounts[i];
        
    }

    public String getPasswords(int i)
    {
        return passwords[i];
    }

}
