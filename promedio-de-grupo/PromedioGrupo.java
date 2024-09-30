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
        public static Estudiante[] estudiantes;//este es un tipo de datos abstracto
        
        public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entranda;
        public static void leer_estudiantes() throws IOException{
            String matricula, nombre;
            for ( int i = 0; i < estudiantes.length; i++){
                System.out.println("-------------------------------------------");
                System.out.println("Informacion del estudiante [" + (i+0) + "]") ;
                System.out.println("Matricula: ");
                entranda = bufer.readLine();
                matricula = entranda;
                System.out.println("Nombre: ");
                entranda = bufer.readLine();
                nombre = entranda;
                
                Estudiante e = new Estudiante(matricula, nombre);
                System.out.println("Escriba calficiaciones de Estructuras: ");
                entranda = bufer.readLine();
                e.setEstructura(Double.parseDouble(entranda));

                System.out.println("Escriba calficiaciones de Evaluacion: ");
                entranda = bufer.readLine();
                e.setEvaluacion(Double.parseDouble(entranda));
                
                System.out.println("Escriba calficiaciones de Ingles: ");
                entranda = bufer.readLine();
                e.setIngles(Double.parseDouble(entranda));
                e.setPromedio();
                estudiantes[i] = e;
            }
        }
        public static void main (String[] args) throws IOException{
            int N;



            double[] calificaciones;//array de calificaciones
            double suma = 0;// para sumar calificaciones
            double promedio;

            System.out.println("Programa que calcula el promedio del grupo");
            System.out.println("Escribe el tamaño del grupo: ");
            entranda = bufer.readLine();
            N = Integer.parseInt(entranda);
            
            // construimos le array de estudiantes
            estudiantes = new Estudiante[N];
            // construimos le array de calificaciones 
            calificaciones = new double[N];
            // este con el valo de N que le da el tamaño que le asignemos
            // for ( int i = 0; i < calificaciones.length; i++){
            //     System.out.println("Escriba la calificacion del alumno " + (i+1) + ": ");
            //     entranda = bufer.readLine();
            //     calificaciones[i] = Double.parseDouble(entranda);
            //     suma += calificaciones[i];

            // }
            // promedio = suma / N;
            //control k+c para comentar muchas lineas control k+v para descomentarlas


            System.out.println("las calificaciones del grupo son: ");
            for(int i = 0; i < calificaciones.length; i++){
                System.out.println(calificaciones[i]);
            }

            System.out.println("El promedio del grupo es: " + promedio);

        }

}