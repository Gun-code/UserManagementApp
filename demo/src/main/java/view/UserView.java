package view;

import java.io.IOException;
import java.util.List;

import model.User;

public class UserView {

    public void infoPrint(List<User> lists) throws IOException {

        int index = 0;
        User user;
        for (int i = 0; i < lists.size(); ++i) {
            user = lists.get(index);
            System.out.printf("""
                    사용자 데이터:
                    ID: %d
                    Password: %s
                    Username: %s
                    Email: %s
                    Image URL: %s
                    Created At: %s
                    Updated At: %s
                    등록 도서 : %s
                    ... 나머지 데이터 출력

                    """, user.getId(), user.getPassword(), user.getUserName(),
                    user.getEmail(), user.getImageUrl(), user.getCreateTime(), user.getUpdateTime(),
                    user.getRegiBooks());
            ++index;
        }
        System.out.println("메뉴료 돌아가기 (아무키나 입력해주세요.)");

    }
}
