package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import model.Book;
import model.User;
import service.BookService;
import service.UserService;
import view.BookView;
import view.ConsoleView;
import view.UserView;

public class MainController {

    public static void main(String[] args) throws NumberFormatException, IOException {
        ConsoleView ConsoleView = new ConsoleView();
        UserView UserView = new UserView();
        BookView bookview = new BookView();
        UserService userService = new UserService();
        BookService bookService = new BookService();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            ConsoleView.menu();
            switch (menu()) {
                case 1: {
                    List<User> user = userService.list();
                    UserView.infoPrint(user);
                    br.readLine();
                    break;
                }
                case 2: {
                    List<Book> books = bookService.list();
                    bookview.infoPrint(books);
                    br.readLine();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    return;
                }
            }
        }

    }

    public static int menu() throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            if (!(isNumeric(str))) {
                System.out.println("숫자를 입력하세요.");
                continue;
            }
            int menu = Integer.parseInt(str);
            if (!((0 < menu && menu < 5))) {
                System.out.println("0~5 사이 수를 입력하세요.");
                continue;
            }
            return menu;
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
