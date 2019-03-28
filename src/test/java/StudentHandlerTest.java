import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StudentHandlerTest {

    List<Book> books = Arrays.asList(
        new Book("Java", 10),
        new Book("JavaScript", 12),
        new Book("Python", 14)
    );

    @Test
    public void givenListOfStudent_WhenFiltringLisOfStudents_ThenListOfStudentsCorrectlyFiltred() {

        final List<Student> givenStudentsList = Arrays.asList(
            new Student("AFFAGARD", "Christian", 1990, Gender.MALE),
            new Student("AGROUR", "Rachid", 1992, Gender.MALE),
            new Student("Adrego", "Alexandre", 1993, Gender.MALE),
            new Student("ALAGILLE", "Thomas", 1992, Gender.MALE),
            new Student("AIDEL", "Imene", 1992, Gender.FEMALE),
            new Student("ARDISSON", "Isabelle", 1992, Gender.FEMALE)
        );

        //StudentHandler studentHandler = new StudentHandler();
        List<Student> filtredStudentsList = new StudentHandler().filterStudentsByGenderByBirthYear(givenStudentsList);
        Assert.assertTrue(filtredStudentsList.size() == 2);
        //Assert.assertEquals(2, filtredStudentsList.size());
        Assert.assertEquals("AIDEL", filtredStudentsList.get(0).getFirstName());
        Assert.assertEquals("ARDISSON", filtredStudentsList.get(1).getFirstName());
        
    }

    @Test
    public void givenListOfBook_WhenFiltring_ThenCorectlyFiltred(){

        List<Book> givenListOfBook = StudentHandler.filterBookByName(books);
        Assert.assertTrue(givenListOfBook.size() == 2);
    }


}
