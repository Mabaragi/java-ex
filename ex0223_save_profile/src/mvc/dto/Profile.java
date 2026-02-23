package mvc.dto;

import java.io.Serializable;

public class Profile implements Serializable{
    String name;
    int weight;
    String password;

    public Profile() {}

    public Profile(String name, int weight, String password) {
        this.name = name;
        this.weight = weight;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Profile [name=" + name + ", weight=" + weight + ", password=" + password + "]";
    }

    
}