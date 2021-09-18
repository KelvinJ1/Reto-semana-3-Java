
public class Proveedor extends Empleado implements HrsExtra{
    
    protected int horasTrabajadas, valorHora;
    
    
    
    
    public Proveedor(){
    
   
    }

    
    
    
    public Proveedor(int horasTrabajadas, int valorHora, String codigo,String banco, int nroCuenta, int mesFacturacion,  String nombre, int identificación) {
        super(codigo, nroCuenta, mesFacturacion, banco, nombre, identificación);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    
    //Getters and SeTTERS
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

   //METODOS
     @Override
    public int getPago(int mes) { 
        int p;
        if (mes == getMesFacturacion()){
              p =horasTrabajadas*valorHora;
            return p;
        }else{
            if (mes < getMesFacturacion()){
                p = -1;
            }else{
                p = -2;
            }
        }
        return p;
    }
    
    }
   
    
     
    
 
