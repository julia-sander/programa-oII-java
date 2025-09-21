// Este é um programa Java simples.

class Example {
    // Um programa Java começa com uma chamada a main()
    public static void main(String args[]) {
        System.out.println("Java drives the Web.");
    }
}

// Em Java, todo código deve residir dentro de uma classe. Por convenção, o nome da classe
// principal deve coincidir com o nome do arquivo que contém o programa.

// Quando o código-fonte Java é compilado, cada class é inserida em seu próprio arquivo de saída
// com o mesmo nome da classe usando a extensão .class. É por isso que é uma boa ideia dar 
// a seus arquivos-fonte Java o mesmo nome da classe que eles contêm - o nome do arquivo-fonte
// coincidirá com o nome do arquivo .class. 
// Quando você executar o interpretador de Java, estará especificando o nome da classe que deseja 
// que o interpretador execute. Ele procurará automaticamente um arquivo com esse nome que tenha a 
// extensão .class. Se encontrar, executará o código contido na classe especuificada.

// basicamente entao eu compilo o arquivo, todas as classes tem seus proprios arquivos .class
// e quando eu executo o programa, eu passo o nome da classe que contem o metodo main

// A palavra-chave public é um modificar de acesso. Um modificador de acesso determina como outras partes do 
// programa podem acessar os membros da classe.
// main() deve ser declarado como public, já que tem que ser chamado por um código de froa de sua classe quando o
// programa for iniciado.

// A palavra-chave static permite que main() seja chamado antes de um objeto da classe ter sido criado.
// Isso é necessário porque nenhum objeto existe quando o programa é iniciado.

//Em main(), String[] args é um parâmetro. Ele especifica que o método main() aceita um argumento - um array 
// de objetos String.
// args recebe qualquer argumento de linha de comando presente quando o programa é executado.

// println() exibe o string que é passado para ele. 
// System é uma classe predefinida que dá acesso ao sistema, e out é o fluxo de saída do console. Portanto, 
// System.out é um objeto que encapsula a saída do console. Basicamente, Java usa um objeto para definir a saída
// do console.
// A instrução System.out.println() é uma chamada de método. Ela chama o método println() do objeto System.out.
