interface Forma {
    double CalcularArea();
    double CalcularPerimetro();
}
class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) { //construtor. um metodo especial que é chamado quando um objeto é criado.
        this.raio = raio; //this é uma referencia ao objeto atual. usado para diferenciar entre o atributo e o parametro.
        // o construtor  guarda o valor do raio no atributo raio do objeto.
    }

    public double CalcularArea() {
        return Math.PI * raio * raio;
    }

    public double CalcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}


class Retangulo implements Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double CalcularArea() {
        return largura * altura;
    }

    public double CalcularPerimetro() {
        return 2 * (largura + altura);
    }
}

public class Polimorfismo2 {
    public static void main(String args[]) {
        Forma minhaForma = new Circulo(5);
        System.out.println("Área do Círculo: " + minhaForma.CalcularArea());
        System.out.println("Perímetro do Círculo: " + minhaForma.CalcularPerimetro());

        minhaForma = new Retangulo(4, 6);
        System.out.println("Área do Retângulo: " + minhaForma.CalcularArea());
        System.out.println("Perímetro do Retângulo: " + minhaForma.CalcularPerimetro());
    }
}

//quando inicializo o objeto circulo com new circulo, estou guardando o valor do raio dentro do objeto.