public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "bvc engineering college";
        printOddPositionCharacters(text);
    }
    
    public static void printOddPositionCharacters(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
