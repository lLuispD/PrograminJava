/**
 *  @author luis pDedios <luispdedios@gmail.com> 
 */

import java.util.Scanner;

public class midoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num1 = 5, num2 = 0, num3 = 0;
        System.out.println("Digite su nombre");
        nombre = in.nextLine();
        System.out.println("Hola " + nombre + ", por favor ingresa un numero");
        num1 = in.nextInt();
        System.out.println("Ahora ingresa otro numero");
        num2 = in.nextInt();
        num3 = num1 + num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + num3);
    }
    
}
