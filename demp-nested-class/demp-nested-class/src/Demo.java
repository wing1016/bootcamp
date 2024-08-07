public class Demo {

    public static void main(String[] args) {
        // Bank bank = new Bank();

        // Nested static class
        Bank.Account account = new Bank.Account();// newing a account, not newing a bank
        System.out.println(account.getAccNo());

        // Inner class (non-static)

        Box box = new Box();
        Box.Ball ball = box.new Ball();
        System.out.println(ball.getCapacity());
        box.add(ball);
        System.out.println(box.getBalls().size());

        //Anonoymous Inner CLass
        Swimable John = new Swimable() {
            @Override
            public void swim(){   // #sir 
                System.out.println("John is swimming");
            }
        };

        j
        John.swim();    //sir #sir code Sally part

    }
}
