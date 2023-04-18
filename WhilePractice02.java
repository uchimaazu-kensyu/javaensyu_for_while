import java.util.Scanner;
public class WhilePractice02 {
    public static void main(String[] args) {
        var i =0;
        var sum =0;
        while(i < 1){
            var sc = new Scanner(System.in);
            var input = sc.nextInt();
            if (input != 0){
                sum += input;
            }else if(input == 0){
                i++;
                break;
            }

        }
        System.out.println(sum);




    }
}
