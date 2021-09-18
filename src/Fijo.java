
public class Fijo extends Empleado implements HrsExtra{
    
    protected String EPS;
    protected String fondoPension; 
    protected String  fondoCesantias;
    protected String    ARL;
    protected int  Salario;
    protected int horasExtras;
  
    
    
    
    
     public Fijo(){
   
   }

    public Fijo(int Salario, int horasExtras, String codigo, String banco, int nroCuenta, int mesFacturacion,  String nombre, int identificacion) {
        super(codigo, nroCuenta, mesFacturacion, banco, nombre, identificacion);
        this.Salario = Salario;
        this.horasExtras = horasExtras;
    }

   
     
    public Fijo( int Salario,int horasExtras,  String codigo, String EPS, String fondoPension, String fondoCesantias, String AR,  int nroCuenta, int mesFacturacion, String banco, String nombre, int identificacion) {
        super(codigo, nroCuenta, mesFacturacion, banco, nombre, identificacion);
        this.EPS = EPS;
        this.fondoPension = fondoPension;
        this.fondoCesantias = fondoCesantias;
        this.ARL = ARL;
        this.Salario = Salario;
        this.horasExtras = horasExtras;
    }
   
    
    

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
    }

    public String getFondoCesantias() {
        return fondoCesantias;
    }

    public void setFondoCesantias(String fondoCesantias) {
        this.fondoCesantias = fondoCesantias;
    }

    public String getARL() {
        return ARL;
    }

    public void setARL(String ARL) {
        this.ARL = ARL;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

 
   
    @Override
     public int getPago(int mes){
        int pago;
        if (mes == getMesFacturacion()){
            pago = (int) (this.Salario * 0.92+this.horasExtras*50000);
            return pago;
        }else{
            if (mes < getMesFacturacion()){
                pago = -1;
            }else{
                pago = -2;
            }
        }
        return pago;
    }
    
    
                            
}
