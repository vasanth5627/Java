package Projects.EmailApplication;



public class Email {
    private String password;
    private String email;

    public Email(String firstName, String lastName, String company, String department,String password) {
        this.email= firstName+"."+lastName+"@"+department+"."+company+".com";
        this.password = setPassword(password);
    }

    public String getPassword() {
        return password;
    }


    public String setPassword(String password) {
        if(password.length()>7 && password.length()<21){
            this.password = password;

        }

        else System.out.println("Password should be between 8-20 characters");
        return password;

    }

    public String toString(){
        return this.email+" "+this.password;
    }


}
