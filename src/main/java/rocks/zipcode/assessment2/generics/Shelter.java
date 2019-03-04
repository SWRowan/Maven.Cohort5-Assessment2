package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<P> {

    List<Object> shelter;


    public Shelter() {
        shelter = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add(object);
    }

    public Boolean contains(Object object) {
        if(shelter.contains(object)){
            return true;
        }
        return false;
    }

    public void remove(Object object) {
        shelter.remove(object);

    }

    public Object get(Integer index) {

        return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.indexOf(ageable);
    }
}