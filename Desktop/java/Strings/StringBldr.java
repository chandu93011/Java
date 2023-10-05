package Strings;

public class StringBldr {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.insert(7,'5');
        builder.insert(6,"chandan");
        builder.deleteCharAt(23);
        System.out.println(builder);
        builder.delete(7,12);
        System.out.println(builder);

    }

}
