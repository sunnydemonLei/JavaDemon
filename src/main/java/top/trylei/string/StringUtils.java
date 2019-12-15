package top.trylei.string;

public class StringUtils {
    public static String trimAll(String str){
        //System.out.println(str.toString());
        StringBuilder sb = new StringBuilder();
        char temp[] = str.toCharArray();
        for(int index=0; index<str.length() ; index++){
            //char c = str.charAt(index);
            if(temp[index] == ' '){
                continue;
            }
            sb.append(temp[index]);
        }
        //System.out.println(sb.toString());
        return sb.toString();

    }



    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int index = str.length()-1; index> -1 ; index--){
            if(chars[index] == ' '){
                continue;
            }
            sb.append(chars[index]);
        }
        return sb.toString();

    }
}
