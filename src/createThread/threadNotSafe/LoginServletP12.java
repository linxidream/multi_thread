package createThread.threadNotSafe;

public class LoginServletP12 {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPoat(String username,String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username : "+usernameRef +"  password : "+passwordRef);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
