package springmvcsearch.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String userName;
	private Long userid;
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date date;
	private List<String> courses;
	private String gender;
	private String studenttype;
	private Address address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudenttype() {
		return studenttype;
	}
	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [userName=" + userName + ", userid=" + userid + ", date=" + date + ", courses=" + courses
				+ ", gender=" + gender + ", studenttype=" + studenttype + ", address=" + address + "]";
	}
	
}
