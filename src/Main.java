//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("hhhh","ggggg",55,true);

        // Création d'un tableau d'objets Animal

        Animal[] animals = {lion};

        Zoo myZoo = new Zoo(animals,"hhh","fff",25);
        //myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        lion.displayAnimal();


    }
}
