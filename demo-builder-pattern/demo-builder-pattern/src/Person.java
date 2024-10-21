public class Person {
    private String name;
    private int age;

    // Builder pattern should not contain any public constructor
    public Person() {}

    // Builder pattern should not contain any public constructor
    private Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static Builder builder() {
        return new Person.Builder();
    }

    private Person(Builder bd) {
        this.name = bd.name;
        this.age = bd.age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String toString(){
        return " Name : " + this.name + " Age : " + this.age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder age(int a) {
            this.age = a;
            return this; // return this < make you can dot dot dot dot method
        }

        public Builder name(String n) {
            this.name = n;
            return this;
        }

        public Person build() {
            // return new Person(this.name, this.age);
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        // Tradintional new by constructor
        Person p = new Person();
        p.setAge(18);
        p.setName("John");

        // Builder pattern
        Person p2 = Person.builder().age(18).name("John").build();
        System.out.println(p2.getName() + " ! " + p2.getAge());

        Person p3 = new Person("Peter",4);
        System.out.println(p3);
    }
}
