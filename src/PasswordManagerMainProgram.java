import java.util.Scanner;

public class PasswordManagerMainProgram {
    public static void main(String [] args) {
        // ініціалізація об'єктів
        Scanner input = new Scanner(System.in);
        Credential cred1 = new Credential();
        Credential cred2 = new Credential();
        Credential cred3 = new Credential();

        //створення інформації в поля credentials
        cred1.setCredential("Instagram", "v14_banada", "5018429-");
        cred2.setCredential("Riot", "Lite_", "JJFWYVV3df7h-");
        cred3.setCredential("Steam", "vladi0", "qfqfqfjof");

        // ініціалізація масиву vault
        Credential[] vault = new Credential[3];

        // внесення значень до масиву
        vault[0] = cred1;
        vault[1] = cred2;
        vault[2] = cred3;

        //пошук credential
        System.out.println("Enter a credential for a search: ");
        String query = input.nextLine();
        for(int i = 0; i < 3; i++) {
            String description = vault[i].getCredential()[0];
            if(description.equals(query)){
                System.out.println(vault[i].getInfo());
            }
        }
    }
}
