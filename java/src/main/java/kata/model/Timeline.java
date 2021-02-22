package kata.model;

import java.time.LocalDateTime;

public class Timeline {

	private String name;
	private String message;
	private LocalDateTime timestamp;

	public String getName() {
		return name;
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
