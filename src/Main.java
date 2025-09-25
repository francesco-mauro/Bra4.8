import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);

        System.out.println(friend3.name);
        System.out.println(friend3.numOfFriends);

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();


    }
}
