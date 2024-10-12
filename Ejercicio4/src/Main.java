public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456", "Soltero", "Ingeniería");
        Profesor profesor = new Profesor("María", "Gómez", "654321", "Casada", 2015, "A101", "Matemáticas");
        PersonalServicio personalServicio = new PersonalServicio("Pedro", "López", "789012", "Divorciado", 2020, "B202", "Secretaría");

        System.out.println(estudiante.imprimirInfo());
        System.out.println(profesor.imprimirInfo());
        System.out.println(personalServicio.imprimirInfo());

        estudiante.cambiarEstadoCivil("Casado");
        profesor.cambiarDepartamento("Arquitectura");
        personalServicio.trasladarSeccion("Biblioteca");

        profesor.reasignarDespacho("A202");
        personalServicio.reasignarDespacho("B303");

        estudiante.matricularNuevoCurso("Arquitectura");

        System.out.println("\nInformación después de los cambios:");
        System.out.println(estudiante.imprimirInfo());
        System.out.println(profesor.imprimirInfo());
        System.out.println(personalServicio.imprimirInfo());
    }
}
