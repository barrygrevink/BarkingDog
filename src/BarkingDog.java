public class BarkingDog {


    public static boolean shouldWakeup(boolean barking, int hourOfDay) {
        boolean WakeUp;
        if (hourOfDay < 0 || hourOfDay > 23) {
            WakeUp = false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking == true) {
            WakeUp = true;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking == false) {
            WakeUp = false;
        } else {
            WakeUp = false;
        }
        System.out.println(WakeUp);
        return WakeUp;
    }

    public static void main(String[] args) {
        shouldWakeup(true, 1);
        shouldWakeup(false, 2);
        shouldWakeup(true, 4);
        shouldWakeup(true, -1);
    }

}

