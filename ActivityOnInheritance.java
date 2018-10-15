public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty() { //implicit super --> goes to Employee()
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
}


class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor"); //No implicit super, go to overloaded Employee()
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    public Employee(String s) { //Implicit super --> go to Person()
        System.out.println(s);
    }
}

class Person {
    public Person() {
        System.out.println("(1) Person's no-arg constructor is invoked");
    }
}

//Prints out 1, 2, 3, 4. Implicit super when (1) no this() and (2) no overloaded constructor

/* Learning points:
- Subclass always end up inheriting constructor of superclass
- Unless you 'overwrite' it, meaning you construct a constructor of the exact same name and arguments.
*/


