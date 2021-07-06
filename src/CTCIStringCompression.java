import java.util.Scanner;

public class CTCIStringCompression {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stringToCompress = scanner.next();
        System.out.println(compressString(stringToCompress));
    }
    public static String compressString(String string){
        String finalString = "";
        int groupSize = 0;
        char[] charArray = string.toCharArray();
        char prevChar = charArray[0];
        for(int x=0;x<string.length();x++){
            groupSize++;
            if(charArray[x] != prevChar){
                finalString = finalString + prevChar + (groupSize - 1);
                groupSize = 1;
                prevChar = charArray[x];
            }
            if(x == string.length() - 1){
                finalString = finalString + prevChar + (groupSize);
                groupSize = 1;
                prevChar = charArray[x];
            }
        }
        if(finalString.length() < string.length()){
            return  finalString;
        }
        return string;
    }
}
