package com.example.iit.conferencemanager;

import android.os.AsyncTask;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
        import java.nio.charset.Charset;
        import org.json.JSONException;
        import org.json.JSONObject;

public class HttpGet extends AsyncTask<String, String, String> {

    private static String IP = "http://162.243.86.227";
    private static String Port = ":4870";
    private static String After = "/test";



    /*private static String readAll(Reader r) throws IOException {
        StringBuilder sBuilder = new StringBuilder();
        int cp;
        while ((cp = r.read()) != -1) {
            sBuilder.append((char) cp);
        }
        return sBuilder.toString();
    }*/



    /*public static void main(String[] args) throws IOException, JSONException {
        JSONObject json = readJsonFromUrl(IP+Port+After);
        System.out.println(json.toString());
    }*/

    @Override
    protected String doInBackground(String... params) {//throws IOException,JSONException{
        //public static JSONObject readJsonFromUrl(/*String url*/) throws IOException, JSONException {
        //URL url = new URL(IP+Port+After);
        URL url = null;
        try {
            url = new URL(IP + Port + params[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream iStream = null;
        try {
            iStream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpURLConnection urlConnection = null;
        BufferedReader bReader = null;

        try {
            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();
            //iStream= urlConnection.getInputStream(); Maybe useful, this is how tut12 did it

            bReader = new BufferedReader(new InputStreamReader(iStream, Charset.forName("UTF-8")));

            StringBuffer buffer = new StringBuffer();

            String line="";
            while((line = bReader.readLine())!=null){
                buffer.append(line);
            }

            String finalJSON = buffer.toString();

            JSONConverter parentObject = new JSONConverter();

            return parentObject.deserializeJSONAccount(finalJSON).toString();

            //String jsonText = readAll(bReader);
            // JSONObject json = new JSONObject(jsonText);
            //return json;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                iStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(urlConnection != null) {
                urlConnection.disconnect();
            }
            try {
                if(bReader!=null) {
                    bReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //}
        return null;
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
        /*desiredfield*///.setText(result);
    }
}