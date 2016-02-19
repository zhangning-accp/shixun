package com.shixun.c22;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import java.io.IOException;

/**
 * Created by zn on 2016/2/19.
 * 上课随堂练习的示例
 */
public class XmlPractice {
    /**
     * PhoneInfo:{
     Brand:[{
     name:华为,
     type:{name:u8650}
     },
     {
     name:苹果,
     type:[{name:iphone4},{name:iphon5}]
     }
     ]
     }
     */

    public static void xml2Json() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/com/shixun/c22/phone.xml");
            //获取根节点
            Element root = doc.getDocumentElement();
            StringBuffer buffer = new StringBuffer();
            buffer.append(root.getTagName() + ":{");
            //遍历根节点下的所有子节点
            NodeList brandList = root.getElementsByTagName("Brand");
            if(brandList.getLength() < 2) {
                buffer.append("Brand:{");
            } else {
                buffer.append("Brand:[");
            }
            for(int i = 0; i < brandList.getLength(); i ++) {
                if(brandList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    //获取Barand元素对象
                    Element barandEle = (Element) brandList.item(i);
                    //获取barand元素的属性
                    //buffer.append(barandEle.getTagName() + ":{");
                    if(brandList.getLength() > 1) {
                        buffer.append("{");
                    }
                    buffer.append("name:" + barandEle.getAttribute("name") + ",");
                    //获取barand的子元素
                    NodeList typeList = barandEle.getElementsByTagName("Type");
                    //如果小于1表示只有一个type，大于表示有多个type，则需要用数组来表示
                    if(typeList.getLength() < 2) {
                        Element type = (Element) typeList.item(0);
                        buffer.append(type.getTagName() + ":" + type.getAttribute("name") + "},");
                    } else {
                        buffer.append("Type:[");
                        for(int j = 0; j < typeList.getLength(); j ++) {
                            Element type = (Element) typeList.item(j);
                            if(j < typeList.getLength() - 1) {
                                buffer.append("{name:" + type.getAttribute("name") + "},");
                            } else {
                                buffer.append("{name:" + type.getAttribute("name") + "}");
                            }

                        }
                        buffer.append("]");
                        buffer.append("},");
                    }
                }
            }
            if(brandList.getLength() > 1) {
                buffer.append("]");
            }

            buffer.append("}");
            System.out.println(buffer.toString());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void xml2Simple() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/com/shixun/c22/phone.xml");
            //获取根节点
            Element root = doc.getDocumentElement();
            root.setAttribute(name,value);//设置某个属性值。如果有属性则修改，没有则添加
            root.setTextContent(value);//设置内容
            root.removeAttribute(name);//删除某个属性
            root.removeChild(oldChild);//删除某个子节点
            root.replaceChild(newChild,oldChild);//替换节点
            root.insertBefore(newChild,oldChild);//添加到old节点之前
            root.appendChild(newChild);//添加到最后一个位置

            System.out.println(root.getTagName());
            //遍历根节点下的所有子节点
            NodeList brandList = root.getElementsByTagName("Brand");
            for(int i = 0; i < brandList.getLength(); i ++) {
                if(brandList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    //获取Barand元素对象
                    Element barandEle = (Element) brandList.item(i);
                    //获取barand的子元素
                    NodeList typeList = barandEle.getElementsByTagName("Type");
                    for(int j = 0; j < typeList.getLength(); j ++) {
                        Element type = (Element) typeList.item(j);
                        System.out.println(barandEle.getTagName() + ":name = "
                                + barandEle.getAttribute("name") + "," + type.getTagName() + ":name=" + type.getAttribute("name"));
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args) {
        xml2Simple();


    }
}
