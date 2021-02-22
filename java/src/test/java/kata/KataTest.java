package kata;

import org.junit.jupiter.api.Test;
import kata.model.Timeline;
import kata.model.User;
import kata.services.ManageTimeline;
import kata.services.MockDatabase;
import kata.services.Publish;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;

class KataTest {

	Timeline timeline = new Timeline();
	MockDatabase mockData = new MockDatabase();
	Publish publish = new Publish();
	ManageTimeline manageTime = new ManageTimeline();

	ArrayList<Timeline> list = new ArrayList();
	ArrayList<User> ulist = new ArrayList();

	@Test
	void testCreateMockTimelineDataList() {
		list = mockData.createTimelineData();
		int expected = 3;
		int actual = list.size();

		assertEquals(expected, actual);
	}

	@Test
	void testCreateMockUserDataList() {
		ulist = mockData.createUserData();
		int expected = 3;
		int actual = ulist.size();

		assertEquals(expected, actual);
	}

	@Test
	void testCreateMockTimelineDataContents() {
		String expected = "Darn! We lost!";
		String actual = "";
		list = mockData.createTimelineData();

		for (Timeline timeline : list) {
			if (timeline.getName().equals("Bob")) {
				actual = timeline.getMessage();
			}
		}

		assertEquals(expected, actual);
	}

	/*
	 * FEAUTURE - PUBLISH TEST - Confirm message is published when publish method is
	 * called.
	 */

	@Test
	void testPublishMethodAddsToDatabase() {
		String name = "Alice";
		String message = "I love the weather today.";
		LocalDateTime timestamp = LocalDateTime.now();
		int expected = 4;
		int actual = publish.publish(name, message, timestamp).size();

		assertEquals(expected, actual);
	}

	/*
	 * FEAUTURE - PUBLISH TEST - Confirm message is published when publish method is
	 * called.
	 */

	@Test
	void testPublishMethodAddsToDatabaseContents() {
		String name = "Alice";
		String message = "I love the weather today.";
		LocalDateTime timestamp = LocalDateTime.now();
		String expected = message;
		String actual = "";
		list = publish.publish(name, message, timestamp);

		for (Timeline timeline : list) {
			if (timeline.getName().equals("Alice")) {
				actual = timeline.getMessage();
			}
		}

		assertEquals(expected, actual);

	}

	/*
	 * FEATURE - TIMELINE - Confirm user can view another user's timeline by name.
	 */

	@Test
	void testViewTimelineByName() {
		String name = "Bob";

		int expected = 2;
		int actual = manageTime.viewTimelineByName(name).size();

		assertEquals(expected, actual);

	}

	/*
	 * FEATURE - TIMELINE - Confirm user can view another user's timeline by name.
	 */

	@Test
	void testViewTimelineByNameContents() {
		String name = "Bob";
		String expected = "Darn! We lost!";
		String actual = "";
		list = manageTime.viewTimelineByName(name);

		for (Timeline timeline : list) {
			if (timeline.getName().equals("Bob")) {
				actual = timeline.getMessage();
			}
		}

		assertEquals(expected, actual);

	}

}
