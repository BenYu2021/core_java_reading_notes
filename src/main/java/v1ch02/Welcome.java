package v1ch02;

/**
 * @author: ymm
 * @date: 2021/11/24
 * @version: 1.0.0
 * @description:
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println(" = ");
        }
        System.out.println();
    }
}
