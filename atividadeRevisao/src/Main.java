import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor de retângulos com capacidade de 5
        Retangulo[] retangulos = new Retangulo[5];

        // Usuário digita as medidas dos retângulos
        for (int i = 0; i < retangulos.length; i++ ) {
            System.out.println("Digite as dimensões do retângulo " + (i + 1) + ":");

            System.out.print("Digite a largura: ");
            int largura = scanner.nextInt();

            System.out.print("Digite a altura: ");
            int altura = scanner.nextInt();

            retangulos[i] = new Retangulo(largura, altura);
        }

        // Exibe as informações dos retângulos
        System.out.println("\nInformações dos retângulos:");
        for (int i = 0; i < retangulos.length; i++) {
            System.out.println("\nRetângulo " + (i + 1) + ":");
            retangulos[i].exibirInformacoes();
        }

        // Retângulo com maior área
        Retangulo maiorArea = retangulos[0];
        for (Retangulo retangulo : retangulos) {
            if (retangulo.getArea() > maiorArea.getArea()) {
                maiorArea = retangulo;
            }
        }
        System.out.println("\nRetângulo com maior área:");
        maiorArea.exibirInformacoes();

        // Retângulo com menor perímetro
        Retangulo menorPerimetro = retangulos[0];
        for (Retangulo retangulo : retangulos) {
            if (retangulo.getPerimetro() < menorPerimetro.getPerimetro()) {
                menorPerimetro = retangulo;
            }
        }
        System.out.println("\nRetângulo com menor perímetro:");
        menorPerimetro.exibirInformacoes();

        // Ordenar retângulos por área
        ordenarRetangulosPorArea(retangulos);
        System.out.println("\nRetângulos ordenados por área:");
        for (Retangulo retangulo : retangulos) {
            System.out.println("\n");
            retangulo.exibirInformacoes();
        }

        // Expansão do vetor de retângulos para 10 posições
        retangulos = expandirVetor(retangulos);

        // Usuário preenche os novos retângulos
        for (int i = 5; i < retangulos.length; i++) {
            System.out.println("\nDigite as dimensões do novo retângulo " + (i + 1) + ":");

            System.out.print("Digite a largura: ");
            int largura = scanner.nextInt();

            System.out.print("Digite a altura: ");
            int altura = scanner.nextInt();

            retangulos[i] = new Retangulo(largura, altura);
        }

        System.out.println("\nInformações dos retângulos após a expansão:");
        for (int i = 0; i < retangulos.length; i++) {
            System.out.println("\nRetângulo " + (i + 1) + ":");
            retangulos[i].exibirInformacoes();
        }

        scanner.close();
    }

    // Método para ordenar retângulos por área usando ordenação por inserção
    private static void ordenarRetangulosPorArea(Retangulo[] retangulos) {
        for (int i = 1; i < retangulos.length; i++) {
            Retangulo atual = retangulos[i];
            int j = i - 1;

            while (j >= 0 && retangulos[j].getArea() > atual.getArea()) {
                retangulos[j + 1] = retangulos[j];
                j--;
            }
            retangulos[j + 1] = atual;
        }
    }

    // Método para expandir o vetor de retângulos
    private static Retangulo[] expandirVetor(Retangulo[] retangulos) {
        Retangulo[] novoArray = new Retangulo[retangulos.length * 2];
        for (int i = 0; i < retangulos.length; i++) {
            novoArray[i] = retangulos[i];
        }
        return novoArray;
    }
}
