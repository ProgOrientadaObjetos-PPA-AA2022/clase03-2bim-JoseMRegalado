package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide cuando acabar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        
        //Declaración de un ArrayList para no tener que
        //declarar la cantidad de estudiantes y que
        //el usuario decida cuando dejar de ingresar usuarios
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        do {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                
                //Se añade el estudiante de tipo presencial al
                //arraylist, dicho arraylist recibirá objetos de 
                //tipo de cualquiera de las subclases sin importar
                //cual sea
                estudiantes.add(estudianteP);

            } else {
                

                
                EstudianteDistancia estudianteD = new EstudianteDistancia();
                
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();

                
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                //Se añade el estudiante de tipo presencial al
                //arraylist, dicho arraylist recibirá objetos de 
                //tipo de cualquiera de las subclases sin importar
                //cual sea
                estudiantes.add(estudianteD);

            }

            entrada.nextLine();
            // Se pregunta si se desea ingresar más estudiante
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");

            // se ingresa el por teclado para la variable 
            // continuar
            continuar = entrada.nextLine();
            // se pregunta si el valor continuar es igual al valor "S", se sigue en 
            // ciclo repetitivo; si el valor es distinto de "S", se sale del ciclo
            // repetitivo
        } while (continuar.equals("S"));

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        //El ciclo calcula la matrícula del estudiante, sin importar que
        //tipo de estudiante sea, lo que comprueba el polimorfismo
        //además se encarga de presentar los objetos, mediante los métodos 
        //toString de cada subclase respectivamente
        for (int i = 0; i < estudiantes.size(); i++) {
              
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
