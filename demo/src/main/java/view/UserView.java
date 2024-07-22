package view;

import java.util.List;

import model.User;

public class UserView {

    public void infoPrint(List<User> list) {
        for (User user : list) {
            System.out.printf("""
                    사용자 데이터:
                    ID: %d
                    Password: %s
                    Username: %s
                    Email: %s
                    Image URL: %s
                    Created At: %s
                    Updated At: %s
                    
                    """,
                    user.getId(),
                    user.getPassword(),
                    user.getUserName(),
                    user.getEmail(),
                    user.getImageUrl(),
                    user.getCreateTime(),
                    user.getUpdateTime());
        }
        System.out.println("메뉴료 돌아가기 (아무키나 입력해주세요.)");

    }
}
