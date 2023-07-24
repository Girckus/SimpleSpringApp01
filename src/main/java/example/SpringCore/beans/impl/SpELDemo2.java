package example.SpringCore.beans.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELDemo2 {

	@Value("#{'Loncs'}")
	private String myString;
	
	@Value("#{'rodrigogirckus@gmail.com'}")
	private String email;
	
	private String myString2;
	
	private List<String> list;
	
	public SpELDemo2() {
		list = new ArrayList<String>();
		list.add("Lion");
		list.add("Dog");
		list.add("Cat");
		list.add("Sheep");
		list.add("Snake");
	}

	public String getMyString() {
		return myString;
	}

	public String getMyString2() {
		return myString2;
	}

	public void setMyString2(String myString2) {
		this.myString2 = myString2;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getList() {
		return list;
	}
	
}