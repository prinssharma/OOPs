class Student{

    private String name;

    private String rollNo;

    private String department;

    private String course;

    private String email;

    private String phoneNo;

     public Student() {
    }


    public Student(String name, String rollNo, String department, String course, String email, String phoneNo) {
        // this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.course = course;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

   
    
}

class Hospital{

    private String name;

    private String department;

    private String address;

    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    

    Hospital(String dept){
        this.department = dept;
    }
    Hospital(){

    }
    public static void main(String[] args) {
        Student s1=new Student("Prins Kumar Sharma","21mcmc33","SCIS","MCA","21mcmc33@uohyd.ac.in","7004302503");

        Hospital hp = new Hospital();
        hp.setDepartment(s1.getDepartment());
        hp.setAddress("Madinaguda , Hyderabad");
        hp.setName("Pranaam Hospital");

        System.out.println("-----------Hospital class-----------");
        System.out.println(hp.name);
        System.out.println(hp.department);
        System.out.println(hp.address);

        System.out.println("-----------Student class-----------");

        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        System.out.println(s1.getDepartment());
        System.out.println(s1.getCourse());
        System.out.println(s1.getEmail());
        System.out.println(s1.getPhoneNo());
        
    }
}