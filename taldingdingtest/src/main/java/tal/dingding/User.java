package tal.dingding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 郭佳
 * @ClassName: User
 * @Description:
 * @Date: 2018-06-21 15:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private  String mobile;
    private  String userId;
    private  String realName;
    private  String dDUserId;
}
