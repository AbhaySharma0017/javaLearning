public class SmartPhone2 implements Camera2, MusicPlayer2, Phone2{
   public void takePhoto(){
        System.out.println("Photo clicked");
    }
   public void recordVideo(){
        System.out.println("record Video");
    }

   public void playMusic(){
        System.out.println("Play music");
    }
   public void stopMusic(){
        System.out.println("Stop music");
    }

   public void makeCall(){
        System.out.println("Calling...");
    }
   public void endCall(){
        System.out.println("Cutting...");
    }
}

 