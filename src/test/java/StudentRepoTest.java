import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @Test
    void findStudentByIdTestIfNegativeIdThrowNoSuchElementException() {
        // GIVEN
        String id = "-1";
        StudentRepo studentDB = new StudentRepo();

        assertThrows(
                // WHEN
                NoSuchElementException.class,
                // THEN
                () -> studentDB.findStudentById(id));
    }
    @Test
    void findStudentByIdTestIfValidIdReturnStudent() {
        // GIVEN
        String id = "1";
        Student student = new Student("1", "Sviat", "CS");

        StudentRepo studentDB = new StudentRepo();
        studentDB.save(student);

        // THEN
        assertDoesNotThrow(() -> studentDB.findStudentById(id));
    }


}