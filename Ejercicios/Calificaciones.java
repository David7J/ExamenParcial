import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = lector.nextInt(); 

        while(cantEstudiantes <= 0){
            System.out.println("No se permiten valores negativos no cero");
            System.out.println("Ingrese la cantidad de estudiantes: ");
            cantEstudiantes = lector.nextInt(); 
        }

        int[] intervalos = new int[5];
        

        System.out.println("Ingrese la cantidad de nota de 0-100: ");

        
        for (int i = 0; i < cantEstudiantes; i++) {
            int nota = lector.nextInt();

            while(nota < 0){
                System.out.println("No se permiten valores negativos");
                System.out.println("Ingrese la cantidad de nota de 0-100: ");
                nota = lector.nextInt();
            }

            if(nota >=0 && nota <= 59){
                intervalos[0]++;

            }else if(nota >= 60 && nota <= 69){
                intervalos[1]++;
            }
            else if(nota >= 70 && nota <= 79){
                intervalos[2]++;
            }
            else if(nota >= 80 && nota <= 89){
                intervalos[3]++;
            }
            else if(nota >= 90 && nota <= 100){
                intervalos[4]++;
            }

        }

        System.out.println("Notas de 0-59: " + intervalos[0] + " " + "Estudiantes");
        System.out.println("Notas de 60-69: " + intervalos[1] + " " + "Estudiantes");
        System.out.println("Notas de 70-79: " + intervalos[2] + " " + "Estudiantes");
        System.out.println("Notas de 80-89: " + intervalos[3] + " " + "Estudiantes");
        System.out.println("Notas de 90-100: " + intervalos[4] + " " + "Estudiantes");

       lector.close(); 
    }
}