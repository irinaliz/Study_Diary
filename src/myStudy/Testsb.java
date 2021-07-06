package myStudy;

public class Testsb {
    int a;
    int b;

    public Testsb(){}
    public Testsb(int a, int b){
        this.a = a;
        this.b =b;

    }
    public Testsb what(int a1, int b1){
        int a = a1*120;
        int b = b1*120;
        return new Testsb(a,b);
    }
    public static void main(String[] args){
        Testsb ea = new Testsb();

        Testsb test = new Testsb(1,5);
        Testsb babo = test.what(1,2);

    }
}
