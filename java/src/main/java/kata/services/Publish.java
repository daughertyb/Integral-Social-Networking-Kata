package kata.services;

import java.time.LocalDateTime;
import java.util.ArrayList;

import kata.model.Timeline;

public class Publish {

	Timeline timeline = new Timeline();
	MockDatabase mockData = new MockDatabase();

	/*
	 * FEATURE - PUBLISH - Takes in name, message, timestamp and returns an updated
	 * list of timelines that can be used to validate publish was successful.
	 */

	public ArrayList<Timeline> publish(String name, String message, LocalDateTime localDateTime) {

		ArrayList<Timeline> timelineData = mockData.createTimelineData();

		timeline.setName(name);
		timeline.setMessage(message);
		timeline.setTimestamp(localDateTime);

		timelineData.add(timeline);

		return timelineData;

	}
}
