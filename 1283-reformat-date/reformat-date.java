class Solution {

    
    public String reformatDate(String date) {
        
        StringBuilder result = new StringBuilder();
        int len = date.length();
        //13 13-4 9
        String year = date.substring(len-4,len);
        System.out.println(year);

        List<String> months = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        String monthString = date.substring(len-8,len-5);
        int month = months.indexOf(monthString)+1;
        System.out.println("month:"+month);
        if(month<=9){
            monthString = "0"+Integer.toString(month);
        }else{
            monthString = Integer.toString(month);
        }
        int dateInt = 0;
         String dateString = null;
        if(Character.isDigit(date.charAt(0)) && Character.isDigit(date.charAt(1))){
            dateString= date.substring(0,2);
            System.out.println("dateString:"+dateString);
            dateInt = Integer.parseInt(dateString);
        }else{
            dateInt = Integer.parseInt(date.substring(0,1));
            System.out.println("dateString:"+dateInt);
            dateString = "0"+Integer.toString(dateInt);
        }
        result.append(year);
        result.append("-");
        result.append(monthString);
        result.append("-");
        result.append(dateString);

        
        return result.toString();
        
    }
}