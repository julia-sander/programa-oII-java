class Animal {               // Classe geral
    String nome;
    int idade;

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

class Cachorro extends Animal {  // Subclasse específica
    void latir() {
        System.out.println(nome + " diz Au Au!");
    }
}

public class herança1 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.nome = "Rex";
        c.idade = 3;

        c.dormir(); // herdado da superclasse Animal
        c.latir();  // definido apenas na subclasse Cachorro
    }
}

//Cachorro herda atributos e métodos de Animal (nome, idade, dormir()).
//Cachorro só precisa definir o que é único (latir()).
//O objeto c é uma instância específica de Animal: é um Cachorro, mas também tem tudo que é comum aos animais.