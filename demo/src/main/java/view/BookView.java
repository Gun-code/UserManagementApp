package view;

import java.io.IOException;
import java.util.List;

import model.Book;

public class BookView {

    public void infoPrint(List<Book> lists) throws IOException {
        Book book;
        for (int i = 0; i < lists.size(); ++i) {
            book = lists.get(i);
            System.out.printf("""
                    도서 데이터:
                    ID: %d
                    ISBN: %s
                    제목: %s
                    저자: %s
                    출판사: %s
                    카테고리: %s
                    등록 회원 수 : %d
                    등록 회원 ID : %s

                    ... 나머지 데이터 출력

                    """, book.getId(), book.getIsbn(), book.getTitle(),
                    book.getAuthor(), book.getPublisher(), book.getCategory(), book.getUserCount(), book.getUserID());
        }
        System.out.println("메뉴료 돌아가기 (아무키나 입력해주세요.)");

    }
}
