import java.util.Scanner;
public class Task8 {
    private boolean isDigits(char ch){
        int n = (int) ch;
        return 48 <= n && n <= 57;
    }
    private boolean allDigits(String s, int i){
        if (i >= s.length()){
            return true;
        }
        char ch = s.charAt(i);
        if(!isDigits(ch)){
            return false;
        }
        return allDigits(s,i+1);
    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(allDigits(s,0));
    }

}
