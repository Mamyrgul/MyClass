import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

/*  University, School, Car жана Person деген класс тузунуз
        Алардын свойстваларын ойлоп табыныз
        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Name cars: ");
       Car car = new Car();
       String [] cars= {"BMW","Camri","Honda"};
       car.setName(cars);
        System.out.println(Arrays.toString(car.getName()));
        System.out.print("They were created: ");
        car.setWhen(LocalDate.of(2024,1,1));
        System.out.println(car.getWhen());
        System.out.print("Their price: ");
        long [] price= {2000000,463000,2472800};
        car.setPrice(price);
        System.out.println(Arrays.toString(car.getPrice()));
        System.out.print("Their color: ");
        String [] color={"Red", "Black","White"};
        car.setColor(color);
        System.out.println(Arrays.toString(car.getColor()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        School school= new School();

        System.out.print("School name: ");
        school.setName("Shekspir");
        System.out.println(school.getName());
        System.out.print("Founder: ");
        school.setFounder("Bill Gaits");
        System.out.println(school.getFounder());
        System.out.print("Build day: ");
        school.setBuildDay(LocalDate.of(1978,11,11));
        System.out.println(school.getBuildDay());
        System.out.print("Number of students: ");
        school.setStudents(29647);
        System.out.println(school.getStudents());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        University university = new University();

        System.out.print("Name of universities: ");
        String [] name = {"Harvard","Stanford","California"};
        university.setName(name);
        System.out.println(Arrays.toString(university.getName()));
        System.out.print("They are located: ");
        String [] located= {"America","Chicago","California"};
        university.setWhichCountry(located);
        System.out.println(Arrays.toString(university.getWhichCountry()));
        System.out.print("They are language: ");
        String [] language= {"English","Russian","Kyrgyz"};
        university.setWhichLanguage(language);
        System.out.println(Arrays.toString(university.getWhichLanguage()));
        System.out.print("Their contract is for a year: ");
        int [] contract = {132000,4673000,57483000};
        university.setPrice(contract);
        System.out.println(Arrays.toString(university.getPrice()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Person person = new Person();
        System.out.print("Where are you from : ");
        String from= scanner.nextLine();
        person.setCountry(from);
        System.out.println(person.getCountry());
        System.out.print("What light are you : ");
        String colour= scanner.nextLine();
        person.setColor(colour);
        System.out.println(person.getColor());
        System.out.print("How old are you : ");
        int age= scanner.nextInt();
        person.setAge(age);
        System.out.println(person.getAge());
        System.out.print("what's your height : ");
        int height = scanner.nextInt();
        person.setHeight(height);
        System.out.println(person.getHeight());

        System.out.println("Congratulations, you received your visa");
    }
}
