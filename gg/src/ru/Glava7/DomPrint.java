package ru.Glava7;
import java.io.*;
import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;

class DomPrint {
    public static void printIdentation(int level) {
        for (int i = 0; i < level; i++){
            System.out.print("   ");
        }
    }

    public static void print(Node node, int level) {
        if(level > 0){
            System.out.println(" ");
            printIdentation(level);
        }
        System.out.println(node.getNodeName().toString() + ":");

        if (node.hasAttributes()){
            NamedNodeMap attributes = node.getAttributes();

            if (attributes.getLength() > 0) {
                level++;

                for (int i = 0; i < attributes.getLength(); i++){
                    Node attribute = attributes.item(i);
                    printIdentation(level);
                    String s = "." + attribute.getAttributes() + "=";
                    System.out.println(s + attribute.getNodeValue());
                }

                level--;
            }
        }

        String value = node.getNodeValue();
        value = (value == null ? "" : value.trim());
        if (value.length() > 0){
            printIdentation(level);
            System.out.println(value);
        }

        if (node.hasChildNodes()) {
            level++;
            NodeList children = node.getChildNodes();

            for (int i = 0; i < children.getLength(); i++){
                Node child = children.item(i);
                print(child, level);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage java DomPrint имя_файла_xml");
            System.exit(0);
        }

        File docFile = new File(args[0]);
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);

            //Document doc = builder.parse(docFile); ругается на солово builder
            //print(doc.getDocumentElement(), 0);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }

}
