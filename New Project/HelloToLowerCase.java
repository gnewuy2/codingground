public class HelloToLowerCase{
     public static int getMonthNum(String month){ //static non-main method
         int monthNumber = 0;
         if (month == null)
            return monthNumber;
         switch(month.toLowerCase()){
             case "january": monthNumber = 1; break;
             case "february": monthNumber = 2; break;
             case "december": monthNumber = 12; break;
             default: monthNumber = 99; break;
         }
         return monthNumber;
     }

     public static void main(String []args){
         String month = "February";
         int monthNum = getMonthNum(month);
         System.out.println(monthNum);
     }
}
