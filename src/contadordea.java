import java.util.Scanner;

class ContadorDaLetraA {

    public static void main(String[] args) {
        // Solicita uma palavra ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        // Converte a palavra para minúsculas para simplificar a contagem
        String lowerCaseInput = input.toLowerCase();

        // Variável para contar a quantidade de 'a'
        int count = 0;

        // Loop para verificar cada caractere da palavra
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                count++;
            }
        }

        // Verifica se há pelo menos letra 'a'
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na palavra.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na palavra.");
        }

        scanner.close();
    }
}
