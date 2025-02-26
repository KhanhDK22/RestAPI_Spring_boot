package Student_Management.Rest_API_for_student_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student_Management.Rest_API_for_student_management.entity.Student;
import Student_Management.Rest_API_for_student_management.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(int id, Student studentDetails) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(studentDetails.getName());
                    student.setAge(studentDetails.getAge());
                    student.setEmail(studentDetails.getEmail());
                    return studentRepository.save(student);
                }).orElse(null);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
