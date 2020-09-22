package HomeWork1;


public class Task3 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if(vacation || !weekday) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(true, true));
    }
}
