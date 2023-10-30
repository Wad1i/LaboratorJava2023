package Laborator4;

public class Lab4 {
    public static void main(String[] args){
        mijloc("masina");
        mijloc("reptila");
        Person person1=new Person();
        Profesor profesor1=new Profesor();
        Student student1=new Student();


        person1.setName("Mihai");
        person1.setAge(19);
        person1.setEmail("ceva@yahoo.com");

        profesor1.setName("Mircea");
        profesor1.setAge(30);
        profesor1.setEmail("mimi@yahoo.com");

        student1.setName("Mira");
        student1.setAge(19);
        student1.setEmail("mii@yahoo.com");

    }

    public static void mijloc(String cuvant){
        int lungime=cuvant.length();
        if (lungime%2==0)
        {
            System.out.print(cuvant.charAt(lungime/2-1));
            System.out.print(cuvant.charAt(lungime/2));
            System.out.println();
        }
        else
        {
            System.out.println(cuvant.charAt(lungime/2));
        }
    }


}
