package com.adv.trycatch;

public class TryMain {

    public TryMain() {

        try {
            int[] myNums = {1, 2, 3};
            System.out.println(myNums[10]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("위 내용은 오류 메세지입니다.");
        } finally {
            System.out.println("try-catch를 나가며 무조건 실행하는 부분입니다.");
        }

        checkAge(15);
    }

    private void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("18세 미만은 입장이 제한됩니다.");
        } else {
            System.out.println("18세 이상입니다. 입장 가능합니다.");
        }
    }
}
