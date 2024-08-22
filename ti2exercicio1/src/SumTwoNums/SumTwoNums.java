package SumTwoNums;
import java.util.*;

class SumTwoNums {
public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	// Declaração de variaveis
	int num1, num2, soma;
	
	//leituras
	System.out.println("Digite um numero");

	num1 = sc.nextInt();
	
	System.out.println("Digite outro numero");
	num2 = sc.nextInt();
	
	//Somar
	soma = num1 + num2;
	
	//Mostrar na tela
	System.out.println("Soma: "+soma);
	}
}
