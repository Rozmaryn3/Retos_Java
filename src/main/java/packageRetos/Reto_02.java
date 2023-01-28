/*RETO DE PROGRAMACION nº2: Generador de contraseñas
  
  NIVEL DE DIFICULTAD: Media
  
  ENUNCIADO:
  Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
  */

package packageRetos;

import java.util.Scanner;

public class Reto_02 {
	public static void main(String[] args) {
		
		 int flag = 1, flag2 = 0, flag3 = 3, flag4 = 4, aux = 0;
		 Scanner sc = new Scanner(System.in);
		 String[] arrayCaracteres = {"1","2","3","4","5","6","7","8","9","0","q","w","e","r","t","y","u",
				 "i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","!","@",
				 "#","$","%","&","/","(",")","="};
		
		System.out.println("\n     Bienvenido al generador de contraseñas\n");
		System.out.println("---------------------------------------------------------------");
		
		do {
			System.out.println("\n     Pulse 1: para generar una contraseña de 8 caracteres\n");
			System.out.println("     Pulse 2: para generar una contraseña de 16 caracteres\n");
			System.out.println("     Pulse 3: para salir\n");
			System.out.println("---------------------------------------------------------------");
			flag = sc.nextInt();	
			
			String[] password = new String[0];	
			
			if(flag == 1) {
				aux = 8;
				password = new String[aux];
			}
			
			else if(flag == 2) {
				aux = 16;
				password = new String[aux];
			}
			
			else if(flag == 3){
				System.out.println("     Programa finalizado");
				break;
			}
			
			else {
				System.out.println("    Operacion no valida");
				break;
			}
			
			System.out.println("     Pulse 1: para generar una contraseña con numeros\n");
			System.out.println("     Pulse 2: para generar una contraseña sin numeros\n");
			System.out.println("---------------------------------------------------------------");
			flag2 = sc.nextInt();
			if(flag2 != 1 && flag2 != 2) {
				System.out.println("    Operacion no valida");
				break;
			}
			
			
			System.out.println("     Pulse 1: para generar una contraseña con simbolos\n");
			System.out.println("     Pulse 2: para generar una contraseña sin simbolos\n");
			System.out.println("---------------------------------------------------------------");
			flag3 = sc.nextInt();
			if(flag3 != 1 && flag3 != 2) {
				System.out.println("    Operacion no valida");
				break;
			}
			
			System.out.println("     Pulse 1: para generar una contraseña con mayusculas\n");
			System.out.println("     Pulse 2: para generar una contraseña sin mayusculas\n");
			System.out.println("---------------------------------------------------------------");
			flag4 = sc.nextInt();
			
			if(flag2 == 2 && flag3 == 2) {
				for(int i = 0; i < aux; i++) {
					int rd = (int) ((Math.random()) * (35-10)+10);
					password[i] = arrayCaracteres[rd];
				}
			}
			
			else if(flag2 == 1 && flag3 == 2) {
				for(int i = 0; i < aux; i++) {
					int rd = (int) (Math.random() * 35);
					password[i] = arrayCaracteres[rd];
				}
			}
			
			else if(flag2 == 1 && flag3 == 1) {
				for(int i = 0; i < aux; i++) {
					int rd = (int) (Math.random() * 45);
					password[i] = arrayCaracteres[rd];
				}
			}
			
			else if(flag2 == 2 && flag3 == 1) {
				for(int i = 0; i < aux; i++) {
					int rd = (int) ((Math.random()) * (45-10)+10);
					password[i] = arrayCaracteres[rd];
				}
			}
			
			if(flag4 == 1) {
				for(int i = 0; i < aux; i++) {
					int rd = (int) (Math.random() * 2 + 1);
					
					if(rd == 1) {
						password[i] = password[i].toUpperCase();
					}
				}
			}
			
			else if(flag4 != 1 && flag4 != 2) {
				
			}
			
			System.out.print("     Su contraseña es: ");
			
			for(int i = 0; i < aux; i++) {
				System.out.print(password[i]);
			}
			
			System.out.println("\n\n---------------------------------------------------------------");
			
		 }while(flag == 1 || flag == 2);
  }
}
