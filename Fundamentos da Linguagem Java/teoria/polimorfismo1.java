interface Animal {

    void fazerSom();
    //animal faz som
}
class Cachorro implements Animal {
    
    public void fazerSom() {
        System.out.println("Au au");
    }
}
class Gato implements Animal {
    
    public void fazerSom() {
        System.out.println("Miau");
    }
}

public class Polimorfismo1 {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Saída: Au au

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Saída: Miau
    }
}

//polimorfismo é a capacidade de um objeto se comportar de diferentes formas dependendo do contexto em que é usado.
//exemplo de polimorfismo em java
//neste exemplo, a interface Animal define um método fazerSom() que é implementado por duas classes: Cachorro e Gato.
//cada classe fornece sua própria implementação do método fazerSom().
//no método main, um objeto do tipo Animal é criado e pode referenciar tanto um Cachorro quanto um Gato.
//quando o método fazerSom() é chamado, a implementação correta é executada com base no tipo real do objeto.

//quando eu declaro a interface animal, eu estou criando um contrato que todas as classes que implementam essa interface 
// devem seguir.
//isso significa que todas as classes que implementam a interface animal devem fornecer uma implementação para o método fazerSom().
//entao eu so define o metodo fazerSom() na interface, mas nao defino como ele funciona.
//quando eu crio a classe cachorro e a classe gato, eu estou implementando a interface animal.
//isso significa que eu estou fornecendo uma implementacao para o metodo fazerSom() definido na interface.
//na classe cachorro, eu defino que o metodo fazerSom() imprime "Au au"
//na classe gato, eu defino que o metodo fazerSom() imprime "Miau"
//isso é polimorfismo, porque o mesmo metodo fazerSom() se comporta de formas diferentes dependendo do objeto que o chama.

