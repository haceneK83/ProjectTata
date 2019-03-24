import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentHandler {


    public List<Student> filterStudentsByGenderByBirthYear( List<Student> givenStudentsList) {

        return  givenStudentsList.stream()
                .filter(s -> s.getGender() == Gender.FEMALE)
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.toList());
    }


}
