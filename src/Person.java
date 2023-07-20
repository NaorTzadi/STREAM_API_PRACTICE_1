import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String profession;
    private final int age;
    private final int id;


    public Person(String firstName,String lastName,String profession,int age,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.profession=profession;
        this.age=age;
        this.id=id;
    }
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getProfession(){return this.profession;}
    public int getAge(){return this.age;}
    public int getId(){return this.id;}




        private static final List<Person> people = new ArrayList<>();
        static {
            people.add(new Person("John", "Doe", "Software Developer", 30, 1));
            people.add(new Person("Jane", "Smith", "Architect", 35, 2));
            people.add(new Person("Alice", "Johnson", "Data Scientist", 28, 3));
            people.add(new Person("Bob", "Miller", "Designer", 32, 4));
            people.add(new Person("Charlie", "Brown", "Project Manager", 40, 5));
            people.add(new Person("Daniel", "White", "Engineer", 36, 6));
            people.add(new Person("Emma", "Black", "Product Manager", 29, 7));
            people.add(new Person("George", "Green", "Tester", 45, 8));
            people.add(new Person("Hannah", "Baker", "DevOps", 31, 9));
            people.add(new Person("Ivan", "Cook", "Data Analyst", 27, 10));
            people.add(new Person("Julia", "Carter", "UX/UI Designer", 33, 11));
            people.add(new Person("Kevin", "Bell", "System Analyst", 37, 12));
            people.add(new Person("Laura", "Clark", "QA Engineer", 41, 13));
            people.add(new Person("Michael", "Fox", "Database Administrator", 38, 14));
            people.add(new Person("Nancy", "Gray", "Security Specialist", 42, 15));
        }
        public static List<Person> getPeople() {
            return people;
        }


}
