public class App {
    public static void main(String[] args) throws Exception {
       Gato gato = new Gato();
       Perro perro = new Perro();
       Animal animal= new Animal();

       animal.hacerSonido();
       gato.hacerSonido();
       perro.hacerSonido();
    }
}

class Animal {
        public void hacerSonido(){
            System.out.println("...sonido..");
        }
    }
class Gato extends Animal{
        public void hacerSonido(){
            System.out.println("miauuu");
        }
    }
class Perro extends Animal{
        public void hacerSonido(){
            System.out.println("guauu");
        }
    }


