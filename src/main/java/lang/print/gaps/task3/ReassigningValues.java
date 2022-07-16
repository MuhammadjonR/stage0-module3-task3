package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, second = 10, third = 100;
        int f = 15,s = 6,t = 4;
        int temp1=first,temp2=second,temp3=third;
        first=f;
        f=temp1;
        second=s;
        s=temp2;
        third=t;
        t=temp3;
        System.out.println(f + "\n" +s+ "\n"+t);
        System.out.println(first + "\n" +second+ "\n"+third);
    }
}
