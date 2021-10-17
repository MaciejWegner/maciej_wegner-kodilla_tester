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
    public int averageAge(User[] users) { //przyjmuje tablice jako parametr
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result += users[i].age;
            return (users.length == 0) ? 0 : (result / users.length);
        }}

    public int minAge(User[] users) {
      int result = 0;
    for (int i = 0; i < users.length; i++) ;
    int i = 0;
    if (users[i].age < result / users.length) {;
          return(users[i].age);
    }
    }
    public int maxAge(User[] users) {
        int result = 0;
        for (int i = 0; i < users.length; i++) ;
        int i = 0;
        if (users[i].age > result / users.length) {
                    return(users[i].age);
        }
    }

}

