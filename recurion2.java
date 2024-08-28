public class recurion2 {
    //factorial
    public static int fact(int n) {
        if(n<0)
        return -1;
        if(n==0)
        return 1;
        // int fm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    //Sum of n natural numbers
    public static int sumn(int n) {
        if (n==1) {
            return 1;
        }
        int sum=n+sumn(n-1);
        return sum;
    }
    //fibonacci nummber
    public static int fib(int n) {
        if (n==0||n==1) {
            return n;
        }
        /*int f1=fib(n-1);
         int f2=fib(n-2);
         return f1+f2;
        */
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        // System.out.println(fact(n));
        System.out.println(fib(n));
    }    
}
