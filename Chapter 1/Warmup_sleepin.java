public class Warmup_sleepIn {
    public static boolean Warmup_sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        System.out.println(Warmup_sleepIn(false, false)); 
        System.out.println(Warmup_sleepIn(true, false)); 
        System.out.println(Warmup_sleepIn(false, true)); 
    }
}
