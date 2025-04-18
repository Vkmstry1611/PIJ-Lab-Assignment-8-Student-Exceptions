// Student.java
class Student {

    private long prn;
    private String name;
    private String dob;
    private double marks;

    public Student(long prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public long getPRN() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDoB() {
        return dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoB(String dob) {
        this.dob = dob;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DoB: " + dob + ", Marks: " + marks);
    }
}
