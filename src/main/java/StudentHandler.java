import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentHandler {


    public static List<Book> filterBookByName(List<Book> books) {

        return books.stream().filter( b -> b.getName().startsWith("J")).collect(Collectors.toList());
    }

    public List<Student> filterStudentsByGenderByBirthYear(List<Student> givenStudentsList) {

        return  givenStudentsList.stream()
                .filter(s -> s.getGender() == Gender.FEMALE && s.getYearOfBirth() == 1992)
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.toList());
    }
}
