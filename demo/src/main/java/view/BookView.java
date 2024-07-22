package view;

import java.util.List;

import model.Book;

public class BookView {

    public void infoPrint(List<Book> list) {
        for (Book book: list) {
            System.out.printf("""
                    도서 데이터:
                    ID: %d
                    ISBN: %s
                    제목: %s
                    저자: %s
                    출판사: %s
                    카테고리: %s
                    
                    """,
                    book.getId(),
                    book.getIsbn(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getCategory());
        }
        System.out.println("메뉴료 돌아가기 (아무키나 입력해주세요.)");
    }
}
