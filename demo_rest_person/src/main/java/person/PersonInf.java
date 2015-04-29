package person;


public class PersonInf {
    
	private final long id;
    private final String name;
    private final int age;
    
    public PersonInf(long id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
    public long getId() {
  		return id;
  	}

  	public String getName() {
  		return name;
  	}

  	public int getAge() {
  		return age;
  	}
}