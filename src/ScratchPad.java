public class ScratchPad{
    public static void main(String[] args){
//        System.out.println(area(5));
//        System.out.println(area(4,3));
        printYearsAndDays(600000);
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
}