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
//        System.out.println(isPalindrome(-1221));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(getEvenDigitSum(0));
//        System.out.println(hasSharedDigit(12,13));
//        System.out.println(hasSameLastDigit(12,232,42));
//        System.out.println(getGreatestCommonDivisor(12,24));
//        printFactors(45);
//        System.out.println(isPerfectNumber(9));
//        numberToWords(100);
//        System.out.println(getLargestPrime(7));
        printSquareStar(8);
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
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int first=-1;
        int last=0;
        do{
           if(first==-1) first=number%10;
           last=number%10;
           number/=10;
        }while(number>0);
        int sum=first+last;
        return sum;
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        };
        int num=0;
        int sum=0;
        do{
            num=number%10;
            if(num%2==0) sum+=num;
            number/=10;
        }while(number>0);
        return sum;
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1<10||num1>99)||(num2<10||num2>99)){
            return false;
        }
        int temp=num2;
        while(num1>0){
            int r=num1%10;
            while(num2>0){
                if (r == num2 % 10) {
                    return true;
                }
                num2/=10;
            }
            num2=temp;
            num1/=10;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }
        if ((num1 % 10 == num2 % 10) || num1 % 10 == num3 % 10) {
            return true;
        } else if (num2 % 10 == num3 % 10) {
            return true;
        } else {
            return false;
        }
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if((first<10)||(second<10)){
            return -1;
        }
        int range;
        int divisor=0;
        if(first>second){range = first;}
        else{range = second;}
        for(int i = 1;i<=range/2;i++){
            if((first%i==0)&&(second%i==0)){
                divisor = i;
            }
        }
        return divisor;
    }
    public static void printFactors(int number){
        if(number<1)System.out.println("Invalid Value");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int number){
        if(number<1)return false;
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){return true;}
        else{return false;}
    }
    public static void numberToWords(int number){
        if(number<0)System.out.println("Invalid Value");
        String[] nums={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int reversed=reverse(number);
        int cnt=getDigitCount(number);
//        while (number>0){
//            reversed=(reversed*10)+(number%10);
//            number/=10;
//            cnt++;
//        }
        for(int i=0;i<cnt;i++){
            if(reversed>0) {
                System.out.println(nums[(reversed % 10)]);
                reversed /= 10;
            }else{System.out.println(nums[0]);}
        }
    }
    public static int reverse(int number){

        int temp=Math.abs(number);
        int reversed=0;
        while (temp>0){
            reversed=(reversed*10)+(temp%10);
            temp/=10;
        }
        if(number<0)reversed*=-1;
        return reversed;
    }
    public static int getDigitCount(int number){
        if(number<0)return -1;
        int cnt=0;
        do{
            number/=10;
            cnt++;
        }while (number>0);
        return cnt;
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0)return false;
        while(bigCount>0) {
            if (goal >= 5) {
                goal -= 5;
                if(goal==0) return true;
                bigCount--;
            }else {
                break;
            }
        }
        if(smallCount>=goal){
            return true;
        }else{
            return false;
        }
    }
    public static int getLargestPrime(int number){
        if(number<2)return -1;
        boolean isPrime=true;
        int primeFactor=0;
        for(int i=1;i<=number;i++){
//            System.out.println("I: "+i);
            if(number%i==0){
                for(int j=2;j<i;j++){
//                    System.out.println("J: "+j);
                    if(i%j==0) isPrime=false;
                }
                if(isPrime)primeFactor=i;
            }
        }
        return primeFactor;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            String stars = "";
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        stars += "*";
                    } else if (j == 1 || j == number) {
                        stars += "*";
                    } else if (i == j) {
                        stars += "*";
                    } else if (j == (number - i + 1)) {
                        stars += "*";
                    } else {
                        stars += " ";
                    }

                }
                System.out.println(stars);
                stars = "";
            }
        }
    }
}