package OpinionPoll_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String personalData = scanner.nextLine();// name and age
            //"Pesho 12" -> ["Pesho", "12"]
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split("\\s+")[1]);
            Person person = new Person(name, age);
            people.add(person);


        }

        List<Person> filteredList = people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
        filteredList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for (Person person : filteredList ) {
            System.out.println(person);
        }

    }
}
