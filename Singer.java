
public class Singer {

	
	private String name;
	private int id;
	static int counter=0;
	static Singer singers[] = new Singer [10];
	
	public Singer(String name) {
		singers[counter]=this;
		this.name = name;
		id = ++counter;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Singer [name=" + name + ", id=" + id + "]";
	}
}
