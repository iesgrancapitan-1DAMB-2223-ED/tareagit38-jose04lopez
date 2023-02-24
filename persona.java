public class persona {
    String nombre;
    String apellidos;

    public persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public voud setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}