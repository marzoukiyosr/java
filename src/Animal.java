public class Animal {
    String family;
    String nameA;
    int age;
    boolean isMammal;

    public Animal(String family, String nameA, int age, boolean isMammal) {
        this.family = family;
        this.nameA = nameA;
        this.age = age;
        this.isMammal = isMammal;


    }
    public void displayAnimal()
    {
        System.out.println("family:" +family+",nameA:" +nameA+",age :"+age+",isMammal"+isMammal);
    }
}
