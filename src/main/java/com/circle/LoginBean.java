package com.circle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import com.circle.client.Circle;
import com.circle.client.ClientService;
import com.circle.model.Square;
import com.circle.model.Biodata;


@ManagedBean
@RequestScoped


public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private Circle circle;
	private Square square;
	private Biodata biodata;
	//public String firstName = biodata.FirstName;
	
	@PostConstruct
	public void init(){
		biodata = new Biodata();
		}
	
	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}
	
	public Biodata getBiodata() {
		return biodata;
	}
	public void setBiodata(Biodata biodata) {
		this.biodata = biodata;
	}

	public String login() {
		setCircle(ClientService.getJsonCircle(name));
		String s = ClientService.createJsonCircleApi(getCircle());
		System.out.println(s);
		setSquare(ClientService.getJsonSquare(name));
		s = ClientService.createJsonSquare(getSquare());
		System.out.println(s);
		return "welcome";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
