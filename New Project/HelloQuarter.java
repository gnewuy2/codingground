public class HelloQuarter{

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
     }
}
