public class PhyTeacher extends Teacher{
    String mainSubject = "Physics";
    
    public static void main(String args[]) {
        //Instantiation
        PhyTeacher obj = new PhyTeacher();
        
        //Usage of parent and child properties
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        
        obj.does();
    }
}
