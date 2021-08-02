package no_1;
/*
    计算纸张的折叠次数
    请从标准输入流（控制台）中获取两个 double 类型的变量，
    height 表示山的的高度，paperThickness 代表纸的厚度。
    根据这两个参数计算纸折叠多少次可以达到山的的高度，并将结果打印到标准输出流（控制台）中。

    当 height = 8886488，paperThickness = 0.088 时，
    程序执行打印出的结果为：Need to fold 27 times

    当 height = 999999，paperThickness = 0.09 时，
    程序执行打印出的结果为：Need to fold 24 times
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double paperThickness = sc.nextDouble();
        int count = 0;

        while(paperThickness <= height){
            paperThickness*= 2;
            count++;
        }

        System.out.println("Need to fold "+count+" times");
    }
}
