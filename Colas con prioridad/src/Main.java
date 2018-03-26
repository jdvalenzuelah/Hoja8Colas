//Paquetes
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Clase Principal
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String expresion = "";
		try {
			
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("lista.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			String linea;
			while ((linea = buffer.readLine()) != null) {
				String[] temp = linea.split(", ");
                String nombre = temp[0];
                String descrip = temp[1];
                String code = temp[2];
            }
			
			entrada.close();
		
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
	}
}
