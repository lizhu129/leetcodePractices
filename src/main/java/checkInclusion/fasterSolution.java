package checkInclusion;

public class fasterSolution {
    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] s1_hashSet = new int[26];
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            s1_hashSet[c - 'a']++;
        }

        for(int i = 0; i < s1.length(); i++){
            char c = s2.charAt(i);
            s1_hashSet[c - 'a']--;
        }

        if(isEmpty(s1_hashSet)) return true;

        //keep shifting window right
        int L = 0;
        int R = s1.length();

        while(R < s2.length()){

            s1_hashSet[s2.charAt(L) - 'a']++; //remove left, increment left
            L++;
            s1_hashSet[s2.charAt(R) - 'a']--; //add right, increment right
            R++;

            if(isEmpty(s1_hashSet)) return true;
        }

        return isEmpty(s1_hashSet);
    }

    private static boolean isEmpty(int[] hashset){
        for(int i : hashset){
            if(i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));

    }
}
