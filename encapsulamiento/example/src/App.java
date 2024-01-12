//Vamos a realizar una demostracion de encapsulamiento 

//Creamos la clase cuenta, para simular una cuenta bancario
class Cuenta{

    //Creamos los atributos de la clase cuenta poniendolo la caracteristicas de private, esto hace que solo se puedan acceder con metodos de la clase
    private  int numeroCuenta;
    private int balanceCuenta = 0;
    
    //creamos los metodos para poder modificar los atributos 
    public void depositar (int monto){
        if (monto < 0) {
            System.out.println("No pueden ser un numero menor a 0 o 0");
        }else{
            balanceCuenta =+ monto;
        }
    }

    public void extraer (int monto){
        if (monto < 0) {
            System.out.println("No pueden ser un numero menor a 0 o 0");
        }else if (balanceCuenta < monto ) {
            System.out.println("No hay saldo suficuente");
        }else{
            balanceCuenta =- monto;
        }
    }

    public int saldo(){
        return balanceCuenta;
    }

    public void cambiarSaldo(int monto){
        balanceCuenta = monto;
    }

}

//creamos una clase persona
class Persona{
    //creamos una instancia de la clase cuenta dentro de la clase persona
    Cuenta a = new Cuenta();

    //creamos el metodo para probar el encapsulamiento
    public void nuevoBalanceCuenta(int monto){

        //primero probamos a tratar de cambiar el atributo directamente 
        //a.balanceCuenta = monto;
        System.out.println(a.saldo());
        //luego probamos a cambiar el atributo con el metodo de la clase banco
        a.cambiarSaldo(100);
        System.out.println(a.saldo());
        
    }
}



public class App {
    public static void main(String[] args) throws Exception {

        //Prueba de error de encapsulamiento
        Persona persona1 = new Persona();

        persona1.nuevoBalanceCuenta(100);

    }
}
