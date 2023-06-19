public class Principal extends ApllicantDetails {

    private String principalDuties;
    private int Age;

    public Principal(String principalDuties) {
        this.principalDuties = principalDuties;
    }

    public Principal(int age) {
        Age = age;
    }

    public String getPrincipalDuties() {
        return principalDuties;
    }

    public void setPrincipalDuties(String principalDuties) {
        this.principalDuties = principalDuties;
    }

    public int getAge() {
        if (Age>=16){
            System.out.println("\n(Congratulation you've being admitted)");
        }else {
            System.out.println("\n(SORRY you didn't meet up to required score, try again next year.)");
        }
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Principal(){ }

    public Principal(String name, String email, String location) {
        super(name, email, location);
    }
}
