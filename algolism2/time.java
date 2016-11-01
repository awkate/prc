package algolism2;

import java.util.Scanner;

/**
 * Created by kei.watanabe on 2016/10/28.
 */
public class time {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int h,h1,h2,m,m1,m2,s,s1,s2,n;
        int diff,time1,time2;

        System.out.println("一つ目の時間を入力してください");
        System.out.print("時間:");
        h1 =  scan.nextInt();
        System.out.print("分:");
        m1 =  scan.nextInt();
        System.out.print("秒:");
        s1 =  scan.nextInt();

        System.out.println(h1+":"+m1+":"+s1);

        System.out.println("2つ目の時間を入力してください");
        System.out.print("時間:");
        h2 =  scan.nextInt();
        System.out.print("分:");
        m2 =  scan.nextInt();
        System.out.print("秒:");
        s2 =  scan.nextInt();

        time1 = h1 * 3600 + m1 * 60 * s1;
        time2 = h2 * 3600 + m2 * 60 * s2;

        if(time1 > time2)
            diff = time1 - time2;
        else{
            diff = time2 - time1;
        }

        h = diff / 3600;
        n = diff % 3600;
        m = n / 60;
        System.out.println("デバックn="+n);
        s = n % 60;
        System.out.println(h+":"+m+":"+s);


    }

}
