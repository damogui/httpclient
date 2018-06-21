package tal.dingding;

import com.dingtalk.api.request.OapiChatSendRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 郭佳
 * @ClassName: DingDingSend
 * @Description:
 * @Date: 2018-06-21 16:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DingDingSend {
    private  String message_url="http://dingtalk.com";
//    private  Head head;
    private OapiChatSendRequest.Body body;

}
