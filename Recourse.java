package ag.kirill;

public class Recourse {

    public static void main(String[] args) {
        System.out.println(recourse(13));//results 1+3=4 end.
        System.out.println(recourse(129));//results 1+2=3 => 3+9=12=> 1+2=3 end.
    }
    public static int recourse(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
