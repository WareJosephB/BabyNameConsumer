package syn.ana.persistence.domain;

public class QueueRequest {
	private long nameID;
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

	public QueueRequest(int id, requestType type) {
		this.setNameID(id);
		this.setType(type);
	}

	public QueueRequest(int id, String name, requestType type) {
		this.setNameID(id);
		this.setName(name);
		this.setType(type);
	}

	public long getNameID() {
		return nameID;
	}

	public void setNameID(long nameID) {
		this.nameID = nameID;
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
}
