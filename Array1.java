public class Array1 {
    public static void update(int n[]) {
        for (int i = 0; i < n.length; i++) {
            n[i]=n[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
