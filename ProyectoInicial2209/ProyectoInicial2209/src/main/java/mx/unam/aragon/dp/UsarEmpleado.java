package mx.unam.aragon.dp;

public class UsarEmpleado {
    public static void main(String [] args) {
        Empleado empl=  new  Empleado(1, "Sistemas", 4500.0f , 15);
        empl.setNombre( "Juan José");
        empl.setApPaterno("García Bolaños");
        empl.setApMaterno("Bolaños");
        empl.setEdad(24);
        empl.setCurp("GABJ121212HDFTR2");
        
        System.out.println("info:"+empl);
                
    }
}
