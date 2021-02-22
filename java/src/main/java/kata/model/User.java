package kata.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private ArrayList<String> following;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getFollowing() {
		return following;
	}
	public void setFollowing(ArrayList<String> following) {
		this.following = following;
	}
	
	

}
