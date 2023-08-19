package DesignPatterns.Creational.BuilderDesignPattern.DOG;

public class Main {
    public static void main(String[] args) {
        Dog d1  = new Dog.DogBuilder()
                .setName("reetu")
                .setBreed("German Shepherd")
                .setGender("female")
                .setPrice(1000)
                .build();
        System.out.println(d1);

//        Test t = new Test();
//        Test.Inner i = new Test().new Inner();
//
//        Test t1 = new Test();
//        Test.Sinner s = new Test.Sinner();
//
//        TestStatic.innerStatic ti = new TestStatic.innerStatic();

    }
}
