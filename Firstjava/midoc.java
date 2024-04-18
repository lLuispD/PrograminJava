import java.util.Scanner;

public class midoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num1 = 5, num2 = 0, num3 = 0;
        System.out.println("Introdiuce tu nombre");
        nombre = in.nextLine();
        System.out.println("muy bien, " + nombre + ", ahora ingresa un nomero");
        num1 = in.nextInt();
        System.out.println("Ahora agrega otro numero");
        num2 = in.nextInt();
        num3 = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + num3);
    }
    
}
