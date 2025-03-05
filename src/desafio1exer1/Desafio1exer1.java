/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1exer1;

import java.util.Scanner;
public class Desafio1exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ManipulacaoString palavra = new ManipulacaoString();
        System.out.println("Digite a palavra:");
        palavra.setPalavra(ler.next());
        System.out.println("O número de caracteres é: " + palavra.contarCaracteres(palavra.getPalavra()));;
        palavra.verificarImparPar(palavra.getPalavra());
        System.out.println(""+ palavra.inverterPalavra(palavra.getPalavra()));
    }
    
}
