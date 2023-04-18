public class ForPractice03 {
    public static void main(String[] args) {
        int num = 3;
        for (var i = 0; i < 4; i++) {
            for (var j = num; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
            num--;
        }
    }
}
