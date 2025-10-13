class course{
    String courseName;
    String instructor;
    
    course(){
        courseName="Java";
        instructor="John Doe";
    }
    
    course(String courseName, String instructor){
        this.courseName=courseName;
        this.instructor=instructor;
    }
    void getCourseDetails(){
        System.out.println("The Course name is "+courseName);
        System.out.println("The Instructor name is "+instructor);
    }
    
}
class ProgrammingCourse extends course{
    String language;
    String level;
    ProgrammingCourse(){
        super();
        language="Java";
        level="Beginner";
    }
    ProgrammingCourse(String courseName, String instructor,String language,String level){
        super(courseName, instructor);
        this.language=language;
        this.level=level;
    }
    void getCourseDetails(){
        super.getCourseDetails();
        System.out.println("The language is "+language);
        System.out.println("The level is "+level);
    }
    void getCourseDetails(String additionalInfo) {
        getCourseDetails();
        System.out.println("Additional Info: " + additionalInfo);
    }
}
class Q3_ppyb{
    public static void main(String[] args){
        course obj=new ProgrammingCourse();
        obj.getCourseDetails();
        System.out.println("-------------");
     //   course obj1=new ProgrammingCourse("DSA","Kunal","C","Moderate");  will throw an error when we call getCourseDetails() using this object because this is parents
       ProgrammingCourse obj1 = new ProgrammingCourse("DSA","Kunal","C","Moderate");
       obj1.getCourseDetails("Striver DSA sheets");

    }
}