package com.shixun.servlet.vp;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Administrator on 2016/4/5.
 */
public class ImageServlet extends HttpServlet {
    private static final char CHARES [] = {'a','b','c','d','e','f','j','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
            'S','T','U','V','W','X','Y','Z'
    };
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("image/jpeg");
        ServletOutputStream sos = response.getOutputStream();

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        //1. 创建buffer
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_RGB);
        //2. 获取环境
        Graphics2D graphics2D = (Graphics2D) image.getGraphics();
        char[] newChar = new char[5];
        //3. 生成随机字符
        for (int i = 0; i < 4; i++) {
            int random = (int) (Math.random() * CHARES.length);
            newChar[i] = CHARES[random];
        }
        //绘制背景
        graphics2D.setColor(new Color(0xDCDCDC));
        graphics2D.fillRect(0, 0, 300, 100);
        for (int i = 0; i < 120; i++) {
            int x = (int) (Math.random() * 300);
            int y = (int) (Math.random() * 100);
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            graphics2D.setColor(new Color(red, green, blue));
            graphics2D.drawOval(x, y, 1, 0);

            //绘制字符
            Random random = new Random();
            red = random.nextInt(110);
            green = random.nextInt(50);
            blue = random.nextInt(50);
            graphics2D.setColor(new Color(red, green, blue));
            graphics2D.setFont(new Font(null, Font.ITALIC | Font.BOLD, 18));
            graphics2D.drawString("" + newChar[0], 1, 17);
            graphics2D.drawString("" + newChar[1], 16, 15);
            graphics2D.drawString("" + newChar[2], 31, 18);
            graphics2D.drawString("" + newChar[3], 46, 16);

            graphics2D.dispose();

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(image, "JPEG", bos);
            byte[] buf = bos.toByteArray();
            response.setContentLength(buf.length);
            sos.write(buf);
            bos.close();
            sos.close();
            session.setAttribute("randomCode", new String(newChar));

        }

        System.out.println("doGet.....");
    }
}
