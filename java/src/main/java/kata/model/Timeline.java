package kata.model;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Timeline {

	private String name;
	private String message;
	private LocalDateTime timestamp;
	private ArrayList <Timeline> timelines;

	public String getName() {
		return name;
	}

	public ArrayList<Timeline> getTimelines() {
		return timelines;
	}

	public void setTimelines(ArrayList<Timeline> timelines) {
		this.timelines = timelines;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime localDateTime) {
		this.timestamp = localDateTime;
	}

}
