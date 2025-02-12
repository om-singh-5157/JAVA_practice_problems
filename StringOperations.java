public class StringOperations {
    public static void main(String[] args) {
        // String str="noon";
        // printString(str);
        // String path="WNEENESENNN";
        // System.out.println(isPalindrome(str));
        // System.out.println(shortestPath(path));
        // largestString();
        // stringBuilder();
        // String str="hello My name is Om singh.";
        // System.out.println(toUppercseOfFirstWord(str));
        // System.out.println(compress("aaabbcddd"));
        noOfLowercase();
    }
    public static void noOfLowercase(){
        String str="OmSinghaaSdF";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static String toUppercseOfFirstWord(String str){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void stringBuilder(){
        StringBuilder str=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            str.append(ch);
        }
        System.out.println(str+" "+str.length());
    }
    public static void largestString(){
        String str[]={"zpple","mango","banana"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);

    }
    public static float shortestPath(String path){
        int x=0 ,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}
