package projectOne.studentDatabaseProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity// this class is a table in sql
@Table(name = "student") // create table in SQL named student
public class Student {
	
	// Student attributes all PRIVATE access modifier. 
	
	@Id
	@SequenceGenerator(// for primary keys auto increment
			name = "student_sequence", // name of this particular sequence Generator
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	@GeneratedValue(// how to generate particular values for the Student ID
			strategy = GenerationType.SEQUENCE,//Using sequence to generate values
			generator = "student_sequence"
			
			)
	private long studentId;
	
	@Column(name = "first_name")
	private String studentFirstName;
	
	@Column(name = "last_name")
	private String studentLastName;
	
	@Column(name = "date_of_birth")
	private String studentDob; // student date of birth
	
	@Column(name = "email")
	private String studentEmail;
	
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public Student(long studentId, String studentFirstName, String studentLastName, String studentDob,
			String studentEmail) {

		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentDob = studentDob;
		this.studentEmail = studentEmail;
	}
	
	public Student(String studentFirstName, String studentLastName, String studentDob, String studentEmail) {

		
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentDob = studentDob;
		this.studentEmail = studentEmail;
	}
	
	public Student() {
		
	}
	
	

}
