package Recursion;

public class RemoveString {
    public static void main(String[] args) {
        String ans=Skip("chandan","chandanappleisverysweet");
        System.out.println(ans);

    }
    static String Skip(String Target,String from){
        if(from.isEmpty()){
            return " ";
        }

        if(from.startsWith(Target)){
            return Skip(Target,from.substring(Target.length()));
        }
        else{
            return from.charAt(0)+Skip(Target,from.substring(1));
        }
    }
}
