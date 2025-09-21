/* Neste projeto, criaremos um programa que converte galões em litros. O programa funcionará declarando duas 
variáveis double. Uma conterá o número de galões e a outra o número de litros após a conversão. Seja um galão
equivalente a 3,7854 litros. Logo, na conversã de galões em litros, o valor do galão é multiplicado por 3,7854.
O program exibe tanto o número de galões quanto o número equivalente em litros. */

// Tente isto 1-1
class GalToLit {
    public static void main(String args[]) {

        double galao, litro;

        galao = 10;
        litro = galao * 3.7854; 

        System.out.println(galao + " galões é equivalente a " + litro + " litros.");
    }
}