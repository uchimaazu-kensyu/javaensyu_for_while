public class ForPractice09 {
    public static void main(String[] args) {

        for (var i = 1800; i < 2000; i++) {

            if (i % 4 != 0) { // 4で割り切れない場合はうるう年ではない
            } else if (i % 100 != 0) { // 4で割り切れるが、100で割り切れない場合はうるう年
                System.out.println(i+"年は閏年です");
            } else if (i % 400 == 0) {  // 4で割り切れ、100でも割り切れるが、400で割り切れる場合はうるう年
                System.out.println(i+"年は閏年です");
            } else { // 4で割り切れ、100でも割り切れるが、400で割り切れない場合はうるう年ではない
                //;
            }
        }
    }
}
