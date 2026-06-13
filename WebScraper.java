import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraper {

    public static void main(String[] args) throws Exception {

        Document doc = Jsoup.connect("https://example.com").get();

        String title = doc.title();

        System.out.println("Website Title: " + title);
    }
}