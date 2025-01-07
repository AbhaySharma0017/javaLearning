class Try4{
    public static void main(String args[]){
        String str = "Abhay sharma";
        String rev = " ";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.print("Reverse: "+rev);
    }
}