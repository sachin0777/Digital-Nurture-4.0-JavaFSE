public class Logger{
    private static Logger singleInstance;

    private Logger(){
        System.out.println("Instance Initialized");
    }

    public static Logger getInstance(){
            if(singleInstance == null){
                singleInstance = new Logger();
            }
            return singleInstance;

    }

    public void log(String message){
        System.err.println("LOG: " + message);
    }
}