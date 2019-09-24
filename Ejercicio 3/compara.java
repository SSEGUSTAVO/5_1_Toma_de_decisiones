import java.util.Scanner;

public class compara{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("¿Quién es el rey lagarto?, R.- ");
	String nombre1 = input.next();
	String nombre2 = input.next();
	String nombre = nombre1 + " " + nombre2;
	boolean respuesta = nombre.equals("Jim Morrison");
	if (respuesta == true){
	    System.out.println("Felicidades, eres todo un rockero.");
	}
	else
	    System.out.println("Regresa a escuchar reggaeton.");
    }
}