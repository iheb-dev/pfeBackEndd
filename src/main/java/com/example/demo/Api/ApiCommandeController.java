package com.example.demo.Api;

import com.example.demo.entities.Commande;
import org.apache.http.client.HttpClient;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/valomnia/commandes")
public class ApiCommandeController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
   private HttpClient httpClient;

    @GetMapping("getall")
    public String getCommandes()
    {


        System.out.println("getting the lis of orders");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<String> responseEntity = restTemplate
                .exchange("http://valomnia.fieldtouch.com/api/v2.1/orders?operationType=ORDER&max=100", HttpMethod.GET, entity, String.class);
        return responseEntity.getBody();
    }



}