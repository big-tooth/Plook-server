import com.schuanhe.plook.SpringbootApplication;
import com.schuanhe.plook.entity.Room;
import com.schuanhe.plook.service.RoomService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = SpringbootApplication.class)
@ContextConfiguration
public class RoomTest {

    @Autowired
    RoomService roomService;

    /**
     * 登录测试
     * 如果账号密码正确则登录成功且返回正确的数据，否则返回null
     */
    @Test
    void testGetRoomById(){
        Room roomById = roomService.getRoomById(1);
        System.out.println(roomById);
    }

}
