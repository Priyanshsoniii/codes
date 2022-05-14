package Programme1.java;

public class SPECIAL_PATTERN {
    int fnd(int val){
        if(val==0){
            return 1;
        }
        System.out.print("  ");
        return fnd(val-1);
    }
    int fns(int val){
        if(val==0){
            return 1;
        }
        System.out.print(" *");
        return fns(val-1);
    }
    public static void main(String...hny){
        int n=10;
        SPECIAL_PATTERN s = new SPECIAL_PATTERN();
        int temp=n;
        for(int i=1;i<=n;i++){
           
            s.fnd(temp-1);
            s.fns((2*i)-1);
            s.fnd(temp-1);
            temp--;
            System.out.print("\n");
        }
    }
}
