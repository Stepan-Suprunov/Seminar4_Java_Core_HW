import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int id;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Customer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.id = customersList.size() + 1;
        customersList.add(this);
    }

    public static List<Customer> customersList = new ArrayList<>();

    protected enum Gender {MALE, FEMALE}

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
