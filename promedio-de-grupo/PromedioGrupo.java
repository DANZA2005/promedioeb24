import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{
        /**
         * programa que calcula el promedio de un grupo 
         * el tamaño del grupo es N 
         * las calificaciones se leen y se almacenan en un arreglo de tamaño N
         * 
         * @param args
         */
        public static void main (String[] args) throws IOException{
            int N;
            BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            String entranda;
            double[] calificaciones;//array de calificaciones
            double suma = 0;// para sumar calificaciones
            double promedio;

            System.out.println("Programa que calcula el promedio del grupo");
            System.out.println("Escribe el tamaño del grupo: ");
            entranda = bufer.readLine();
            N = Integer.parseInt(entranda);
        
            // construimos le array de calificaciones 
            calificaciones = new double[N];// este con el valo de N que le da el tamaño que le asignemos
            for ( int i = 0; i < calificaciones.length; i++){
                System.out.println("Escriba la calificacion del alumno " + (i+1) + ": ");
                entranda = bufer.readLine();
                calificaciones[i] = Double.parseDouble(entranda);
                suma += calificaciones[i];

            }
            promedio = suma / N;
            System.out.println("las calificaciones del grupo son: ");
            for(int i = 0; i < calificaciones.length; i++){
                System.out.println(calificaciones[i]);
            }

            System.out.println("El promedio del grupo es: " + promedio);

        }

}