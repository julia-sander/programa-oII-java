interface ImplementaPilha {
    void push(int valor); //adiciona um elemento no topo da pilha
    int pop(); //remove e retorna o elemento do topo da pilha
    boolean estaVazia(); //verifica se a pilha está vazia
}

class PilhaInteiro implements ImplementaPilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public PilhaInteiro(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        topo = -1; //pilha vazia
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1; //valor de erro
        }
        return elementos[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}

class PilhaString implements ImplementaPilha {
    private String[] elementos;
    private int topo;
    private int capacidade;

    public PilhaString(int capacidade) {
        this.capacidade = capacidade;
        elementos = new String[capacidade];
        topo = -1; //pilha vazia
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[++topo] = Integer.toString(valor); //converte int para String
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1; //valor de erro
        }
        return Integer.parseInt(elementos[topo--]); //converte String para int
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}

class PilhaFlutuante implements ImplementaPilha {
    private float[] elementos;
    private int topo;
    private int capacidade;

    public PilhaFlutuante(int capacidade) {
        this.capacidade = capacidade;
        elementos = new float[capacidade];
        topo = -1; //pilha vazia
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[++topo] = (float) valor; //converte int para float
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1; //valor de erro
        }
        return (int) elementos[topo--]; //converte float para int
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}

pulic class polimorfismo3 {
    public static void main(String[] args) {
        ImplementaPilha pilhaInt = new PilhaInteiro(5);
        pilhaInt.push(10);
        pilhaInt.push(20);
        System.out.println("Pilha Inteiro Pop: " + pilhaInt.pop());

        ImplementaPilha pilhaStr = new PilhaString(5);
        pilhaStr.push(30);
        pilhaStr.push(40);
        System.out.println("Pilha String Pop: " + pilhaStr.pop());

        ImplementaPilha pilhaFloat = new PilhaFlutuante(5);
        pilhaFloat.push(50);
        pilhaFloat.push(60);
        System.out.println("Pilha Flutuante Pop: " + pilhaFloat.pop());
    }
}

// considere uma pilha (que é uma lista “primeiro a entrar, último a sair”). Você poderia ter um programa que precisasse de três tipos de
//  pilhas diferentes. Uma pilha é usada para valores inteiros, uma para valores de ponto flutuante e uma para caracteres. Nesse caso, o 
// algoritmo que implementa cada pilha é o mesmo, ainda que os dados armazenados sejam diferentes