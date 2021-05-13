package com.capg.jpa.p3;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name = "StudentInfo")
public class StudentInfo {
   
	@Id
	private int stdId;
	private String stdName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="StdCourses",
			joinColumns=@JoinColumn(name="stdId"),
			inverseJoinColumns=@JoinColumn(name="courseId"))
	private List<Courses> courses;



	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	
	
}
