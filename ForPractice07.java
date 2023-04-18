public class ForPractice07 {
    public static void main(String[] args) {


        for (var i = 0; i < 4; i++) {


            for (var x = 0; x < 5; x++) {

                for (var j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (var k = 0; 4 - i > k; k++) {
                    System.out.print(" ");
                }

                for (var k = 0; 4 - i > k; k++) {
                    System.out.print(" ");
                }
                for (var j = 0; j <= i; j++) {
                    System.out.print("*");
                }

            }

            System.out.println("");
        }


        for (int i =5; i > 0; i--) {

            for (var x = 0; x < 5; x++){


                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for(var k=0; 5-i > k; k++) {
                    System.out.print(" ");
                }

                for(var k=0; 5-i > k; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            }



            System.out.println("");
        }



    }

}
