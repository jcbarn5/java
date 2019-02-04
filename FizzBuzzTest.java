public class FizzBuzzTest {
    public static void main (String[] args){
        FizzBuzz ans = new FizzBuzz();
        for (int i = 0; i < 101; i++) {
            System.out.println(ans.fizzBuzz(i));
        }
    }
}