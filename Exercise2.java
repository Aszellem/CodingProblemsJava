public class Exercise2 {
    public static void main(String[] args) {
        String szó = "Szó";
        String str2 = "zebra";
        String str1 = "inside code";
        String str = "apple";

        System.out.println(firstRepeatingCharacter(szó));
        System.out.println(firstRepeatingCharacter(str2));
        System.out.println(firstRepeatingCharacter(str1));
        System.out.println(firstRepeatingCharacter(str));
        
    }

    public static char firstRepeatingCharacter(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch[0];
    }

}
