class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String rollDice(int sides){
    String dice1 = (int)(Math.random() * sides + 1);
    String dice2 = (int)(Math.random() * sides + 1);
    String result = dice1 + dice2;
    return result;
  }

  String lotto(int number){
    String lottoNumbers = "";
    for(int i = 0; i < 6; i++){
      number = (int)(Math.random() * 48 + 1);
      lottoNumbers += number + " ";
    }
    return lottoNumbers;
  }

  String additionTutor(int a, int b){
    a = (int)(Math.random() * 100 + 1);
    b = (int)(Math.random() * 100 + 1);
    String question = "What is " + a + " + " + b + "?";
    return question;
    int sum = a + b;
    if (userAnswer == sum){
      return "Correct!";
    } else {
      return "Incorrect. The correct answer is " + sum;
    }
  }


  void init(){


    
  }




}