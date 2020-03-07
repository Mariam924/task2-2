
package valid.palindrome;

import java.util.Scanner;
public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        
        int l=0;
        String str;
        System.out.println("Enter a statment");
        str=reader.nextLine();
        int h=str.length()-1;
        boolean flag=true;
        
        str=str.toLowerCase();
        
        while(l<=h && flag)
        {
            char chl=str.charAt(l);
            char chh=str.charAt(h);
            
            if              (!(chl>='a' && chl<='z'))  l++;
            if              (!(chh>='a' && chh<='z'))  h--;  
            { if              (chl==chh)   
            {
            l++;
            h--;
            flag=true;
            }
            
            else             flag=false;
            
            }
        }
         if     (flag=true)       {  System.out.print("The statement is palindrome");}
                    
           
            
         else if (flag=false)      { System.out.print("The statement is not palindrome");}
            



}
}
