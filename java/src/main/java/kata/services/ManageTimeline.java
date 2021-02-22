package kata.services;

import java.util.ArrayList;
import kata.model.Timeline;

public class ManageTimeline {

	Timeline timeline = new Timeline();
	MockDatabase mockData = new MockDatabase();

	/*
	 * FEATURE - TIMELINE - Returns a list of timeline posts based on a selected
	 * name.
	 */

	public ArrayList<Timeline> viewTimelineByName(String name) {
		ArrayList<Timeline> sourceList = mockData.createTimelineData();
		ArrayList<Timeline> curatedList = new ArrayList();

		for (Timeline timeline : sourceList) {
			if (timeline.getName().equals(name)) {
				curatedList.add(timeline);
			}
		}

		return curatedList;

	}

	
	
	/*
	 * Placeholder for FEATURE - TIMELINE. Take in a user name and return list of
	 * messages / formatted timestamps for names that user is following.
	 */

}
