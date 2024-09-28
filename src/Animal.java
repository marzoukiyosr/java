//////intruction14 ma3raftech nekhdemhaa

public class Animal {
    String family;
    String name;
    String city;
    int nbrCages;
    //final int nbrCages=25;

    //contructeur

    public Animal(String family,String name,String city,int nbrCages) {
        this.family = family;
        this.name = name;
        this.city = city;

        this.nbrCages = nbrCages;
    }
    ////tab3a l'affichage
    //tkhalih il affiche les instaces des objets eli zednahom sous forme de chaine
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", city=" + city+",nb cage :"+nbrCages + "]";
    }







}
