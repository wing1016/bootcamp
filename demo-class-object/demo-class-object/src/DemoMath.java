public class DemoMath {
    public static void main(String[] args) throws Exception {

        // abs()
        int x = -3;
        int y = 8;
        int result = Math.abs(x * y);
        System.out.println(result);

        double d = 3.3d;
        double result1 = Math.abs(d * x);
        System.out.println(result1);

        long l = 9L;
        long result2 = Math.abs(l * x);
        System.out.println(result2);

        float f = 1F;
        float result3 = Math.abs(f * x);
        System.out.println(result3);

        // Math max
        System.out.println(Math.max(9, 10));

        // Math min
        System.out.println(Math.min(-9, 10));

        int[] arr = new int[] {4, -3, 10, 2};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("max :" + max);

        // round()
        double d1 = 3.65d;
        System.out.println("d1 is " + d1);
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.45));
        System.out.println(Math.round(3.44));

        //Math  pow()
        double r4 = Math.pow(2, 3);
        System.out.println("r4 is " + r4);
        System.out.println(Math.pow(2.2, 3)); //10.648000000000003

        double r5 = Math.sqrt(25);
        System.out.println("r5 is " + r5);
        System.out.println(Math.sqrt(-26)); //NaN

        //random()
        System.out.println("random :" + Math.random());
        System.out.println("random 100 :" + Math.round(Math.random()*100));

    }
}
