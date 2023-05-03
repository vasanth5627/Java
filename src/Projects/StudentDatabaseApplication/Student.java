package Projects.StudentDatabaseApplication;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Year;
import java.util.*;

public class Student {
    private String id;
    private String name;
    private String grade;
    private String year;
    String[] courses;

    double balance;

    double amount;


    public Student(String name, String grade, String year, double amount) {

        this.name = name;
        this.grade = grade;
        this.year = year;
        this.balance= amount;
        this.id = generateId();

    }
    public Student(String name, String grade, double amount) {

        this.name = name;
        this.grade = grade;
        this.year = Integer.toString(Year.now().getValue());
        this.amount= amount;
        this.balance = amount;
        this.id = generateId();

    }

    private String generateId(){
        String ans = grade;
        for(int i=0;i<5;i++){
            ans+= new Random().nextInt(1,10);
        }
        return ans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getYear() {
        return year;
    }

    public String[] getCourses() {
        return courses;
    }

    public double getBalance(){
        return this.balance;
    }



    public void enrollCourses() throws IOException {


        Scanner sc = new Scanner(System.in);

        ArrayList<String> inps = new ArrayList<>();
        System.out.println("Please select the course one by one.\n" +
                "Press enter after selecting each course\n");

        addCourse(inps);


        boolean v = false;



        do{
            System.out.println("You have selected the following courses");
            showStudentCourse(inps);
            System.out.println("1.Confirm\n" +
                    "2. add courses\n" +
                    "3. Opt out of courses");
            try{
               int usrinp = sc.nextInt();
                if(usrinp==1){
                    System.out.println("Your Options are Noted. Thank you");
                    v=true;
                    confirmCourses(inps);


                }
                else if(usrinp>1&&usrinp<4){
                    switch (usrinp){
                        case 2: addCourse(inps);
                            break;
                        case 3: deleteCourse(inps);
                            break;
                        default:
                            System.out.println("Enter a valid value 134");
                    }
                }
                else{
                    System.out.println("enter a valid number 138");
                }
            }
            catch (Exception e){
                sc.next();
                System.out.println("Enter a valid Number 142");

                System.out.println(e.toString());
            }

        }while(!v);






        sc.close();

    }

    public void showStudentCourse(ArrayList<String> inps){

        for (int i = 0; i < inps.size(); i++) {
          switch (inps.get(i)){
              case "1":
                  System.out.println(i+1+"."+"History 101");
                  break;
              case "2":
                  System.out.println(i+1+"."+"Mathematics 101");
                  break;
              case "3":
                  System.out.println(i+1+"."+"English 101");
                  break;
              case "4":
                  System.out.println(i+1+"."+"Chemistry 101");
                  break;
              case "5":
                  System.out.println(i+1+"."+"Computer Science 101");
                  break;
              default:
                  System.out.println("Not a valid course");
          }
        }

    }

    public void addCourse(ArrayList<String> inps){
        System.out.println("The Following Courses are Available");

        System.out.println("Please Select the Number corresponding to the course");

        System.out.println("1. History 101\n" +
                "2. Mathematics 101\n"+
                "3. English 101\n"+
                "4. Chemistry 101\n"+
                "5. Computer Science 101\n" +
                "6.QUIT");

        System.out.println("Each Course fee is Rs600");

        Scanner sc = new Scanner(System.in);

        boolean quit = false;

        while(!quit){


                try{

                    int userInp = sc.nextInt();
                    if(userInp>0 && userInp<=5){
                        if(this.amount<600){
                            System.out.println("insufficient Funds");
                        }
                        else if(!inps.contains(Integer.toString(userInp)) && this.amount>=600) {
                            this.amount-=600;
                            inps.add(userInp + "");
                        }

                        else System.out.println("course already given");
                    }
                    else if(userInp==6){
                        quit = true;

                    }
                    else System.out.println("Enter a valid number 202");

                }
                catch (Exception e){
                    sc.next();
                    System.out.println("enter a Valid Number Exception 208");


                }


        }



    }

    public void deleteCourse(ArrayList<String> inps){
        if(inps.size()>0){
            System.out.println("You have enrolled for the following courses\n" +
                    "select the course you want to delete(input the corresponding number)");

           showStudentCourse(inps);

            Scanner sc = new Scanner(System.in);


            try{
                int inp = sc.nextInt();
                if(inp>0 && inp<=inps.size()){
                    this.amount+=600;
                    inps.remove(inp-1);
                    System.out.println("course deleted");
                }
                else{
                    System.out.println("select a valid course number");
                }
            }
            catch (Exception e){
                System.out.println("Enter a valid Number delete course");
            }
        }
        else{
            System.out.println("You have not enrolled in any course");
        }
    }

    public void confirmCourses(ArrayList<String> inps){

        this.balance=this.balance-this.amount;
        String[] brr = new String[inps.size()];
        brr = inps.toArray(brr);
        this.courses=brr;
        System.out.println("Your balancce is: "+this.balance);

    }

    public String toString(){
        return this.id+" "+this.name+" "+this.grade+" "+this.year+" "+this.amount+" "+this.balance;
    }




}
