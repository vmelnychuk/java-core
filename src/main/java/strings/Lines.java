package strings;

/**
 * Created by vmmelnychuk on 6/22/15.
 */
public class Lines {
    public static void main(String[] args) {
        String s = new String();
        String s2 = s;
        s = s.concat(" and more");
        System.out.println("s: " + s);
        System.out.println("s2: " + s2);
    }
}
