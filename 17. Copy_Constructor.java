class Pen02 {
    String name;
    int qnt;
    
    //Method
    void data() {
        System.out.println(name + " " + qnt);
    }

    // Normal constructor
    Pen02(String name, int qnt) {
        this.name = name;
        this.qnt = qnt;
    }

    // Copy Constructor
    Pen02(Pen02 p) {
        this.name = p.name;
        this.qnt = p.qnt;
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        Pen02 p1 = new Pen02("Ball Pen", 15);
        Pen02 p2 = new Pen02(p1);   // copy
        p2.data();
    }
}