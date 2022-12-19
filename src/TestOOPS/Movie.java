package TestOOPS;
//Difference between object and class.
//        Create a class named Movie which contains multiple data members name, actor,
//        collection amount etc, also contains getters setters and method isBlockBuster based on
//        collection amount ?
public class Movie {
    private String name;
    private  String actor;
    private int amount;

    public Movie(String name, String actor, int amount) {
        this.name = name;
        this.actor = actor;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


//    Write a program where we create a class “netflixUser”
//        which is inherited by multiple classes like adminUser, premiumUser,  basicUser etc.
