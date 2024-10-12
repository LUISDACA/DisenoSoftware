class Persona {
    protected String nombre;
    protected String apellidos;
    protected String numeroId;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String numeroId, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroId = numeroId;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstado) {
        this.estadoCivil = nuevoEstado;
    }

    public String imprimirInfo() {
        return "Nombre: " + nombre + " " + apellidos + ", ID: " + numeroId + ", Estado Civil: " + estadoCivil;
    }
}

class Empleado extends Persona {
    protected int añoIncorporacion;
    protected String numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroId, String estadoCivil,
                    int anioIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroId, estadoCivil);
        this.añoIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public String imprimirInfo() {
        return super.imprimirInfo() + ", Año de Incorporación: " + añoIncorporacion + ", Despacho: " + numeroDespacho;
    }
}

class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String numeroId, String estadoCivil, String curso) {
        super(nombre, apellidos, numeroId, estadoCivil);
        this.curso = curso;
    }

    public void matricularNuevoCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public String imprimirInfo() {
        return super.imprimirInfo() + ", Curso: " + curso;
    }
}

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String numeroId, String estadoCivil,
                    int anioIncorporacion, String numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroId, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String imprimirInfo() {
        return super.imprimirInfo() + ", Departamento: " + departamento;
    }
}

class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String numeroId, String estadoCivil,
                            int anioIncorporacion, String numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroId, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public String imprimirInfo() {
        return super.imprimirInfo() + ", Sección: " + seccion;
    }
}