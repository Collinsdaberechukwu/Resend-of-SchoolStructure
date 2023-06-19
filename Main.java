public class Main {
    public static void main(String[] args) {
        ApllicantDetails apllicantDetails = new ApllicantDetails("\nCollins Daberechukwu.","collinsdaberechi20@gmail.com","Lagos State");
        Principal principal = new Principal("Principal admits student based on age. \nPrincipal also expels students.");
        Principal principalAge = new Principal(23);
        Abstract StaffDuties = new Abstract("Teacher :","Non-Academic Staffs :","\nEngineering Department,","Student : ");





        System.out.println(apllicantDetails.getName());
        System.out.println(apllicantDetails.getEmail());
        System.out.println(apllicantDetails.getLocation());
        System.out.println(principalAge.getAge());



        System.out.println(principal.getPrincipalDuties());
        StaffDuties.getTeachers();
        StaffDuties.getStudent();
        StaffDuties.getNonAcademic();


    }
}