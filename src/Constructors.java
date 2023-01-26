class Program {

    int value;

    public Program() {
        this(5);
        System.out.println("First Consructor");
    }

    public Program(int value) {

        this.value = value;
        System.out.println("Second Consructor");
    }
}

public class Constructors {

    public static void main(String[] args) {

        Program myProgram = new Program();
        Program myProgram1 = new Program(2);
    }
}
