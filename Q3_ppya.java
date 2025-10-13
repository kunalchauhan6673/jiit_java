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
class Q3_ppya{
    public static void main(String[] args){
        course obj=new course();
        obj.getCourseDetails();
        course obj1=new course("DSA","Kunal");
        obj1.getCourseDetails();
    }
}