package Others.OCA.exercises1.Q094;

public class Person {

    String name;
    int age = 25;

    Person(String name) {    // line n1
        setName(name);
    }

    public Person(String name, int age) {
        new Person(name);        //line n2     we can change it with setName(name);
        setAge(age);
    }


    // setter and getter methods go here


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }

}

/*
 * What is the result?
A. Compilation fails at both line n1 and line n2.
B. Compilation fails only at line n2.
C. Compilation fails only at line n1.
D. Jesse 25Walter 52

// Answer B => compilation fails at line n2
/*
Error on console:
Error:(12, 9) java: cannot find symbol
  symbol:   method Person(java.lang.String)
  location: class Q84.Person
 */
