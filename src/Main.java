//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Animal[] animals=new Animal[10];

        Zoo Z=new Zoo(animals,"hhh",55,true );

        Animal an=new Animal("eeee", "qqq", "yyy",10);
        Animal A1=new Animal("AA", "ZZZZ", "ppp",120);
        Animal A2=new Animal("j1", "qqq", "ppp",100);
        Animal A4=new Animal("j1", "YY5", "ppp",88);



        Z.addAnimal(an);
        Z.addAnimal(A1);
        Z.addAnimal(A2);
        Z.addAnimal(A4);


        Z.displayAnimals(Z.animals);

        Z.searchAnimal(A1);
        Z.searchAnimal(an);

        Z.removeAnimal(A2);
        System.out.println("le tableau aprés supression :");
        Z.displayAnimals(Z.animals);
        //Z.searchAnimal(A2);













    }
}