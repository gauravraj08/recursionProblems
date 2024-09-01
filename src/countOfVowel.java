public class countOfVowel {
    static void countVowel(String st){
        int count=0;
        char[] ch = st.toCharArray();
        char[] vowel = {'a','e','i','o','u'};
        for (char c:ch){
            for(char v:vowel){
                if(c==v) count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String st="How are u";
        countVowel(st);
    }
}
