import java.time.*;


public class App { // clase controladora
    public static void main(String[] args) throws Exception { 
        //cuenta
        Cuenta pepito = new Cuenta((int)1, 100000.f);        
        

        Tipo_Moneda moneda1= new Tipo_Moneda((short)001,"Peso",1.f);
        Tipo_Operacion operacion1 = new Tipo_Operacion((short)001,"Depósito",true,false);
        LocalDate fecha = LocalDate.parse("2020-01-08");
        
        System.out.println(pepito.getSaldo());

        Transaccion trans = new Transaccion(moneda1, operacion1, fecha, (float)35000);

        System.out.print(pepito.getSaldo());
        
        pepito.addTrans(trans);

        pepito.verHistorialTransacciones();

    }
}