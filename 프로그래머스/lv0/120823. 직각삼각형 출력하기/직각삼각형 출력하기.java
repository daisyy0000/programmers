import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for(int i=1; i <= n; i++){
            for(int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        } 
        
        //다른사람 풀이 (repeat()이용해서)
        //System.out.println("*".repeat(i));
    }
}