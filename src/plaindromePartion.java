import java.util.ArrayList;
import java.util.List;

public class plaindromePartion {
    static List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        funP(0,s,res,new ArrayList<>());
        return res;
    }
    static void funP(int index,String s,List<List<String>> res,List<String> ds){
        if(index==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPlaindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                funP(i+1,s,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    static boolean isPlaindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> ans=partition("aab");
        System.out.println(ans);
    }
}
