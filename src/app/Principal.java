package app;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del veterinario: ");
            String nombreV = sc.nextLine();
            System.out.println("Ingrese la identificacion del veterinario: ");
            String identificacionV = sc.nextLine();
            System.out.println("Ingrese la edad del veterinario: ");
            int edadV = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la especialidad: ");
            String especialidadV = sc.nextLine();
            System.out.println("Ingrese el salario base del veterinario: ");
            double salarioBaseV = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese el nombre de la mascota: ");
            String atenderMascota = sc.nextLine();

            Veterinario V1 = new Veterinario(nombreV, identificacionV, edadV, especialidadV, salarioBaseV, atenderMascota);

            System.out.println("Ingrese el nombre del asistente: ");
            String nombreA = sc.nextLine();
            System.out.println("Ingrese la identificacion del asistente: ");
            String identificacionA = sc.nextLine();
            System.out.println("Ingrese la edad del asistente: ");
            int edadA = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese los turnos trabajados: ");
            int turnosTrabajadosA = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el pago por turno: ");
            double pagoPorTurnoA = Double.parseDouble(sc.nextLine());

            Asistente A1 = new Asistente(nombreA, identificacionA, edadA, turnosTrabajadosA, pagoPorTurnoA);

            System.out.println("Ingrese el nombre del pasante: ");
            String nombreP = sc.nextLine();
            System.out.println("Ingrese la identificacion del pasante: ");
            String identificacionP = sc.nextLine();
            System.out.println("Ingrese la edad del pasante: ");
            int edadP = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese las horas de practicas: ");
            int horasDePractica = Integer.parseInt(sc.nextLine());

            Pasante P1 = new Pasante(nombreP, identificacionP, edadP, horasDePractica);

            System.out.println(V1.toString());
            System.out.println(A1.toString());
            System.out.println(P1.toString());

            Persona[] personas = new Persona[]{V1, A1, P1};
            for (Persona p : personas) {
                System.out.println(p.describir());
                System.out.println("Pago = " + p.calcularPago());
            }


        }
    }
}
