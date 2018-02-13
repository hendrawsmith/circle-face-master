package com.circle.model;
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@ManagedBean(name="biodata1")
//@RequestScoped 
@JsonIgnoreProperties(ignoreUnknown=true) 
//@PostConstruct
public class Biodata {
	public String FirstName;
	public String LastName;
	public int Age;
	public String result;
	

	
    // Must have no-argument constructor
	
	public Biodata() {
		
	}

	public Biodata(String FirstName, String LastName, int Age) {
		this.FirstName= FirstName;
		this.LastName = LastName;
		this.Age = Age;
		
	}
	 public String submit() {
	        result = "Submitted values: " + FirstName + ", " + LastName+", "+Age;
	        System.out.println(result);
	        return "welcome";
	    }
	public String getFirstName() {
		return FirstName;
	} 
	public void setFirsName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String LastName() {
		return LastName;
	} 
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer Age) {
		this.Age = Age;
	}
	
    @Override
    public String toString() {
        return new StringBuffer(" First Name : ").append(this.FirstName)
                .append(" Last Name : ").append(this.LastName)
                .append(" Age : ").append(this.Age).toString();
    }
}
