// ExemploForEach.java
public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        // Print an empty line to give space between the output of the first and second for loop
        System.out.println();

        // The traditional way
        for (int x = 0; x < alunos.length; x++) {
            System.out.println(alunos[x]);
        }

    }
}

/*
 * To keep track of the index of the array is necessary create another variable
 * when using For Each:
 * 
 * public class ExemploForEach {
 * public static void main(String[] args) {
 * String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
 * 
 * int index = 0;
 * for (String aluno : alunos) {
 * System.out.println("O aluno no indice x = " + index + " é " + aluno);
 * index++;
 * }
 * }
 * }
 */