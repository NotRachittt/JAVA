class Pen01 {
    String name;
    int qnt;

    //Method
    void data() {
        System.out.println(name + " " + qnt);
    }
    
    // Parameterized Constructor
    Pen01(String NAME, int QNT) {
        this.name = NAME;
        this.qnt = QNT;
    }
}

public class Para_Constructor {
    public static void main(String[] args) {
        Pen01 p2 = new Pen01("Trimax", 50);			  // input given
        p2.data();
    }
}