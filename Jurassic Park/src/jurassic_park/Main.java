package jurassic_park;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	    String nome;
	    System.out.println("Seja bem-vindo ao Jurrasic Park, digite seu nome");
	    nome = in.nextLine();
	    System.out.println("Bem-vindo " + nome);
	    System.out.println("Você quer ir para a direita ou esquerda ?");
	    String direcao = in.nextLine();
	    if (direcao.equals("esquerda")) {
	     System.out.println("Você esta vendo os dinossauros herbívoros");
	    } else {
	     System.out.println("Você esta vendo os dinossauros carnívoros");
	    }
	     System.out.println("Gostou do que viu ?; sim ou nao");
	    String resposta = in.nextLine();
	    if (resposta.equals("sim")) {
	     System.out.println("Obrigado!!!");
	    } else {
	     System.out.println("Que pena!!!");
	    }
	     System.out.println("Voce quer subir ou descer a escada");
	    String escada = in.nextLine(); 
	    if (escada.equals("subir")) {
	     System.out.println("Voce esta na sala dos passaros");
	    } else {
	     System.out.println("Voce esta na sala dos dinossauros aquaticos");
	    }
	    System.out.println("Obrigado por nos visitar,volte mais vezes");
	    
	    System.out.println("Deseja comprar algum produto");
	   
	    
	    
  }
  
}
