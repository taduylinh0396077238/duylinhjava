package Task2;

public class Student {
    private String RollNo;
    private String FullName;
    private String DOB;
    private String Address;
    private String Email;
    private String Status;


    public Student(String rollNo, String fullName, String DOB, String address, String email, String status) {
        RollNo = rollNo;
        FullName = fullName;
        this.DOB = DOB;
        Address = address;
        Email = email;
        Status = status;
    }

    public String getRollNo() {
        return RollNo;
    }

    public String getFullName() {
        return FullName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public String getStatus() {
        return Status;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo='" + RollNo + '\'' +
                ", FullName='" + FullName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
