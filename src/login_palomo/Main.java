package login_palomo;
import java.util.*;

public class Main {
    
    public static void main(String[] args) { 
        ArrayList<añumno> listaAlumnos = new ArrayList<añumno>();
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Ver Alumnos");
            System.out.println("3. Salir");
            System.out.println("-----Elige una opción-----");
            opcion = in.nextInt();
            
            switch(opcion) {
                case 1:
                    in.nextLine();
                    System.out.println("Número de control");
                    String numControl = in.nextLine();
                    System.out.println("Grupo");
                    String grupo = in.nextLine();
                    System.out.println("Nombre");
                    String nombre = in.nextLine();
                    System.out.println("Apellido paterno");
                    String ap = in.nextLine();
                    System.out.println("Apellido materno");
                    String am = in.nextLine();
                    System.out.println("Carrera");
                    String carrera = in.nextLine();
                    System.out.println("Turno");
                    String turno = in.nextLine();
                    
                    añumno x = new añumno();
                    x.setNumControl(numControl);
                    x.setGrupo(grupo);
                    x.setNombre(nombre);
                    x.setAp(ap);
                    x.setAm(am);
                    x.setCarrera(carrera);
                    x.setTurno(turno);
                    
                    listaAlumnos.add(x);
                    break;
                case 2:
                    for (añumno a : listaAlumnos) {
                        System.out.println("Número de control: " + a.getNumControl());
                        System.out.println("Grupo: " + a.getGrupo());
                        System.out.println("Nombre: " + a.getNombre());
                        System.out.println("Apellido paterno: " + a.getAp());
                        System.out.println("Apellido materno: " + a.getAm());
                        System.out.println("Carrera: " + a.getCarrera());
                        System.out.println("Turno: " + a.getTurno());
                    }
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 3);
    }
}
