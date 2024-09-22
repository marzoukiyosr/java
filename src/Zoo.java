public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    //Constructeur

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Nom: " + name + ", city: " + city + ", Nombre de cages: " + nbrCages);
    }
}
