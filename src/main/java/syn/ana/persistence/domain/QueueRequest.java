package syn.ana.persistence.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class QueueRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	private String name;
	private requestType type;

	public enum requestType {
		SAVE, DELETE, UPDATE
	}

	public QueueRequest() {

	}

	public QueueRequest(String name, requestType type) {
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public requestType getType() {
		return type;
	}

	public void setType(requestType type) {
		this.type = type;
	}

	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

}
