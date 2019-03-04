package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;


    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof Person)){
            return false;
        }
//        System.out.println(((Person) o).getId());
//        System.out.println(id);
        return (((Person) o).getId().equals(id) && ((Person) o).getName().equals(name) && ((Person) o).getAddress().equals(address));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person{id="+id+", ");
        sb.append("name='"+name+"', ");
        sb.append("address="+address.toString()+"}");

        return sb.toString();
    }
}