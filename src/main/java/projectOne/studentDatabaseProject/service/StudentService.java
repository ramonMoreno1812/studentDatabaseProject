package projectOne.studentDatabaseProject.service;

import java.util.List;

import projectOne.studentDatabaseProject.model.Student;
// here we create methods that will be implement in Student Service Impl CLASS.
public interface StudentService {
	
	List <Student> getAllStudents();
	
	void saveStudent(Student student);
	
	Student getStudentById(long id);
	
	void deleteStudentById(long id);
	
	void sortStudentByFirstName(List<Student> studnet);

}
