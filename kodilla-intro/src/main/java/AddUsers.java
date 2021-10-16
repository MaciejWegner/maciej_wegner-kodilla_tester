public class AddUsers {
    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};
    }
public int averageAge(User[] users){//przyjmuje tablice jako parametr

    int sum = 0;
    int i = 0
     for(int i = 0; i < users.length; i++);

    sum += users.length[i];
return (users.length ==0) ? 0 : (sum / users.length);
        }
}
