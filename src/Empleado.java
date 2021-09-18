




public class Empleado extends Persona {

    protected int  nroCuenta, mesFacturacion;
    protected String banco, codigo;
    
    
    
    public Empleado(){
     
    }

    public Empleado(String codigoInterno, int nroCuenta, int mesFacturacion, String banco, String nombre, String apellido, int identificacion, int celular) {
        super(nombre, apellido, identificacion, celular);
        this.codigo = codigoInterno;
        this.nroCuenta = nroCuenta;
        this.mesFacturacion = mesFacturacion;
        this.banco = banco;
    }

    public Empleado(String codigo, int nroCuenta, int mesFacturacion, String banco, String nombre, int identificación) {
        super(nombre, identificación);
        this.codigo = codigo;
        this.nroCuenta = nroCuenta;
        this.mesFacturacion = mesFacturacion;
        this.banco = banco;
    }
                
    //MÉTODO 
    
    public int getPago(int mes){
    
    
    return mes;
    }

    
    public int getMesFacturacion() {
        return mesFacturacion;
    }

    public void setMesFacturacion(int mesFacturacion) {
        this.mesFacturacion = mesFacturacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
    
    

    
    
}
