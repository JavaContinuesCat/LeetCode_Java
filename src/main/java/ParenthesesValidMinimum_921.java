/**
 * @author Du
 * @date 2022年10月13日
 */
public class ParenthesesValidMinimum_921 {
    public static void main(String[] args) {
        int i = minAddToMakeValid("(()())((");
        System.out.println(i);
    }


    public static int minAddToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int left=0;int right=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                left++;
            }else{
                if(left==0){
                    right++;
                }else{
                    left--;
                }
            }
        }

        return Math.abs(left+right);


    }
}
