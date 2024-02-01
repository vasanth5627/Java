package Java8.Streams.Medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();


        /**
         Map and flat Map both return another stream
         Map -> data-transformation(one-to-one mapping), If the parameter in the stream returns a Scalar(eg: customer.getEmail() single email id) then use Map
         flatMap-> data-transformation and flattering(one to many), If the parameter returns a Vector(eg: customer.getPhoneNumbers(), customer.getProductsOrdered() which returns a list) then use FlatMap.
         **/

        //List all distinct project in non-ascending order
        List<Project> projects = employeeList.stream().flatMap(e -> e.getProjects().stream())
                .distinct()
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .collect(toList());
        System.out.println(projects);

        //Map each employee to his projects
        Map<String, List<Project>> projectsForEmployee = employeeList.stream()
                .collect(Collectors.toMap(e -> e.getFirstName() + " " + e.getLastName(), Employee::getProjects));
        System.out.println(projectsForEmployee);

        //Print full name of any employee whose firstName starts with ‘B’.
        List<String> fullNames = employeeList.stream().filter(e -> e.getFirstName().startsWith(Character.toString('B')))
                .map(e -> e.getFirstName() + " " + e.getLastName()).toList();
        System.out.println(fullNames);

        //List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
        List<Employee> employeesJoinedIn2023 = employeeList.stream().filter(e -> Integer.parseInt(e.getId().substring(0, 4)) == 2023).toList();
        System.out.println("Joined in 2023: " + employeesJoinedIn2023);

        //Sort employees based on firstName, for same firstName sort by salary.
//        List<Employee> sortedEmployees = employeeList.stream().sorted((a,b)->a.getFirstName().compareTo(b.getFirstName()))
//                .sorted((a,b)->a.getSalary()-b.getSalary()).collect(toList());

        //   [Employee [firstName=Babu, lastName=Rao, salary=900000, projects=[Project{name='Two Factor Authentication', team='Authentication', projectManager='MSD'}]], Employee [firstName=Bhaskar, lastName=Sharan, salary=900000, projects=[Project{name='Delta Model', team='Login', projectManager='Robert Downey Jr'}, Project{name='Beta Enhancement', team='Authentication', projectManager='Chris'}]], Employee [firstName=Shruti, lastName=Sen, salary=1100000, projects=[Project{name='Pegasus Model', team='Data', projectManager='Vikram'}]], Employee [firstName=Akshay, lastName=Kumar, salary=1200000, projects=[Project{name='Delta Model', team='Login', projectManager='Robert Downey Jr'}]], Employee [firstName=Dev, lastName=Anand, salary=1300000, projects=[Project{name='Remove Invalid User', team='Proxy', projectManager='Jeetu'}, Project{name='Common UI', team='UI', projectManager='Robert Downey Jr'}]], Employee [firstName=Priti, lastName=Kabir, salary=1800000, projects=[Project{name='Two Factor Authentication', team='Authentication', projectManager='MSD'}, Project{name='Beta Enhancement', team='Authentication', projectManager='Chris'}, Project{name='Common UI', team='UI', projectManager='Robert Downey Jr'}]], Employee [firstName=Chris, lastName=Martin, salary=2200000, projects=[Project{name='Delta Model', team='Login', projectManager='Robert Downey Jr'}, Project{name='Two Factor Authentication', team='Authentication', projectManager='MSD'}]], Employee [firstName=Sanjay, lastName=Singhania, salary=2200000, projects=[Project{name='Pegasus Model', team='Data', projectManager='Vikram'}, Project{name='Delta Model', team='Login', projectManager='Robert Downey Jr'}, Project{name='Remove Invalid User', team='Proxy', projectManager='Jeetu'}, Project{name='Data Transition', team='Data', projectManager='Atif Aslam'}]], Employee [firstName=Babu, lastName=Dutt, salary=2600000, projects=[Project{name='Source Verification', team='Data', projectManager='Pablo'}, Project{name='Remove Invalid User', team='Proxy', projectManager='Jeetu'}, Project{name='Two Phase Deployment', team='Deployment', projectManager='Shaktiman'}]], Employee [firstName=Dev, lastName=Sharma, salary=3500000, projects=[Project{name='Pegasus Model', team='Data', projectManager='Vikram'}, Project{name='Customer Onboarding', team='Ads', projectManager='Vedha'}, Project{name='Beta Enhancement', team='Authentication', projectManager='Chris'}, Project{name='Site Reliability', team='Admin', projectManager='Zaheer Khan'}]]]
        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparingInt(Employee::getSalary)).collect(toList());
        System.out.println(sortedEmployees);

        //Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
        Employee highestSalaryEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).distinct().toList().get(2);
        System.out.println(highestSalaryEmployee);

        //print minimum and maximum salary
        List<Integer> highestSalaries = employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).map(Employee::getSalary).toList();
        System.out.println(highestSalaries);
        int minSalary = employeeList.stream().min(Comparator.comparingInt(Employee::getSalary)).get().getSalary();
        int maxSalary = employeeList.stream().max(Comparator.comparingInt(Employee::getSalary)).get().getSalary();
        System.out.println("min salary: " + minSalary + " max salary: " + maxSalary);

        // List of people working on more than 2 projects.
        List<Employee> employeesWithMoreThanTwoProjects = employeeList.stream().filter(e->e.getProjects().size()>2).toList();
        System.out.println(employeesWithMoreThanTwoProjects);

       // Count of total laptops assigned to the employees.
        int count = (int)employeeList.stream().map(Employee::getTotalLaptopsAssigned).count();
        System.out.println(count);

        //Count of all projects with Robert Downey Jr as PM.
        int count_projects = (int)employeeList.stream().flatMap(e->e.getProjects().stream()).filter(p->p.getProjectManager().equals("Robert Downey Jr")).count();
        System.out.println(count_projects);

        //List of all people working with Robert Downey Jr.
        List<Employee> listOfPeopleWorkingWithRDJ = employeeList.stream().filter(e -> e.getProjects().stream()
                .anyMatch(p -> p.getProjectManager().equals("Robert Downey Jr"))).toList();
        System.out.println(listOfPeopleWorkingWithRDJ);

        //Create a map based on this data, they key should be the year of joining, and value should be list of all the employees who joined the particular year
        Map<Integer,List<Employee>> yearOFEmployees = employeeList.stream().collect(Collectors.groupingBy(e->Integer.parseInt(e.getId().substring(0, 4))));
        System.out.println(yearOFEmployees);

        //Create a map based on this data, the key should be year of joining and value should be the count of people joined in that particular year.
        Map<Integer,Long> yearOFEmployeesCount = employeeList.stream()
                .collect(Collectors.groupingBy(e->Integer.parseInt(e.getId().substring(0, 4)),
                        Collectors.counting()));

        System.out.println(yearOFEmployeesCount);
        Map.Entry<Integer,Long> yearOFEmployeesMaxCount = employeeList.stream()
                .collect(Collectors.groupingBy(e->Integer.parseInt(e.getId().substring(0, 4)),
                        Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(yearOFEmployeesMaxCount);




    }


}
