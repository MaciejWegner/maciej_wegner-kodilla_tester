public class ageB {
    public static void main(String[]args) {
        ageA person1 = new ageA("Adam", 30, 178);
        System.out.println(person1.name + " " + person1.age + " " + person1.height);
        person1.checkAge();
        person1.checkHeight();
        person1.checkName();
    }
}
