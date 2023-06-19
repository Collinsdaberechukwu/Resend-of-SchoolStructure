public class ApllicantDetails {
    private String name;
    private String email;
    private String location;



    public ApllicantDetails(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
//        this.age = age;

    }
    public ApllicantDetails(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }





    @Override
    public String toString() {
        return "Apllicant Details{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
