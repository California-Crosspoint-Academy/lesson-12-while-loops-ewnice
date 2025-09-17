//Eunice Chan
//2025-09-17

public class Notes {
    public static void main(String[] args) {

        int a = 0;
        int b = 3;
        while (b<=79) {
            a=a+b;
            b++;
        }
        System.out.println(a);

        int c = 0;
        int d = 3;
        do {
            c=c+d;
            d++;
        } while(d<=79);
        System.out.println(c);

        //continue- remaining code in loop skipped for the iteration, looping continues with control expression

        int e = 0;
        while (e<=5) {
            e++;
            if (e==4) {
                continue;
            }
            System.out.println(e);
        }
    }
}