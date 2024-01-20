import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //курс -> списък с имена на студентите
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            //{courseName} : {studentName} -> split  -> ["course", "student"]
            String course = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if(!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(studentName);

            input = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                        System.out.println(e.getKey() + ": " + e.getValue().size());
                        e.getValue().stream()
                                .sorted(String::compareTo)
                                .forEach(student -> System.out.println("-- " + student));
                });

    }
}