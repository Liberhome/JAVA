import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/config.xml"));
            NodeList nodeList = doc.getElementsByTagName("className");
            Node firstChild = nodeList.item(0).getFirstChild();
            String nodeValue = firstChild.getNodeValue();
            Class a = Class.forName(nodeValue);
            return a.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
