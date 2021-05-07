public class NumberInWord {
    public static void printNumberInWord(int day){
        switch (day){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }
        if(year%400 == 0 ){
            return true;
        }
        if(year%100 == 0){
            return false;
        }
        if(year%4 == 0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month,int year){
        if(month<1 || month>12){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }
        boolean result = isLeapYear(year);
        if(result){
            if(month == 2){
                return 29;
            }else if(month<8){
                if(month%2 == 0){
                    return 30;
                }else{
                    return 31;
                }
            }else{
                if(month%2 == 0){
                    return 31;
                }else{
                    return 30;
                }
            }
        }else{
            if(month == 2){
                return 28;
            }else if(month<8){
                if(month%2 == 0){
                    return 30;
                }else{
                    return 31;
                }
            }else{
                if(month%2 == 0){
                    return 31;
                }else{
                    return 30;
                }
            }
        }
    }
}
