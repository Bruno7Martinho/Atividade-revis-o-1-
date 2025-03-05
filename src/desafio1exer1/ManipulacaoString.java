/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1exer1;

/**
 *
 * @author 7
 */
public class ManipulacaoString {
   private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
   public int contarCaracteres(String palavra){
       return palavra.length();
       
   }
public void verificarImparPar(String palavra){
    if(palavra.length()%2==0){
        System.out.println("O número de caracteres é par!!!");
    }else{
        System.out.println("O número de caracteres é impar!!!");
    }
}
public String inverterPalavra(String palavra){
    StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
        

}
}


