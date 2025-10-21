class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String creditCardType(String number){
    
    if(number.substring(0,4).equals("6011") || number.substring(0,2).equals("65")){
      return "Discovery";
    }
    else if(number.substring(0,2).equals("34") || number.substring(0,2).equals("37")){
      return "America Express";
    }
    else if(number.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(number.substring(0,2).equals("51") || number.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(number.substring(0,1).equals("4")){
      return "Visa";
    }
    else{
      return "Unknown";
    }
    
  }

  Stirng pigLatin(String word){
    char firstLetter = word.charAt(0);
    String pigWord = word.substring(1) + firstLetter + "ay";
    return pigWord;
  }

  String nycLocate(String zipCode){
    if(zipCode.substring(0,3).equals("104")){
      return "The Bronx";
    }
    else if(zipCode.substring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if(zipCode.substring(0,3).equals("111") || zipCode.substring(0,3).equals("113") || zipCode.substring(0,3).equals("114")){
      return "Queens";
    }
    else if(zipCode.startsWith("100") || zipCode.startsWith("101") || zipCode.startsWith("102")){
      return "Manhattan";
    }
    else if(zipCode.startsWith("103")){
      return "Staten Island";
    }
    else{
      return "Not NYC";
    }

  void init(){
   
  }

  
  
}