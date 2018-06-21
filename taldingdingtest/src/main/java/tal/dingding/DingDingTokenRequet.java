package tal.dingding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 郭佳
 * @ClassName: DingDingTokenRequet
 * @Description:TODO
 * @Date: 2018-06-21 14:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DingDingTokenRequet {
    private int expires_in;
    private String errmsg;
    private String access_token;
    private String errcode;


}
