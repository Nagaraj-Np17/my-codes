package interfacepackages.university.faculty;

public class Teaching implements Faculty{
	private String name;
	private String id;
	private String type;
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	

	public Teaching(String name, String id, String type) {
		
		this.name = name;
		this.id = id;
		this.type = type;
	}

	@Override
	public void displayDetails() {
		System.out.println("Name:"+name +"\n"+"Id"+id+"\n"+"Type"+type);
		
	}

}
