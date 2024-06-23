public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Loop that uses break
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break; // Exit the loop when numero is 3

            System.out.println(numero);
        }

        // Print an empty line to give space between the output of the first and second for loop
        System.out.println();

        // Loop that uses continue
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue; // Skip to the next iteration when numero is 3

            System.out.println(numero);
        }
    }
}
