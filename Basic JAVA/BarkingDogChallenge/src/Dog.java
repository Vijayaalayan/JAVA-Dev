public class Dog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(!barking){
            return false;
        }
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if(hourOfDay<8 || hourOfDay>22){
            return true;
        }
        return false;
    }
}
