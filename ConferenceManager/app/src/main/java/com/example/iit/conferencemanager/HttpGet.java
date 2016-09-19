package com.example.iit.conferencemanager;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.Reader;
        import java.net.URL;
        import java.nio.charset.Charset;
        import org.json.JSONException;
        import org.json.JSONObject;

public class HttpGet {

    private static String IP = "http://162.243.86.227";
    private static String Port = ":4870";
    private static String After = "/test";

    private static String readAll(Reader r) throws IOException {
        StringBuilder sBuilder = new StringBuilder();
        int cp;
        while ((cp = r.read()) != -1) {
            sBuilder.append((char) cp);
        }
        return sBuilder.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream iStream = new URL(url).openStream();
        try {
            BufferedReader bReader = new BufferedReader(new InputStreamReader(iStream, Charset.forName("UTF-8")));
            String jsonText = readAll(bReader);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            iStream.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject json = readJsonFromUrl(IP+Port+After);
        System.out.println(json.toString());
    }
}