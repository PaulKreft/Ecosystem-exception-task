import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) {
        Optional<Student> student = Optional.ofNullable(students.get(id));

        if(student.isEmpty()) {
            throw new NoSuchElementException();
        }

        return student;
    }
}
