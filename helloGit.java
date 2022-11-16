import java.util.Objects;
import java.util.Scanner;

public class helloGit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Git!");

        System.out.println("What is your favorite city? ");
        String city = sc.next();

        if(Objects.equals(city, "Boston and San Francisco")){
            System.out.println("Awesome :) ");
        } else{
            System.out.println("Cool XD");
        }

    }
}
