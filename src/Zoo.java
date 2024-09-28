public class Zoo {
    Animal[] animals;
    String name;
    int age;
    boolean isMammal;

    //constructeur

    public Zoo(Animal[] animals, String name, int age, boolean isMammal) {
        this.animals = animals;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    //instruction  10+12 Question unicité
    public boolean addAnimal(Animal animal) {

        if(searchAnimal(animal)==-1) {


            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    return true;
                }
            }
            return false;
        }
        System.out.println(" le nom doit être unique tu peux pas l'ajouter");
        return false;
    }

    //intruction11

    public void displayAnimals(Animal[] Animals) {
        for (int j = 0; j < animals.length; j++) {
            if(animals[j] != null)
            {
                System.out.println(animals[j]);
            }
        }
    }

    //intruction11

    public int searchAnimal(Animal A) {
        for (int i=0;i<animals.length; i++)
        {
            if (animals[i]!=null && animals[i].name==A.name)
            {
                System.out.println("L'animal existe son indice est :"+i);
                return i;
            }
        }

        //System.out.println("l'animal n'existe pas");
        return -1;
    }

    //instruction13
    public boolean removeAnimal(Animal A) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i]!=null && animals[i].name == A.name) {
                animals[i] = null;//spprimer l'animale
                System.out.println("suppression avec succés");
                return true;
            }
        }
        System.out.println("le n'existe pas donc pas de suppression ");
        return false;
    }


    //intruction15
   /* public boolean isZooFull()
    {
        if(animals.length==nbrCages)
        {
            System.out.println("le Zoo est plein");
        }

    }*/


}



