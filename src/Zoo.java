public class Zoo {

    public static int nbrAn = 25; // Taille maximale fixée à 25
    public Animal[] animals = new Animal[nbrAn]; // Tableau d'animaux à taille fixe
    public String name;
    public String city;
    public final int nbrCages;


    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null)
        {
            System.out.println("le nom ne doit pas être vide");
        }
        else
        {
            this.name=name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int  getNbrAn() {
        return nbrAn;
    }



    //contructeur

    public Zoo()
    {
        nbrCages = 0;
        nbrAn = 25;

    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    //intruction 10 +12
    public boolean addAnimal(Animal animal) {
        // Vérifie si l'animal à ajouter est nul
        if (animal == null) {
            System.out.println("L'animal à ajouter est nul !");
            return false; // Retourne false si l'animal est nul
        }

        if (isZooFull()) {
            return false;  // Retourne false si le nombre maximal est atteint
        }

        // Vérifie si l'animal existe déjà
        int verifier = searchAnimal(animal);
        if (verifier != -1) {
            System.out.println("L'animal existe déjà dans le zoo !");
            return false; // Retourne false si l'animal existe déjà
        }

        // Recherche un emplacement libre pour ajouter l'animal
        for (int i = 0; i < nbrAn; i++) {
            if (animals[i] == null) { // Vérifie si l'emplacement est vide
                animals[i] = animal; // Ajoute l'animal
                System.out.println("Ajout avec succès de " + animal.getName());
                return true; // Retourne true après l'ajout
            }
        }

        // Aucune case vide trouvée, retour de false avec un message
        System.out.println("Aucun emplacement libre disponible !");
        return false; // Retourne false si aucun emplacement n'est libre

    }


    //intruction 11 :affichage et recherche

    public void afficherAnimals() {
        for (int j = 0; j < nbrAn; j++) {
            if (animals[j] != null) {
                System.out.println(animals[j]);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAn; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) { // Vérifie que animals[i] n'est pas null et compare les noms
                System.out.println("L'animal existe à l'indice : " + i);
                return i;
            }
        }
        System.out.println("L'animal n'a pas été trouvé.");
        return -1;
    }

    //intruction 13
    public boolean removeAnimal(Animal animal) {
        // Vérifie si l'animal à supprimer est nul

        /*if (animal == null) {
            System.out.println("L'animal à supprimer est nul !");
            return false; // Retourne false si l'animal est nul
        }*/


        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAn - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAn - 1] = null;
        nbrAn--;
        return true;
    }


    //intruction 15
    public boolean isZooFull()
    {
        if (nbrAn == nbrCages)
        {
            System.out.println("le zoo est plein ");
            return true;
        }
        return false;

    }


    //intruction 16

    /*public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAn > z2.nbrAn) {
            System.out.println("Le 1er zoo a plus d'animaux que l'autre");
            return z1; // Retourne z1 si z1 a plus d'animaux
        }
        System.out.println(" z2 a plus ou autant d'animaux");
        return z2; // Retourne z2 si z2 a plus ou autant d'animaux
    }*/
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNbrAn() > z2.getNbrAn()) {
            System.out.println("Le zoo 1 contient plus d'animaux que le zoo 2");
            return z1; // Retourne z1 car il a plus d'animaux
        } else {
            System.out.println("Le zoo 2 contient plus d'animaux que le zoo 1");
            return z2; // Retourne z2 car il a plus ou autant d'animaux
        }
    }




    @Override
    public String toString()
    {
        return "Zoo max [name=" + name + ", city=" + city  + "]";
    }

    ////////////////////////////prosit 4
    //instruction 17(fel intruction de add)

    //intruction 18 voir set name et set age















}
