package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeststudentManagement {
    public static void main(String[] args) {
                StudentManagement studentManagement = new StudentManagement();
//              add new elements
                Scanner in = new Scanner(System.in);
                Student s1 = new Student("01","Duy Linh ", "15/07/03","Thái Nguyên ", "linhtdth2109010@fpt.edu.vn", "T2109M" );
                Student s2 = new Student("02","Dũng ", "15/07/03","Thái Nguyên ", "linhtdth2109010@fpt.edu.vn", "T2109M" );
                Student s3 = new Student("03","Qúy ", "15/07/03","Thái Nguyên ", "linhtdth2109010@fpt.edu.vn", "T2109M" );
                Student s4 = new Student("04","Quốc Anh ", "15/07/03","Thái Nguyên ", "linhtdth2109010@fpt.edu.vn", "T2109M" );
//                studentList.add(s1);
//                studentList.add(s2);
//                studentList.add(s3);
//                studentList.add(s4);
                studentManagement.addStudent(s1);

                int selection;



//             edit the information
        do {
            System.out.println("Mời nhập lựa chọn:");
            System.out.println("1.Thêm học sinh");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Sửa học sinh");
            System.out.println("4.Sắp xếp học sinh theo tên A->Z");
            System.out.println("5.Tìm Kiếm học sinh");
            System.out.println("6.In danh sách sinh viên");
            System.out.println("7.Thoát");
            selection = in.nextInt();
            switch (selection){
                case 1: studentManagement.addStudent();
                break;
                case 2: studentManagement.removeStudent();
                break;
                case 3: studentManagement.setStudentList();
                break;
                case 4:studentManagement.sortStudent();
                break;
                case 5: studentManagement.searchStudent();
                break;
                case 6: studentManagement.getStudentList();
                break;

            }
        }while (selection<7);


//              delete information S

    }


}
