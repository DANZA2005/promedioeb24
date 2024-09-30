public class estudiante {
    private String matricula;
    private String nombre;
    private double estructura;
    private double evaluacion;
    private double ingles;
    private double promedio;

    // contructor
    public estudiante(String m, String n) {
        // le objetivo del constructor es inicializar el objetivo
        this.matricula = m;
        this.nombre = n;
    }

    // nadie que no sea estudiante es que seamos de la calse estudiante
    /**
     * solo necesitamos un contructor publico,(el contructor siempre es publico) los
     * consultores y los modificadores
     * esto con el objetivo de proteger los datos pero te dejo ver los metodos
     * 
     */
    //
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matric) {
        this.matricula = matric;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    //
    public double getEstructura() {
        return estructura;
    }

    public void setEstructura(double estruc) {
        this.estructura = estruc;
    }

    //
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evalua) {
        this.evaluacion = evalua;
    }
//
    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingle) {
        this.ingles = ingle;
    }
//
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double prom) {
        this.promedio = prom;
    }

    @Override 
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
    /**todas las clases que estamos creando heredan de la calse objec osea la super clase de java */
    
}
