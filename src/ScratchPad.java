public class ScratchPad{
    public static void main(String[] args){
//        System.out.println(area(5));
//        System.out.println(area(4,3));
//        printYearsAndDays(600000);
//        printDayOfTheWeek(4);
//        printNumberInWord(5);
//        System.out.println(isLeapYear(2000));
//        System.out.println(isOdd(3));
//        System.out.println(sumOdd(1, 21));
//        System.out.println(sumDigits(125));
        System.out.println(isPalindrome(-1221));
    }
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return 3.14159*(radius*radius);

    }
    public static double area(double x, double y){
        if((x < 0) || (y<0)){
            return -1.0;
        }
        return x * y;
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
//        double years = minutes/525600;
            long days = minutes / 1440;
            long years = days / 365;
            days = days % 365;

            System.out.println(minutes + "minutes =" + years + "year(s) and " + days + "day(s)");

        }
    }
    public static void printEqual(int valOne, int valTwo, int valThree){
        if(valOne<0||valTwo<0||valThree<0){
            System.out.println("Invalid Value");
        }else if(valOne==valTwo&&valTwo==valThree){
            System.out.println("All numbers are equal");
        }else if(valOne!=valTwo&&valTwo!=valThree&&valOne!=valThree){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature>=25&&temperature<=45){
                return true;
            }else{
                return false;
            }
        }else{
            if(temperature>=25&&temperature<=35){
                return true;
            }else{
                return false;
            }
        }
    }
    public static double area(double x, double y){
        if((x < 0) || (y<0)){
            return -1.0;
        }
        return x * y;
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
        if(day==0){
            System.out.println("Sunday");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Day");
        }
    }
    public static void printNumberInWord(int number){
        String [] nums={"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        if(number<0||number>9){
            System.out.println("OTHER");
        }else{
            System.out.println(nums[number]);
        }
    }
    public static boolean isLeapYear(int year){
        if(year<1||year>9999){
            return false;
        }else{
            if(year%4==0){
                return true;
            }else {
                return false;
            }
        }
    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2!=0){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start>end||start<0){
            return -1;
        }
        for (int i=start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumDigits(int number){
        int sum=0;
        if(number<10){
            return -1;
        }else{
            while(number>0){
                sum+=number%10;
                number/=10;
            }
            return sum;
        }

    }
    public static boolean isPalindrome(int number){
        int temp=Math.abs(number);
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum=(sum*10)+r;
            temp/=10;
        }
        if(sum==Math.abs(number)){return true;}
        else{return false;}
    }
    
}