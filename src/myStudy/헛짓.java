package myStudy;

public class 헛짓 {
    int a;
    int b;

    public 헛짓(){}
    public 헛짓(int a, int b){
        this.a = a;
        this.b =b;

    }
    public 헛짓 what(int a1, int b1){
        int a = a1*120;
        int b = b1*120;
        return new 헛짓(a,b);
    }
    public static void main(String[] args){
        헛짓 ea = new 헛짓();

        헛짓 test = new 헛짓(1,5);
        헛짓 babo = test.what(1,2);

    }
}
