public class Doctor  {

    private String name;
    private String id;
    private String department;
    private String specialization;

    Doctor(String nameOfDoc,String docId,String dept,String spec)
    {
        this.name = nameOfDoc;
        this.id = docId;
        this.department = dept;
        this.specialization = spec;
    }

    public void showInfo()
    {
        System.out.println("doctor name is " +this.name);
        System.out.println("doctor id is" +this.id);
        System.out.println("department is" +this.department);
        System.out.println("specialization is " +this.specialization);
    }


}