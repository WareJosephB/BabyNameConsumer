package syn.ana.persistence.domain;

import org.springframework.data.annotation.Id;

public class BabyName {

	@Id
	private long id;
	private String name;

	public BabyName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
