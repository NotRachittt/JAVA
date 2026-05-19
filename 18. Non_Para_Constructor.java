class Pen {
    String name;
    int qnt;
    
    //Method
    void data() {
        System.out.println(name);
        System.out.println(qnt);
    }

    // Non-Parameterized Constructor
    Pen() {
        name = "Default Pen";
        qnt = 0;
    }

}

public class Non_Para_Constructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();   // no input
        p1.data();
    }
}