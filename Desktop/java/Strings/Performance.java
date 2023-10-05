package Strings;

public class Performance {
    public static void main(String[] args) {
        for(int i=0;i<26;i++){
            char ch= (char) ('A'+i);
            char ch1=(char) ('a'+i);
            System.out.print((char)(ch+32));
            System.out.println((char)(ch1-32));
        }
    }
}
