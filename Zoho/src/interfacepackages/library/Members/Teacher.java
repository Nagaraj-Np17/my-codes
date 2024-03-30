package interfacepackages.library.Members;

public class Teacher implements Member{
	String name;
	int id;
	String type;
	public Teacher(String name,int id,String type) {
		this.name=name;
		this.id=id;
		this.type=type;
	}
	public void memberType(String Type) {
		System.out.println(type);
		
	}
}
