package lambda;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //sample1
        // before java8
        double result=execute(1.0, 3.0, new Calculate() {
            @Override
            public double execute(double first, double second) {
                return first + second;
            }
        });

        // after java8
        double result1=execute(1.0, 3.0, (first,second) -> (first+second));

        //****************************************************************************

        //sample2
        //before java8
        User user1 = new User("John", 30);
        User user2= new User("Doe", 20);
        User user3 = new User("Mark", 22);

        List<User> userList = Arrays.asList(user1, user2, user3);

        for (User user : userList) {
            if (user.getAge() >21){
                System.out.println(user.getName());
            }
        }

        //after java8
        userList.stream().filter(u -> u.getAge()>21).forEach(System.out::println);
    }

    private static double execute(double first, double second, Calculate calculate){
        return calculate.execute(first,second);
    }
}
