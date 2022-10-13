/**
 * @author Du
 * @date 2022年10月13日
 */
public class ReformatPhoneNumber_1694 {

    public static void main(String[] args) {
        String s = reformatNumber("1-23-45 6");
        System.out.println(s);
    }



    public static String reformatNumber(String number) {
        StringBuilder ss = new StringBuilder();
        StringBuilder sb = new StringBuilder(number);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='-'&&sb.charAt(i)!=' '){
                ss.append(sb.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();
        int i=ss.length();
        if(ss.length()%3==0){
            for(int j=0;j<i;j=j+3){
                str.append(ss.charAt(j));str.append(ss.charAt(j+1));str.append(ss.charAt(j+2));
                if(j!=i-3){
                    str.append('-');
                }
            }

        }else if(ss.length()%3==1){
            for(int j=0;j<i-4;j=j+3){
                str.append(ss.charAt(j));str.append(ss.charAt(j+1));str.append(ss.charAt(j+2));
                str.append('-');
            }
            str.append(ss.charAt(i-4));str.append(ss.charAt(i-3));str.append('-');
            str.append(ss.charAt(i-2));str.append(ss.charAt(i-1));

        }else
        {
            for(int j=0;j<i-2;j=j+3){
                str.append(ss.charAt(j));str.append(ss.charAt(j+1));str.append(ss.charAt(j+2));
                str.append('-');
            }
            str.append(ss.charAt(i-2));str.append(ss.charAt(i-1));
        }
        return str.toString();

    }

}
