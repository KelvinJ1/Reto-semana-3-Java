
public abstract class Persona {
    
   private String nombre;
           private String apellido;
           private int identificacion;
                private int celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificación) {
        this.identificacion= identificación;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
                
    public Persona(){}        
    
    public Persona (String nombre, String apellido,
int identificacion, int celular ){
    
    
    
    }

    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    
    
    
    
    
    
}
