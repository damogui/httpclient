package tal.dingding;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<SsoUrlPrm>result = restTemplate.getForEntity(requestPathUrl,SsoUrlPrm.class);

        HttpClient.sendGet("");
        System.out.println( "Hello World!" );
    }
}
