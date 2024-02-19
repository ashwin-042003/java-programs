import java.util.*;
public class chalk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chalk,sum=0;
        chalk=sc.nextInt();
        int sq=(int)Math.sqrt(chalk);
        sum=chalk;
        while(chalk%sq==0){
            sum+=chalk/sq;
            chalk=chalk/sq;
        }
        System.out.println(sum);
        

    }
}