/* Você pode usar o laço for, a instrução if e os blocos de código para criar uma versão melhorada do conversor
de galões em litros desenvolvida no primeiro projeto. Essa nova versão exibirá uma tabela de conversões começando
com 1 galão e terminando em 100 galões. A cada 10 galões, uma linha em branco será exibida. Isso é feito com o uso
de uma variável chamada counter que conta o número de linhas que foram exibidas. Preste uma atenção especial no
seu uso. */

// Tente isto 1-2
// Este programa exibe uma tabela de conversões de galões em litros.

class GalToLitTable {
    public static void main(String args[]) {

        double gallons, liters;
        int counter;
        counter = 10;

        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++;

            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}