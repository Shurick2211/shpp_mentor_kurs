package onimko;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ){
        log.info("Hello mentor course!");
        //Properties file
        Properties appProps = new Properties();
        InputStream resPath = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("my-properties.properties");
        try {
            appProps.load(resPath);
        } catch (IOException e) {
            log.error("File .properties not found!");
            throw new RuntimeException(e);
        }
        log.info(appProps.getProperty("message"));

        //xml-file
        InputStream rootPath = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("hello.xml");
        Properties xmlProps = new Properties();
        try {
            xmlProps.loadFromXML(rootPath);
        } catch (IOException e) {
            log.error("File .xml not found!");
            throw new RuntimeException(e);
        }
        log.info(xmlProps.getProperty("hello"));

    }

}
