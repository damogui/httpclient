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
        String token = getDingDingToken(url);
        System.out.println(token);
        System.out.println("end");
    }

    private static String getDingDingToken(String url) {
       String result=HttpClient.sendGet(url);
        DingDingTokenRequet dingDingTokenRequet=JsonUtils.parse(result,DingDingTokenRequet.class);
        System.out.println(dingDingTokenRequet.getErrmsg());

       return dingDingTokenRequet.getAccess_token();

    }
}
