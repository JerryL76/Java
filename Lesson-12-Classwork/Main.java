class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    boolean collegeCredit(String courseCode){
      int codeLength = courseCode.indexOf(5);
      if (courseCode == "E" || courseCode == "M"){
        return true;
      }
      else{
        return false;
      }
      
  }
    
    String getCounsoler(String officialClass){
      String first = officialClass.substring(0,1);
      String middle = officialClass.substring(officialClass.length()/2, officialClass.length()/2 +1);
      if (first.equalsIgnoreCase("B") || middle.equalsIgnoreCase("B")) {
      return "Berrouet";
      } 
      else if (first.equalsIgnoreCase("C") || middle.equalsIgnoreCase("C")) {
      return "Chu";
      } 
      else if (first.equalsIgnoreCase("D") || middle.equalsIgnoreCase("D")) {
      return "Dinn";
      } 
      else if (first.equalsIgnoreCase("E") || middle.equalsIgnoreCase("E")) {
      return "Eyzengart";
      } 
      else if (first.equalsIgnoreCase("F") || middle.equalsIgnoreCase("F")) {
      return "Flores";
      } 
      else if (first.equalsIgnoreCase("G") || middle.equalsIgnoreCase("G")) {
      return "Gibson";
      } 
      else if (first.equalsIgnoreCase("L") || middle.equalsIgnoreCase("L")) {
      return "Shim Lee";
      } 
      else if (first.equalsIgnoreCase("M") || middle.equalsIgnoreCase("M")) {
      return "Meltzer";
      } 
      else if (first.equalsIgnoreCase("P") || middle.equalsIgnoreCase("P")) {
      return "Paccione";
      } 
      else if (first.equalsIgnoreCase("S") || middle.equalsIgnoreCase("S")) {
      return "Fiore";
      } 
      else if (first.equalsIgnoreCase("T") || middle.equalsIgnoreCase("T")) {
      return "Tsai";
      } 
      else if (first.equalsIgnoreCase("Z") || middle.equalsIgnoreCase("Z")) {
      return "Zayes";

    }

    String imageType(String fileName){
      String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
      if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg")){
        return "JPEG Image";
      }
      else if (extension.equalsIgnoreCase("png")){
        return "PNG Image";
      }
      else if (extension.equalsIgnoreCase("gif")){
        return "GIF Image";
      }
      else if (extension.equalsIgnoreCase("bmp")){
        return "BMP Image";
      }
      else{
        return "Unknown Image Type";
      }
    }


 
  }
  }
}