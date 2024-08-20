public class DemoDividedByZero {
    public static void main(String[] args) throws Exception {

        double amount = 0.0;
        System.out.println("Hello, World!");
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 3));
        System.out.println(divide_1(10, amount));
        // System.out.println(divide(10, 0)); // java.lang.ArithmeticException (int) / Infinity (double)

        // Approach 1
        if (amount != 0) {
            System.out.println(divide(10, 0));
        } else {
            System.out.println(0);
        }

        // Approach 2 : Handle exception
        // Unchecked exception ( Runtime Exception ) - Implicitly

        try {
            String s = null;
            System.out.println(s.charAt(2)); // NullPointerException
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(" error comes : divided by zero : " + amount);

        } catch (NullPointerException e) {

            System.out.println(" NPE Null pointer exception ");
        }
        System.out.println("End of code");

        double expense = excpensePerEmployee();
        System.out.println(expense);


        // Approach 2
        try {
            double money = excpensePerEmployee2();
            System.out.println(money);
        } catch (ArithmeticException e) {
            System.out.println(" Something to fix ... ");
        }
    }

    public static double divide_1(double x, double y) {
        return x / y;
    }

    // return it
    // throw exception Implicitly
    public static int divide(int x, int y) {
        return x / y;
    }

    // Approach 1
    public static int excpensePerEmployee() {
        // use try catch at where the exception throw !!!
        try {
            return getDepartmentExpense() / getEmployeeCount(); // ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            return getDepartmentExpense(); // fix
        }
    }

    // Approach 2
    // when a method throw unchecked exception without handling, excpetion throw to method caller

    public static int excpensePerEmployee2() {
        return getDepartmentExpense() / getEmployeeCount();
    }

    // Approach 3

    public static int excpensePerEmployee3() {
        try {
            return getDepartmentExpense() / getEmployeeCount();
        } catch (ArithmeticException e) {
            throw new EmployeeCountZeroException();
        }
    }

    public static int getEmployeeCount() {
        return 0;
    }

    public static int getDepartmentExpense() {
        return 140000;
    }
}
