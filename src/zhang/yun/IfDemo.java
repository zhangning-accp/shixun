package zhang.yun;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/14.
 */
public class IfDemo {
    public static void main(String [] args) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字:");
        String str = scanner.next();

        while (!scanner.hasNextInt()) {
            System.out.println("不是数字，重新输入..");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            }
            System.out.println("input= " + input);
            //else {
            //System.out.println("不是数字。");
            //}

        }
    }
}

//ba
