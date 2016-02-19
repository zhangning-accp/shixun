package com.shixun.c22;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by zn on 2016/2/19.
 * 演示xml的解析
 */
public class XMLDemo {
    public static void main(String [] args) {

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //1. 读取一个xml
            DocumentBuilder builder = factory.newDocumentBuilder();
            //使用builder解析一个xml文件
            Document doc = builder.parse("xmldemo.xml");
            //先获取根节点
            Element root = doc.getDocumentElement();
            //doc.getDocumentElement()
            //Element ele = doc.getElementById("abc")
            NodeList nodes = doc.getElementsByTagName("orderEntry");
            Node node = nodes.item(0);
            NodeList childs = node.getChildNodes();
            for(int i = 0; i < childs.getLength(); i ++) {
                //因为Text类型不能转成Elememt的，所以该代码有潜在的异常风险
                if(childs.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element elements = (Element) childs.item(i);
                    System.out.println(elements.getAttribute("name"));
                }
            }

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
