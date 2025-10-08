
package javalab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class WebPageRetriever {

    public static void main(String[] args) {
        // The URL of the web page you want to retrieve
        String urlString = "https://www.google.com";
 // Replace with the desired URL

        try {
            // Create a URL object from the given URL string
            URL url = new URL(urlString);

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Get the input stream to read the content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read and print the content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();

        } catch (IOException e) {
            // Handle any IO exceptions (e.g., network errors, invalid URL)
            e.printStackTrace();
        }
    }
}
