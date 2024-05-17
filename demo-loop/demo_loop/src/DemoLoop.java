public class DemoLoop { // 17May24
    public static void main(String[] args) {
        // Foor Loop
        // initialization; continue critiera; increment
        // step 1: int i = 0
        // Step 2: check i < 4?
        // Step 3: print hello
        // Step 4 i++ i=1
        // Step 5 check i < 4? yes
        // Print hello
        //
        // Step 4 i++ i=2
        // Step 5 check i < 4? yes
        // Print hello // Step 4 i++ i=3
        // Step 5 check i < 4? yes
        // Print hello // Step 4 i++ i=4
        // Step 5 check i < 4? no
        // end
        // loop start from zero forever <<<<
        int x = 3;
        for (int i = 0; i < 4; i++) { // 0,1,2,3,
            System.out.println("hello");

        }

        int y = 3;
        for (int i = 0; i < 3; i++) { // 要幾多次就細過幾多
            y *= 3;
        }
        System.out.println(y);
        // y = 83

        // 2
        // 4
        // 6
        int z = 0;
        for (int i = 0; i < 3; i++) { // 要幾多次就細過幾多
            z += 2;
            System.out.println(z);
        }

        int q = 0;
        for (int i = 0; i < 7; i++) { // 要幾多次就細過幾多
            if (i != 0 & i % 2 == 0) {
                System.out.println(i);
            }

        }

        // 1 + 2 + 3 + 4 + 5 ...10 ( 頭加尾 X剩 項數除2 )
        int sum = 0;
        for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9
            sum = sum + i + 1;
        }
        System.out.println("sum = " + sum); // > 55

        int sum1 = 0;
        for (int k = 0; k < 11; k++) {
            sum1 += k;
        }
        System.out.println("sum1 = " + sum1);

        // 2 +4+6+8
        int sumV = 0;
        for (int k = 0; k < 9; k++) {
            if (k % 2 == 0) {
                sumV += k;
            }
        }
        System.out.println("sumV = " + sumV);


        // 2+4+6+8
        int sum2 = 0;
        for (int k = 0; k < 9; k++) {

            if (k % 2 == 0) {
                sum2 += k;
            }
            // System.out.println(".." + sum2);
        }
        System.out.println("sum2 = " + sum2);



        // 8
        // 6
        // 4
        // 2
        for (int i = 8; i > 0; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        //break
        for(int i = 0; i < 10; i++){

            if (i > 7) {
                break;  //break should put at the top of the block
            }
            System.out.println(i);
        }

        //continue
        int total = 0;
        for(int i = 0; i < 5; i++){
            if (i > 3) {
                continue;       // when i = 4 , skip "total+=1;", go to i++
            }
            total+=i;

        }
        System.out.println( "total =" + total );

    }
}
