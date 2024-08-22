public class Main {
    public static void main(String[] args) {

        //02- Mostre como inicializar um array unidimencional de inteiros com os valores de 1 a 5
        int array[] = {1, 2, 3, 4, 5};


        //03- Escreva um programa que usa um array para encontrar a média de 10 valores double. Use os 10 valores que quiser
        System.out.println("Questão 03:");

        double[] valores = {1.4, 5.4, 5.3, 6.5, 23.6, 2.6, 8.4, 6.7, 9.3, 0.3};
        double soma = 0.0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;
        System.out.println("A média dos valores é: " + media);


        //06- Já que todos os strings são objetos de tipo string, mostre como chamar os metodos legth() e charAt() neste literal de string "i like Java"
        System.out.println("Questão 06:");
        String string = "i like Java";

        int comprimento = string.length();
        System.out.println("Comprimento da string: " + comprimento);

        char caractere = string.charAt(2);
        System.out.println("Caractere na posição 2: " + caractere);
    }
}