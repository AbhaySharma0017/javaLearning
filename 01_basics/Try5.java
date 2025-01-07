// class Try5{
//     public static void main(String args[]){
//         String str = "abhay is a good boy";
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch != 32){
//                 System.out.print(ch);
//             }
//             else{
//                 System.out.println();
//             }
//         }
//     }
// }

class Try5{
    public static void main(String args[])
    {
        String str = "Abhay is good boy ";
        String[] words = str.split(" ");
        for(int i=0; i<str.length()-1; i++){
            System.out.println(words[i]);
        }
    }
}