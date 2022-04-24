package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> studentList;
//    gọi phương thức
    private static Scanner in = new Scanner(System.in);
//    in là biến tĩnh của static gọi ra


    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }
    public void getStudentList(){
        for (Student stu: studentList){
            System.out.println("Roll("+ stu.getRollNo()+"):" + stu.getFullName());
        }
    }
    public  void addStudent(Student student){
        studentList.add(student);
//        Thêm sinh viên
    }
    public void addStudent(){
        String rollNo;
        String fullName;
        String address;
        String email;
        String DOB;
        String status;


        System.out.println("Thêm sinh Viên");
        System.out.println("Nhập rollNo sv dạng chuỗi");
        rollNo = in.next();
        if (studentList.stream().allMatch(student -> !student.getRollNo().equals(rollNo))){

            System.out.println("Nhập fullName sv dạng chuỗi ");
            fullName=in.next();
            System.out.println("NHập address sv dạng chuỗi");
            address = in.next();
            System.out.println("Nhập Email sv dạng chuỗi");
            email = in.next();
            System.out.println("Nhập ngày sinh sv dạng chuỗi");
            DOB = in.next();
            System.out.println("Nhập status sv dạng  số");
            status = in.next();
            Student stu = new Student(rollNo,fullName,address,email,DOB,status);
            studentList.add(stu);
            System.out.println("Thêm Sinh Viên Thành Công");

        }else {
            System.out.println("Sinh Viên Đã Tồn Tại");
        }
    }


    public void removeStudent() {
        System.out.println("Xóa học sinh");
        System.out.println("Mời bạn nhập rollNo");
        String rollNo = in.next();
        if (studentList.stream().anyMatch(student -> student.getRollNo().equals(rollNo))){
                for(Student student : studentList){
                    if (student.getRollNo().equals(rollNo)){
                        studentList.remove(student);
                        System.out.println("Xóa sinh viên thành công");
                        break;
                    }
                }
        }else {
            System.out.println("Sinh viên ko tồn tại");
        }
    }


//    LOẠI
    public void sortStudent(){
        studentList.sort((stu1,stu2)->stu1.getFullName().compareTo(stu2.getFullName()));
        getStudentList();
    }
    public void setStudentList(){
        System.out.println("Mời bạn nhập id sinh viên cần chỉnh sửa");
        String id = in.next();
        boolean check = false;
        Student stu = null;

//        kiểm tra sự tồn tại của id
        for (Student student:studentList){
         if (student.getRollNo().equals(id)){
             check = true;
             stu = student;
             break;
         }
        }
        if (check){
            System.out.println("Mời bạn chọn");
            System.out.println("1: Thay đổi email");
            System.out.println("2: Thay đổi status");
            System.out.println("3: Thay đổi address");
            int selection = in.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Mời bạn nhập thay  đổi");
                    String email = in.next();
                    for (Student student : studentList) {
                        if (student.equals(stu)){
                            student.setEmail(email);
                        }
                    }
                case 2:
                    System.out.println("Mời bạn nhập thay đổi");
                    String st = in.next();
                    for (Student student:studentList){
                        if (student.equals(stu)){
                            student.setStatus(st);
                        }
                    }
                case 3:
                    System.out.println("Mời bạn nhập thay đổi ");
                    String ad = in.next();
                    for (Student student: studentList){
                        if (student.equals(stu)){
                            student.setAddress(ad);
                        }
                    }
                    break;
                default:
                    System.out.println("Bạn đã chọn sai");
//                    trường hợp cuối cùng khi ko có cái nào chính xác

            }

        }else {
            System.out.println("ID bạn chọn ko tồn tại");
        }
    }
    public void searchStudent(){
        System.out.println("Chọn tìm kiếm học sinh ");
        System.out.println("1.RollNo");
        System.out.println("2.Tên");
        int selection = in.nextInt();
//        theo biến int
        System.out.println("Nhập nội dung tìm kiếm ");
        String key = in.next();
//        nó chạy theo string
        switch (selection){
            case 1:
                if (studentList.stream().anyMatch(student -> student.getRollNo().contains(key))){
                    for (Student student:studentList){
                        if (student.getRollNo().contains(key)){
                            System.out.println("RollNo("+ student.getRollNo()+")"+ student.getFullName());

                        }
                    }
                }
                break;

            case 2:
                if (studentList.stream().anyMatch(student -> student.getFullName().contains(key))){
//                    contains() tìm kiếm chuỗi ký tự trong chuỗi này
                    for (Student student:studentList){
                        if (student.getFullName().contains(key)){
                            System.out.println("RollNo("+student.getRollNo()+")"+student.getFullName());
                        }
                    }
                }
        }
    }



}
