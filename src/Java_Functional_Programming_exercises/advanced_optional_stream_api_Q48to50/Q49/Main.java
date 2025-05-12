package Java_Functional_Programming_exercises.advanced_optional_stream_api_Q48to50.Q49;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {

        List<String> urls= Arrays.asList("https://google.com",
                "htp://invalid-url",
                "https://openai.com",
                "invalid_url",
                "ftp://fileserver.com");

        Predicate<String> isValidUrl =url ->
        {
            try {
                new java.net.URL(url);
                return true;
            }
            catch (Exception e)
            {
                return false;

            }
        };

        List<String> validUrls = urls.stream()
                .filter(isValidUrl)
                .collect(Collectors.toList());
        System.out.println("valid urls: "+validUrls);
    }
}
