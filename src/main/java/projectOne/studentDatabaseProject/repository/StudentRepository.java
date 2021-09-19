package projectOne.studentDatabaseProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projectOne.studentDatabaseProject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{// import student class; PK long

}
