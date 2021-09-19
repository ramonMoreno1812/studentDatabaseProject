package projectOne.studentDatabaseProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import projectOne.studentDatabaseProject.model.Student;
import projectOne.studentDatabaseProject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired // inject an instance of student repo here;
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll(); // method available to use in repo
	}

	@Override
	public void saveStudent(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException("Student not found for id :: " + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(long id) {
		this.studentRepository.deleteById(id);
		
	}

	@Override
	public void sortStudentByFirstName(List<Student> studnet) {
		
	}

} 
