package Projects.EmailApplication;



public class Person {
    private String firstName;
    private String lastName;
    private Email email;
    private String dob;

    private int id;

    private String department;



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    public Person(String firstName, String lastName,String dob, int id, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = new Email(firstName,lastName,company,department,dob+id+lastName);
        this.dob = dob;
        this.id = id;
        this.department = department;
        this.company = company;
    }
    public Person(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Email getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.email.setPassword(password);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String toString(){
        return firstName+" "+lastName+" "+email+" "+dob+" "+id+" "+department+" "+company;
    }
}
