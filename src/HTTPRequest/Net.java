package HTTPRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Net {
    private static HttpURLConnection connection;
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer response  = new StringBuffer();

        URL url = new URL("https://jsonplaceholder.typicode.com/albums");
        connection = (HttpURLConnection) url.openConnection();

        //Request setup
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        int status = connection.getResponseCode();
        if(status>299){
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            while((line=reader.readLine())!=null){
                response.append(line);
            }
            reader.close();
        }
        else{
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            line = reader.readLine();
            while(line!=null){
                response.append(line);
                line = reader.readLine();
            }
            reader.close();
        }


        System.out.println(response.toString());
        connection.disconnect();
    }
}
