import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationNum
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/31  16:44
 * @Veresion 1.0
 */
public class CombinationNum {
   static  List<List<Integer>> lists=new ArrayList<>();
    public static List<List<Integer>> combinationNum(int[] candidates,int target){
        List<Integer> list=new ArrayList<>();
        DFS(candidates,0,list,0,target);
        return lists;
    }

    private static void DFS(int[] candidates, int index, List<Integer> list, int sum, int target) {
        if(index>=candidates.length||sum>target){
            return;
        }
        else if(sum==target){
            List e=new ArrayList();
            e.addAll(list);
            lists.add(e);
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target){
                continue;
            }
            list.add(candidates[i]);
            DFS(candidates,i,list,sum+candidates[i],target);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] n={2,3,7,8};
        List<List<Integer>> list=combinationNum(n,7);
        System.out.println(list);
    }
   
}
