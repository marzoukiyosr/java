public class Animal {
    private String family;
    private String name;
	private int age;
	private boolean isMammal;

    public String getFamily()
    {return family;}

    public void setFamily(String family)
    {
        this.family = family;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;

    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age<0){
            System.out.println("age invalide");

        }
        else
        {
            this.age = age;
        }
    }



    //constructeur

    public Animal()
    {

    }
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;


    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age+",isMammel :"+isMammal + "]";
    }






}
