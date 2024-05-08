package composition;

public class Student {

    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.name = name;
        this.age = age;
        this.address = new Address(streetAddress, zipCode, state, phone);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.address.getPhone();
    }

    public void setPhone(String phone) {
        this.address.setPhone(phone);
    }

    public String getState() {
        return this.address.getState();
    }

    public void setState(String state) {
        this.address.setState(state);
    }

    public String getStreetAddress() {
        return this.address.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress) {
        this.address.setStreetAddress(streetAddress);
    }

    public int getZipCode() {
        return this.address.getZipCode();
    }

    public void setZipCode(int zipCode) {
        this.address.setZipCode(zipCode);
    }


}
