public class TestLogger {

    public static void main (String args []){
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 =Logger.getInstance();
        logger2.log("Second log message");

        if(logger1==logger2){
            System.err.println("It follows Singleton Implemenetation");

        }
        else{
            System.err.println("It does not follow Singleton Implementation");
        }
    }
    
}
