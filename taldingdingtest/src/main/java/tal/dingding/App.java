package tal.dingding;

import com.dingtalk.api.request.OapiMessageSendToConversationRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<SsoUrlPrm>result = restTemplate.getForEntity(requestPathUrl,SsoUrlPrm.class);
        String corpid = "dinge4adeae79ec3c6aa35c2f4657eb6378f";
        String corpsecret = "D20traVPqE2hWPp3ciNGoxwSTcl23MiZQVCKfBjhFCW_QDGD4HtUTXHEl-8gKtgn";
        String url = String.format("https://oapi.dingtalk.com/gettoken?corpid=%s&corpsecret=%s", corpid, corpsecret);
//        String token = getDingDingToken(url);
        List<User> users=DingDingUtil.getDDSimpleUsersByDeptId("cf627be82e9d328cbe2c97c9fcfe0252",1l);
        OapiMessageSendToConversationRequest.Oa oa=new OapiMessageSendToConversationRequest.Oa();
        oa.setMessageUrl( "http://dingtalk.com");
        OapiMessageSendToConversationRequest.Head  head=new OapiMessageSendToConversationRequest.Head();
        head.setBgcolor("FFBBBBBB");
        head.setText("头部标题");
        oa.setHead(head);
        OapiMessageSendToConversationRequest.Body body=new OapiMessageSendToConversationRequest.Body();
        body.setTitle("正文标题");
        List<OapiMessageSendToConversationRequest.Form> forms=new ArrayList<>();
        OapiMessageSendToConversationRequest.Form form1=new OapiMessageSendToConversationRequest.Form();
        form1.setKey("姓名");
        form1.setValue("8888");
        OapiMessageSendToConversationRequest.Form form2=new OapiMessageSendToConversationRequest.Form();
        form2.setKey("爱好");
        form2.setValue("爬山");
        forms.add(form1);
        forms.add(form2);
        body.setForm(forms);
        OapiMessageSendToConversationRequest.Rich rich=new OapiMessageSendToConversationRequest.Rich();
        rich.setNum("8");
        rich.setUnit("美元");
        body.setRich(rich);
        body.setContent("测试一下发送的消息哈哈哈哈");
        body.setImage("@lADOADmaWMzazQKA");
        body.setFileCount("0");
        body.setAuthor("jack");
        oa.setBody(body);
        for (User user:users
             ) {
            //DingDingUtil.sendDDMessage(DingDingUtil.AGENTID,user.getUserId(),"{\"message_url\": \"http://dingtalk.com\",\"head\": {\"bgcolor\": \"FFBBBBBB\",\"text\": \"头部标题\"},\"body\": {\"title\": \"正文标题\",\"form\": [{\"key\": \"姓名:\",\"value\": \"张三\"},{\"key\": \"爱好:\",\"value\": \"打球、听音乐\"}],\"rich\": {\"num\": \"15.6\",\"unit\": \"元\"},\"content\": \"测试一下发送的消息哈哈哈哈\",\"image\": \"@lADOADmaWMzazQKA\",\"file_count\": \"3\",\"author\": \"李四 \"}}");

            DingDingUtil.sendDDMessage(DingDingUtil.AGENTID,user.getUserId(),JsonUtils.toJson(oa));
        }

        //System.out.println(token);  自己： manager1156
        System.out.println("end");




    }

    private static String getDingDingToken(String url) {
       String result=HttpClientUtls.sendGet(url);
        DingDingTokenRequet dingDingTokenRequet=JsonUtils.parse(result,DingDingTokenRequet.class);
        System.out.println(dingDingTokenRequet.getErrmsg());

       return dingDingTokenRequet.getAccess_token();

    }
}
