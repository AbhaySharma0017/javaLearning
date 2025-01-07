class Try6{
    public static void main(String args[]){
        String str = "Naman";
        String copy = str.toLowerCase();
        String temp = "";
        for(int i=copy.length()-1; i>=0; i--){
            temp = temp+copy.charAt(i);
        }
        if(copy.equals(temp)){
            System.out.print("Pal");
        }
        else{
            System.out.print("not");
        }
    }
}