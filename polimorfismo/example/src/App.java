//Vamos a probar el polimorfismo en varias clases el polimorfismo por sobre carga el polimorfismo parametrico y el polimorfismo de inclusion

//Creamos una clase Animal para realizar el ejemplo 
abstract class Animal{

    //Este es el metodo con el cual probaremos el polimorfismos por sobre carga 
    public void makeSound(){
        System.out.println("un sonido...");
    }
    //Probamos el polimorfismo parametrico, en este vamos a crear dos metodos iguales pero con diferentes parametros 
    public void moverse(String unLado){
        System.out.println("se muevo hacia la "+unLado);
    }
    public void moverse(int unNumero){
        if (unNumero == 1) {
            System.out.println("se muevo hacia la izquierda");
        }else if (unNumero == 2) {
            System.out.println("se muevo hacia la derecha");
        }else{
            System.out.println("esta quieto");
        }
    }

}

//Creamos la clase Gato que va ser herencia de la clase Animal
class Gato extends Animal{
    public void makeSound(){
        System.out.println("miauu");
    }

    //probemos la clase Override 
    @Override
    public void moverse(int unNumero){
        System.out.println("esta durmiendo...");
    }
}

//Creamos la clase Perro que va ser herencia de la clase Animal
class Perro extends Animal{
    public void makeSound(){
        System.out.println("guauu");
    }

}

//creamos la clase persona
class Persona{
    
    //con el siguiente metodo lo que queremos dejar en claro es se puede generalizar el parametro del metodo haciendo esto puede recibir cualquier instancia que sea heredada de la clase Animal
    public void acariciar(Animal unAnimal){

    }

}

public class App {
    public static void main(String[] args) throws Exception {

        //notamos que al ser una herencia podemos especificar que el tipo de la variable sea Animal y apuntarlas a la instancia necesaria, haciendo que esto sea mas simple en la creacion de instancias 
        Animal unGato = new Gato();
        Animal unPerro = new Perro();

        //Probamos si el polimorfismo por sobrecarga funciona 
        unGato.makeSound();
        unPerro.makeSound();

        //Probamos el polimorfismo parametrico 
        unPerro.moverse("izquierda");
        unPerro.moverse(1);

        //Probamos override
        unGato.moverse(1);
    }
}
