class middle {
    String getmiddle(String a) {
        // length는 0부터 시작
        int division = a.length();
        if (division % 2 == 1) { //만약 나눴을때 홀 수 일 경우
            return a.substring(division/2, division/2+1); //나눈 값부터 , +1한 값까지 리턴
        } else {
            return a.substring(division/2-1, division/2+1); // 짝수일 경우 나눈값 -1부터 , +1한 값까지 리턴
        }
    }
}

public class Main {
    public static void main(String[] args) {

        middle a =new middle(); //main클래스 안에 a는 middle클래스 인스턴스생성
        System.out.println(a.getmiddle("abcde")); // 클래스안의 getmiddle이라는 메소드를 가져옴

    }
}
