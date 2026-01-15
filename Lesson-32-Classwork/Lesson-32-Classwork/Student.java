class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;
  String[] course;

  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades, String[] course){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
    this.course     = course;
  }


  // class functions
  String checkCourses(String courseName){
    for(int x=0; x<=this.course.length-1;x++){
      if(this.course[x].equals(courseName)){
        return "Student is enrolled in "+courseName;
      }
    }
    return "Student is NOT enrolled in "+courseName;
  }

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  
}