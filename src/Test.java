import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Test
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/31  15:47
 * @Veresion 1.0
 */
public class Test {
    public static LinkedList<String> generateParenthesis(int n){
        LinkedList<String> ans=new LinkedList<String>();
        backtrack(ans,"",0,0,n);
        return ans;
    }

    private static void backtrack(LinkedList<String> ans, String cur,int open, int close, int max) {
        if(cur.length()==max*2){
            ans.add(cur);
            return;
        }
        else{
            if(open<max){
                backtrack(ans,cur+"(",open+1,close,max);
            }
            if(open>close){
                backtrack(ans,cur+")",open,close+1,max);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入括号的对数：");
        int n=sc.nextInt();
        LinkedList list=generateParenthesis(n);
        System.out.println(list);
    }
}
