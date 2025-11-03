class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


    
  }

  String swapLetter(String s){
    String bld="";
    for(int x=0; x<s.length(); x++){
      String let=s.substring(x,x+1);
      if(let.equals("e")){
        bld+="%";
      }
      else{
        bld+=let;
      }

    }
    return bld;
  }

  String encryption2(String s){
    String bld="";
    int leftLen = s.length()/2;
    String left = s.substring(0, leftLen);
    String right = s.substring(leftLen);
    String bld = "";
    for (int i = 0; i < leftLen; i++) {
      bld += left.substring(i, i+1);
      if (i < right.length()){ 
      bld += right.substring(i, i+1);
      }
    }
    if (right.length() > leftLen){
    bld += right.substring(leftLen);
    }
    return bld;
  }


  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);
      

    return bld;
  }


}