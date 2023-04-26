package Kodlama.io.Devs.entities.concretes;

public class SubTechnology {
	private int id;
	private int programmingLanguageId;
	private String name;
	
	public SubTechnology() {
	}

	public SubTechnology(int id, int programmingLanguageId, String name) {
		this.id = id;
		this.programmingLanguageId = programmingLanguageId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProgrammingLanguageId() {
		return programmingLanguageId;
	}

	public void setProgrammingLanguageId(int programmingLanguageId) {
		this.programmingLanguageId = programmingLanguageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
