package kata.services;

import java.time.LocalDateTime;
import java.util.ArrayList;

import kata.model.Timeline;
import kata.model.User;

public class MockDatabase {

	Timeline timeline = new Timeline();
	
	public ArrayList<Timeline> createTimelineData() {

		ArrayList<Timeline> allPosts = new ArrayList();

		Timeline bob = new Timeline();
		Timeline charlie = new Timeline();
		
		bob.setName("Bob");
		bob.setMessage("Good game though.");
		bob.setTimestamp(LocalDateTime.now());
		allPosts.add(bob);

		bob.setName("Bob");
		bob.setMessage("Darn! We lost!");
		bob.setTimestamp(LocalDateTime.now());
		allPosts.add(bob);


		charlie.setName("Charlie");
		charlie.setMessage("I'm in New York today! Anyone want to have a coffee?");
		charlie.setTimestamp(LocalDateTime.now());
		allPosts.add(charlie);
		
		timeline.setTimelines(allPosts);
		return allPosts;

	}
	
	public ArrayList<User> createUserData() {
		
		ArrayList<User> allUsers = new ArrayList();
		
		User bob = new User();
		User charlie = new User();
		User alice = new User();
		
		ArrayList<String> bobFollows = new ArrayList();
		bobFollows.add("Alice");
		bob.setName("Bob");
		bob.setFollowing(bobFollows);
		allUsers.add(bob);
		
		ArrayList<String> charlieFollows = new ArrayList();
		charlieFollows.add("Alice");
		charlieFollows.add("Bob");
		charlie.setName("Charlie");
		charlie.setFollowing(charlieFollows);
		allUsers.add(charlie);
		
		ArrayList<String> aliceFollows = new ArrayList();
		aliceFollows.add("Bob");
		alice.setName("Bob");
		alice.setFollowing(aliceFollows);
		allUsers.add(alice);
		
		return allUsers;
		
	}

}
