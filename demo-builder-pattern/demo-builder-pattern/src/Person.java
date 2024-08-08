public class Person {
    private String name;
    private int age;

    public Person() {}

    public static Builder builder() {
        return new Person.Builder();
    }

    private Person(String n, int a) {
        this.name = n;
        this.age = a;
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
        //  return new Person(this.name, this.age);    
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
    }
}
