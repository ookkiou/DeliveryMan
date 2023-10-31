package DM;

public class Person {
    protected String id;
    protected String name;
    public Person(){
        super();
    }
    public Person(String id,String name){
        this.id=id;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
