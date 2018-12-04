package syn.ana.persistence.domain;

import org.springframework.data.annotation.Id;

public class BabyName {

	@Id
	private long _id;
	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

	private String name;
	
	public BabyName(String name) {
		this.name = name;
	}

	public BabyName() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
