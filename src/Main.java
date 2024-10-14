//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("L1", "lion", 20, true);
        Animal girafe = new Animal("L2", "girafe", 20, true);
        Animal zebre = new Animal("L3", "zebre", 20, true);
        Animal papillon = new Animal("L3", "papillon", 20, true);

        Animal poisson = new Animal("L4", "poisson", 30, true);

        //Zoo Zoomax = new Zoo("g3","NN",400);
        Zoo Z0 = new Zoo("g2","amérique",200);
        Zoo myZoo = new Zoo("g1", "afrique",100);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(girafe);
        myZoo.addAnimal(zebre);
        Z0.addAnimal(papillon);

        Z0.addAnimal(poisson);

        myZoo.afficherAnimals();

        myZoo.searchAnimal(zebre);
        myZoo.removeAnimal(girafe);
        //tab apres suppresiion



        Zoo Zoomax = Zoo.comparerZoo(Z0,myZoo);
        System.out.println(Zoomax);









    }

}
