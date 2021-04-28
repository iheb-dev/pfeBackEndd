package com.example.demo.Api;


import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache. http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.log4j.Logger;
import java.util.Arrays;

@RestController
@RequestMapping("/valomnia/fournisseur")
public class ApiFournissuerPrixController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/prix")
    public String getlistePrix()
    {
        System.out.println("getting the list des prix de fournisseur ");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<String> responseEntity = restTemplate
                .exchange("http://valomnia.fieldtouch.com/api/v2.1/prices?priceList=Ref-01", HttpMethod.GET, entity, String.class);
        return responseEntity.getBody();
    }


  /*  // return token or AuthenticationFailureHandler or HttpHostConnectException
    public String authentication(String login, String password) {
        String result = null;
        try {
            HttpClient client = new DefaultHttpClient();

            List<CustomNameValuePair> parameters = new ArrayList<CustomNameValuePair>();
            parameters.add(new CustomNameValuePair("j_username", login));
            parameters.add(new CustomNameValuePair("j_password", password));
            parameters.add(new CustomNameValuePair("ajax", "true"));

            String url = URLEncodedUtils.format(parameters, "ISO-8859-1");
            HttpPost post = new HttpPost("http://valomnia.fieldtouch.com/" + "j_spring_security_check?" + url);
            System.out.println("http://valomnia.fieldtouch.com/" + "j_spring_security_check?" + url);
            post.setHeader("Content-type", "application/json");
            try {
                HttpResponse response = client.execute(post);
                HttpResponse response2 = null;
                String loc ="";
                String token ="" ;
                if (response.getStatusLine().getStatusCode() == 302) {

                    loc = response.getFirstHeader("Location").getValue();
                    String cookie = response.getFirstHeader("Set-Cookie").getValue();
                    token = cookie.substring(11, cookie.indexOf(";"));
                    // get location of the redirect
                    if (loc != null) {

                        HttpClient client2 = new DefaultHttpClient();
                        HttpPost post2 = new HttpPost(loc);
                        post2.setHeader("Content-type", "application/json;charset=UTF-8");
                        post2.setHeader("Cookie", "JSESSIONID=" + token);
                        response2 = client2.execute(post2);
                    }

                }

                if (response2.getStatusLine().getStatusCode() != 200) {
                    LOGGER.error("Failed : HTTP error code : " + response2.getStatusLine().getStatusCode());
                } else {
                    LOGGER.info(" HTTP  code : " + response2.getStatusLine().getStatusCode());
                    BufferedReader rd = new BufferedReader(new InputStreamReader(response2.getEntity().getContent()));

                    String line = rd.readLine();
                    System.out.println("JSON result : "+line);
                    if (loc.equals("http://valomnia.fieldtouch.com/login/ajaxSuccess")) {

                        result = token;
                    } else {
                        result = "AuthenticationFailureHandler";
                    }

                }
            } catch (HttpHostConnectException e) {
                result = "HttpHostConnectException";
                LOGGER.info(e.toString());
            }
        } catch (ClientProtocolException e) {
            result = null;
        } catch (IOException e) {
            result = null;
        }
        return result;

    }

*/
}
