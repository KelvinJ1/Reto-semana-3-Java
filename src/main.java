import java.util.Scanner;

public class main {
    
    
    

    
    
    public static void main(String[] args) {
        
       Scanner lector= new Scanner(System.in).useDelimiter("\n");        
       
       Fijo emp1=new Fijo(0, 0, "codigo", "banco", 0, 0, "nombre", 0);
       
       Fijo emp2=new Fijo(0, 0, "codigo", "banco", 0, 0, "nombre", 0);
       
       Proveedor prov =new Proveedor(0, 0, "codigo", "banco", 0, 0, "nombre", 0);
       
       
       //Input el salario del empleado 1 (Int) 
        emp1.setSalario(lector.nextInt());
        //Input las horas extras del empleado 1 (Int)
        emp1.setHorasExtras(lector.nextInt());
       
        // Input el codigo del empleado 1 (String)
        emp1.setCodigo(lector.next());
        // Input el banco a consignasr del empleado 1 (String)
        emp1.setBanco(lector.next());
       
        // Input el numero de cuenta del empleado 1 (Int)
        emp1.setNroCuenta(lector.nextInt());
        // Input el mes que se facturará del empleado 1 (Int)
        emp1.setMesFacturacion(lector.nextInt());
    
        // Input el nombre del empleado 1 (String)
        emp1.setNombre(lector.next());
        // Input la identifiacion del empleado 1 (Int)
        emp1.setIdentificacion(lector.nextInt());
            
              
        //Input el salario del empleado 2 (Int) 
        emp2.setSalario(lector.nextInt());
        //Input las horas extras del empleado 2 (Int)
        emp2.setHorasExtras(lector.nextInt());
      
        // Input el codigo del empleado 2 (String)
        emp2.setCodigo(lector.next());
        // Input el banco a consignasr del empleado 2 (String)
        emp2.setBanco(lector.next());
        
        // Input el numero de cuenta del empleado 2 (Int)
        emp2.setNroCuenta(lector.nextInt());
        // Input el mes que se facturará del empleado 2 (Int)
        emp2.setMesFacturacion(lector.nextInt());
      
        // Input el nombre del empleado 2 (String)
        emp2.setNombre(lector.next());
        // Input la identifiacion del empleado 2 (Int)
        emp2.setIdentificacion(lector.nextInt());
        
        
        // Input las horas trabajadas prooveedor 1 (Int)
        prov.setHorasTrabajadas(lector.nextInt());
        // Input el valor de la hora del proovedor 1 (Int)
        prov.setValorHora(lector.nextInt());
      
        // Input el codigo del proovedor 1 (String)
        prov.setCodigo(lector.next());
        // Input el banco a consignar del prooveedor 1 (String)
        prov.setBanco(lector.next());
        // Input el numero de cuenta del prooveedor 1 (Int)
         prov.setNroCuenta(lector.nextInt());
        // Input el mes a facturar del prooveedor 1 (Int)
         prov.setMesFacturacion(lector.nextInt());
       
        // Input el nombre del prooveedor 1 (String)
         prov.setNombre(lector.next());
        // Input la identificacion del prooveedor 1 (Int)
            prov.setIdentificacion(lector.nextInt());
        // Input el mes a facturar del empleado 1 (Int)
        int mes1=lector.nextInt();
        // Input el mes a facturar del empleado 2 (Int)
        int mes2=lector.nextInt();
        // Input el mes a facturar del proovedor (Int)
        int mesP1=lector.nextInt();
        
                
        int [] mes= new int[3];
        
          mes[0]=mes1;
          mes[1]=mes2;
          mes[2]=mesP1;
          
          
          
        
        
        Empleado [] v= new Empleado[3];
       
            v[0]=emp1;
            v[1]=emp2;
            v[2]=prov;
      
        
      
        for (int i = 0; i < v.length; i++) {
            
        switch(v[i].getPago(mes[i])){
            case -1:
                System.out.println("Mes ya facturado");
                break;
            case -2:
                System.out.println("Mes sin facturar");
                break;
            default: System.out.println("El monto a liquidar del empleado: "+v[i].getCodigo()+" es: $"+v[i].getPago(mes[i]));
            break;
        }
        
      
        
        }
        
    }
    
}
