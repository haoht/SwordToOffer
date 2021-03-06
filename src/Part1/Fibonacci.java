package Part1;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/19.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 n<=39
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n==0 ||n==1){
            return n;
        }
        int []arr=new int[n];

        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

        return arr[n-1];
    }

    @Test
    public void test(){
       System.out.println(Fibonacci(2));
    }
}
