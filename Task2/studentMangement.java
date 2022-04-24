package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentMangement {
        private List<Student> studentList;
        private static Scanner in = new Scanner(System.in);

        public studentMangement(){
            this.studentList = new ArrayList<>();
        }
        public void getStudentList(){
            for (Student stu:studentList){
                System.out.println("Roll("+ stu.getRollNo()+")"+stu.getFullName());
            }
        }
        public void addStudent(Student student){
            studentList.add(student);

        }
        public void addStudent(){
            String rollNo;
            String fullName;
            String address;
            String email;
            String DOB;
            String status;

            System.out.println("Thêm Sinh Viên");
            System.out.println("NHập rollNo sv ");
            rollNo = in.next();
            if (studentList.stream().allMatch(student -> !student.getRollNo().equals(rollNo))){
                System.out.println("Nhập fullName sinh viên");
                fullName = in.next();
                System.out.println("Nhập address sinh viên ");
                address = in.next();
                System.out.println("Nhập email sinh viên ");
                email = in.next();
                System.out.println("Nhập DOB sinh viên");
                DOB = in.next();
                System.out.println("Nhập status sinh viên");
                status = in.next();
                Student stu = new Student(rollNo,fullName,address,email,DOB,status);
                studentList.add(stu);
                System.out.println(" Thêm sinh viên thành công");

            }else {
                System.out.println("Sinh Viên đã tồn tại");
            }
        }
        public void removeStudent(){
            System.out.println("Xóa Học Sinh");
            System.out.println("Mời bạn nhập RollNo");
            String rollNo = in.next();
            if (studentList.stream().anyMatch(student -> student.getRollNo().equals(rollNo))){
                for (Student student : studentList){
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

        public void sortStudent(){
                studentList.sort((stu1,stu2)-> stu1.getFullName().compareTo(stu2.getFullName()));
                getStudentList();
        }
        public void setStudentList(){
            System.out.println("Mời bạn nhập id sinh viên cần chỉnh sửa");
            String id = in.next();
            boolean check = false;
            Student stu = null;

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
                        System.out.println("Mời bạn nhập thay đổi");
                        String email = in.next();
                        for (Student student : studentList){
                            if (student.equals(stu)){
                                student.setEmail(email);
                            }
                        }
                    case 2:
                        System.out.println("Mời bạn nhập thay đổi ");
                        String st = in.next();
                        for (Student student : studentList){
                            if (student.equals(stu)){
                                student.setStatus(st);
                            }
                        }
                    case 3:
                        System.out.println("Mời bạn nhạp tahy đỏi ");
                        String ad = in.next();
                        for (Student student : studentList){
                            if (student.equals(ad)){
                                student.setAddress(ad);
                            }
                        }
                        break;
                    default:
                        System.out.println("Bạn đã chọn sai");

                }
            }else {
                System.out.println("ID bạn chọn ko tồn tại");
            }
        }
}


