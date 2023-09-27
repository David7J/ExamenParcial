import java.util.Scanner;

public class Cadena {

public static void main(String [] args){
      Scanner lector = new Scanner(System.in);
    
      System.out.println("Ingrese una cadena: ");
      String cadena = lector.nextLine();

      char[] arregloCad = new char[cadena.length()];

      for(int i = 0; i < cadena.length(); i++){
        char caracter = cadena.charAt(i);
        if(caracter >= 'a'&& caracter <='z'){
            caracter = (char) (caracter - 32);
        }
        arregloCad[i] = caracter;

      }

      String mayusculas = new String(arregloCad);

      System.out.println("La cadena de mayusculas es: " + mayusculas);

      lector.close();
    }
}