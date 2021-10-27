public class ageA {
    String name;
    double age;
    double height;

    public ageA(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAge() {
        if (name != null) {
            if (age > 30) {
                System.out.println("User is older than 30");
            } else {
                System.out.println("User is 30 or younger");
            }
        }
    }

    public void checkHeight() {
        if (name != null) {
            if (height > 30) {
                System.out.println("User is higher than 160 cm");
            } else {
                System.out.println("User is shorter than 160 cm");
            }
        }
    }

    public void checkName() {
        System.out.println(name);
    }
}
