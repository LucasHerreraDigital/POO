//ejemplo  de una herencia simple

//creamos una clase empleado que va a ser la clase base de la jerarquia
class Empleado {
    //le añadimos el atributo nombre, vemos colocamos el adjetivo private para respetar el encapsulamiento
    private String nombre;

    //constructor
    public Empleado(){
    }

    //constructor con un parametro
    public Empleado(String Empleado){
        //con el parametro nos sirve para cuando se utilice el constructor ya se le pase por medio de parametros los atributos de la clase
        this.nombre = nombre;
        System.out.println("contrutor del empleado "+ nombre);
    }

    //escribimos los metodos get y set, get sirve para poder recibir un atributo de la clase
    //y el metodo set sirve para setear un atributo de la clase
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado 
    @Override
    public String toString(){
        return "Empleado " + nombre;
    }

}

//creamos la clase operario. es una clase herencia de la clase empleado
class Operario extends Empleado {

    //creamos un constructor con un parametro
    public Operario(String nombre){
        super(nombre);
        System.out.println("constructor de operario");
    }

    //creamos el constructor por defecto 
    public Operario(){
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }

}

//Creamos la clase Oficial , esta es herencia de la clase Operario
class Oficial extends Operario{

    //creamos el constructor por defecto
    public Oficial(){
    }

    //creamos un constructor con un parametro
    public Oficial(String nombre){
        super(nombre);
        System.out.println("constructor de oficial");
    }
    
    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }

}

//Creamos la clase Directivo, esta es herencia de la clase Empleado
class Directivo extends Empleado {

    //creamos el constructor por defecto 
    public Directivo(){
    }

    //creamos el constructor con parametro
    public Directivo(String nombre){
        super(nombre);
        System.out.println("constructor de directivo");
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
    
}

//Creamos la clase Tecnico, es una herencia de la clase Operario
class Tecnico extends Operario {

    //creamos el constructor por defecto
    public Tecnico(){
    }

    //creamos el constructor con parametros
    public Tecnico(String nombre){
        super(nombre);
        System.out.println("constructor de tecnico");
    } 

    //modificación del método toString() para mostrar el mensaje adecuado 
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }

}

//Esta es la clase para poder iniciar la clase App.java
public class App {
    
    //este es el metodo main, que es el metodo que se ejecuta al ejecutar la aplicacion de java 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
