import java.util.Scanner;

public class Retangulo {
    private int largura;
    private int altura;

    //construtor
    public Retangulo (int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularArea () {
        return largura * altura;
    }

    public int calcularPerimetro () {
        return 2 * (largura + altura);
    }

    public void exibirInformacoes () {
        System.out.println("Largura do retângulo: " + largura);
        System.out.println("Altura do retângulo: " + altura);
        System.out.println("A área do retangulo é: " + calcularArea());
        System.out.println("O perímetro do retângulo é: " + calcularPerimetro());
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getArea() {
        return calcularArea();
    }

    public int getPerimetro(){
        return calcularPerimetro();
    }
}