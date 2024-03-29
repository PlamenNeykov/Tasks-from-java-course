package b_animal_farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age <= 15 && age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    //    productPerDay (): double
    public double productPerDay() {
        return calculateProductPerDay();
    }

//    toString(): Override

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name, this.age, productPerDay());
    }

//    calculateProductPerDay() : double

    private double calculateProductPerDay() {
        if (this.age <= 5) {
            return 2;
        } else if (this.age >= 6 && this.age <= 11) {
            return 1;
        } else {
            return 0.75;
        }
    }


}
