import java.util.Scanner;
class Palindrome1{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    String copy = str;
    String temp = "";
    System.out.println(str.length());
     for(int i=str.length()-1; i>=0; i--) {
         char ch = str.charAt(i);
      // temp = temp+str.charAt(i);
         temp = temp+ch;
     }
     System.out.println(temp);
     if(temp.equals(copy)){
        System.out.println("Palindrome");
     }
     else{
        System.out.println("Not palindrome");
     }
 }
}