 abstract class Vehiculo{
    public int velocidad = 0;
    public boolean encendido = false;
    public void acelerar(){
        velocidad++;
    }
    public void desacelerar(){
        velocidad--;
    }
    public void arrancar(){
        encendido=true;
    }
    public void apagar(){
        encendido=false;
    }
    public abstract void velocidad();
    public abstract void cantidadDeRuedas();
}

class Moto extends Vehiculo{
    @Override
    public void velocidad(){
        System.out.println("la moto va a "+ velocidad);
    }
    @Override
    public void cantidadDeRuedas() {
        System.out.println("la moto tiene 2 ruedas");    
    }
    
}
class Auto extends Vehiculo{

    @Override
    public void velocidad(){
        System.out.println("el auto va a "+ velocidad);
    }
    @Override
    public void cantidadDeRuedas(){
        System.out.println("el auto tiene 4 ruedas");
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        
        Auto unAuto= new Auto();
        Moto unaMoto= new Moto();

        //prueba de objeto auto
        unAuto.velocidad(); 
        unAuto.acelerar();
        unAuto.acelerar();
        unAuto.acelerar();
        unAuto.velocidad();
        unAuto.cantidadDeRuedas();

        //prueba objeto moto
        unaMoto.velocidad();
        unaMoto.acelerar();
        unaMoto.acelerar();
        unaMoto.velocidad();
        unaMoto.cantidadDeRuedas();
    }
}

