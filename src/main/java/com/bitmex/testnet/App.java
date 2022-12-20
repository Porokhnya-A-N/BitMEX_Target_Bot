package com.bitmex.testnet;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        System.out.println( "Hello World!" );
        HttpClient client = HttpClient.newHttpClient();
        System.out.println(client.version());
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://testnet.bitmex.com/")).build();
        HttpResponse<String> response = client.send(request,   HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        /*
        public static String encode(String key, String data) throws Exception {
  Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
  SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
  sha256_HMAC.init(secret_key);

  return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
}

public static void main(String [] args) throws Exception {
  System.out.println(encode("key", "The quick brown fox jumps over the lazy dog"));
}
         */
    }
}
