package interfacepackages.library.Members;

public class Students implements Member{
	String name;
	int id;
	String type;
	public Students(String name,int id,String type) {
		this.name=name;
		this.id=id;
		this.type=type;
	}
	public void memberType(String Type) {
		System.out.println(type);
		
	}
}
