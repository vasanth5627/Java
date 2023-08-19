package DesignPatterns.Creational.BuilderDesignPattern.DOG;

public class Dog {
    private String name; //optional
    private String gender; //can't change it
    private String breed; //can't change it
    private double price;

    public Dog(DogBuilder dog) {
        this.name = dog.name;
        this.breed = dog.breed;
        this.gender = dog.gender;
        this.price  = dog.price;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }

    static class DogBuilder{

        private String name; //optional
        private String gender; //can't change it
        private String breed; //can't change it
        private double price;

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }
    }
}
