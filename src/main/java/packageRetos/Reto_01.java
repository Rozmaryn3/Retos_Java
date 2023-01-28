//RETO DE PROGRAMACION nº1
//NIVEL DE DIFICULTAD: FACIL

package packageRetos;

import java.util.Scanner;

public class Reto_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escribe el texto que quieres sea traducido: ");
		System.out.println("");
		
		String text = sc.nextLine();
		String[] textArray = text.split("");
		
		for(int i = 0; i < textArray.length; i++) {
			if(textArray[i].equals("a") || textArray[i].equals("A")) {
				textArray[i] = "4";
			}
			else if(textArray[i].equals("b") || textArray[i].equals("b")) {
				textArray[i] = "I3";
			}
			else if(textArray[i].equals("c") || textArray[i].equals("C")) {
				textArray[i] = "[";
			}
			else if(textArray[i].equals("d") || textArray[i].equals("D")) {
				textArray[i] = ")";
			}
			else if(textArray[i].equals("e") || textArray[i].equals("E")) {
				textArray[i] = "3";
			}
			else if(textArray[i].equals("f") || textArray[i].equals("F")) {
				textArray[i] = "|=";
			}
			else if(textArray[i].equals("g") || textArray[i].equals("G")) {
				textArray[i] = "&";
			}
			else if(textArray[i].equals("h") || textArray[i].equals("H")) {
				textArray[i] = "#";
			}
			else if(textArray[i].equals("i") || textArray[i].equals("I")) {
				textArray[i] = "1";
			}
			else if(textArray[i].equals("j") || textArray[i].equals("J")) {
				textArray[i] = ",_|";
			}
			else if(textArray[i].equals("k") || textArray[i].equals("K")) {
				textArray[i] = ">|";
			}
			else if(textArray[i].equals("l") || textArray[i].equals("L")) {
				textArray[i] = "1";
			}
			else if(textArray[i].equals("m") || textArray[i].equals("M")) {
				textArray[i] = "/\\/\\";
			}
			else if(textArray[i].equals("n") || textArray[i].equals("N")) {
				textArray[i] = "^/";
			}
			else if(textArray[i].equals("o") || textArray[i].equals("O")) {
				textArray[i] = "0";
			}
			else if(textArray[i].equals("p") || textArray[i].equals("P")) {
				textArray[i] = "|*";
			}
			else if(textArray[i].equals("q") || textArray[i].equals("Q")) {
				textArray[i] = "(_,)";
			}
			else if(textArray[i].equals("s") || textArray[i].equals("S")) {
				textArray[i] = "5";
			}
			else if(textArray[i].equals("t") || textArray[i].equals("T")) {
				textArray[i] = "7";
			}
			else if(textArray[i].equals("u") || textArray[i].equals("U")) {
				textArray[i] = "(_)";
			}
			else if(textArray[i].equals("v") || textArray[i].equals("V")) {
				textArray[i] = "\\/";
			}
			else if(textArray[i].equals("w") || textArray[i].equals("W")) {
				textArray[i] = "\\/\\/";
			}
			else if(textArray[i].equals("x") || textArray[i].equals("X")) {
				textArray[i] = "><";
			}
			else if(textArray[i].equals("y") || textArray[i].equals("Y")) {
				textArray[i] = "j";
			}
			else if(textArray[i].equals("z") || textArray[i].equals("Z")) {
				textArray[i] = "2";
			}
			
			System.out.print(textArray[i]);
		}
	}
}
