import java.util.Scanner;

public class Main {

//    Trong phần này, chúng ta sẽ phát triển một chức năng cho phép đếm số lượng sinh viên đã thi đỗ một kỳ thi, dựa vào danh sách điểm được nhập vào.
//    Sử dụng thang điểm 10, điểm đỗ là từ 5 trở lên.
//    Ứng dụng cho phép nhập vào điểm của tối đa 30 sinh viên, sau đó hiển thị số lượng sinh viên đã thi đỗ.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập mảng
        int studentsNumber;
        do {
            System.out.print("Nhập số lượng sinh viên (<30): ");
            studentsNumber = sc.nextInt();
        } while (studentsNumber > 30);
        float scores[] = new float[studentsNumber];
        for (int i = 0; i< scores.length; i++){
            System.out.printf("Nhập điểm của sinh viên thứ %d: ", i+1);
            scores[i] = sc.nextFloat();
        }

        int countPass = 0;
        for (float score: scores){
            if (isPass(score))
                countPass++;
        }
        System.out.printf("Số sinh viên đạt điểm qua môn: %d", countPass);
    }

    public static boolean isPass(float score) {
        return score >= 5;
    }
}
