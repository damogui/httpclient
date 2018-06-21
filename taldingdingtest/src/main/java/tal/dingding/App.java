package tal.dingding;

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
        //DingDingUtil.getDDSimpleUsersByDeptId("cf627be82e9d328cbe2c97c9fcfe0252",1l);
        DingDingUtil.sendDDMessage(DingDingUtil.AGENTID,"manager1156","{\"message_url\": \"http://dingtalk.com\",\"head\": {\"bgcolor\": \"FFBBBBBB\",\"text\": \"头部标题\"},\"body\": {\"title\": \"正文标题\",\"form\": [{\"key\": \"姓名:\",\"value\": \"张三\"},{\"key\": \"爱好:\",\"value\": \"打球、听音乐\"}],\"rich\": {\"num\": \"15.6\",\"unit\": \"元\"},\"content\": \"大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本\",\"image\": \"@lADOADmaWMzazQKA\",\"file_count\": \"3\",\"author\": \"李四 \"}}");
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
