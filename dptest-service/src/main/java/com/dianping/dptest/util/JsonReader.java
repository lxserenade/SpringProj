package com.dianping.dptest.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import java.io.*;
import java.net.URL;

/**
 * Created by lixia on 16/7/14.
 */
public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws IOException, JSONException {
        try {
            String tmpurl ="http://cat.dianpingoa.com/cat/r/app?query1=2016-07-14;1;;;;;;;;;00:00;14:55&query2=&type=success&groupByField=&sort=&commandId=shop.bin|shop.bin[%E5%95%86%E6%88%B7%E9%A1%B5]&commandId2=&appId=1&appId2=1&op=linechartJson";
            URL url= new URL(tmpurl);
            URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(uri.toString());
            getRequest.addHeader("accept", "text/html");

            HttpContext HTTP_CONTEXT = new BasicHttpContext();
            HTTP_CONTEXT.setAttribute(CoreProtocolPNames.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36");
            getRequest.setHeader("Referer", "http://cat.dianpingoa.com");

            HttpResponse response = httpClient.execute(getRequest,HTTP_CONTEXT);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;

            JSONObject json = JSON.parseObject(readAll(br));

            JSONObject lineCharts = json.getJSONObject("lineCharts");

            JSONArray valueObjects = lineCharts.getJSONArray("valueObjects");


            System.out.print(valueObjects.toJSONString());

            httpClient.getConnectionManager().shutdown();

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
