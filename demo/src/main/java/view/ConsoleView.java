package view;

public class ConsoleView {

    public void menu() {
        System.out.printf("""
                사용자 조회 관리

                1. 사용자 리스트 보기
                2. 도서 리스트 보기
                3. 트리 리스트 보기
                4. 종료

                입력>""");
    }
}
