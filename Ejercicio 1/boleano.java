import java.util.Scanner;

public class boleano{
    public static void main(String[] args){
	boolean mayor = false;
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese su edad: ");
	int edad = input.nextInt();
	mayor = edad >= 18;
	System.out.println("¿Su edad es mayor o igual a 18? R.- " + mayor);
    }
}