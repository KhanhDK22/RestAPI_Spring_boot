package Student_Management.Rest_API_for_student_management.repository;

import Student_Management.Rest_API_for_student_management.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}