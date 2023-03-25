import com.schuanhe.Plook.entity.User;
import com.schuanhe.Plook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {
    @Autowired
    UserService userService;

    /**
     * 登录测试
     * 如果账号密码正确则登录成功且返回正确的数据，否则返回null
     */
    @org.junit.jupiter.api.Test
    void testLogin(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        System.out.println(userService.Login(user));
        System.out.println("啊大大");
    }

    @org.junit.jupiter.api.Test
    void testAllUser(){
        System.out.println(userService.queryUserList());
    }
}
