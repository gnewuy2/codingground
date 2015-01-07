public class HelloArray{

     public static void main(String []args){
        int month =5;
        String quarterName;
        switch(month){
            case 1: quarterName = "Spring"; break;
            case 2: quarterName = "Spring"; break;
            case 3: quarterName = "Spring"; break;
            case 4: quarterName = "Summer"; break;
            case 5: quarterName = "Summer"; break;
            case 6: quarterName = "Summer"; break;
            case 7: quarterName = "Fall"; break;
            case 8: quarterName = "Fall"; break;
            case 9: quarterName = "Fall"; break;
            case 10: quarterName = "Winter"; break;
            case 11: quarterName = "Winter"; break;
            case 12: quarterName = "Winter"; break;
            default: quarterName = "invalid month name"; break; //default is necessary
        }
        System.out.println(quarterName);
        
        java.util.ArrayList<String> futureMonths = new
            java.util.ArrayList<String>();
        switch(month){
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December"); break;
            default: break; //default is necessary
        }
        
        if (futureMonths.isEmpty())
            System.out.println(futureMonths);
        else
            System.out.println(futureMonths);
        for (String monthName : futureMonths)
            System.out.println(monthName);
     }
}
