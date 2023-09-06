package top.lfy;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @author dfysa
 * @data 6/9/2023 下午4:32
 * @description
 */
@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config)throws SecurityException{
        System.out.println("DemoServlet init");

    }

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException, ServletException {

//        1. 返回一个网页
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter out=resp.getWriter();
//        out.print("<h2>123</h2>");
//        out.flush();
//        out.close();

        // 2. 返回一段JSON数据
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out=resp.getWriter();
        String jsonString = """
                {
                "name":"lfy"
                "age":19

                } """;
                out.print(jsonString);

                out.flush();
                out.close();


 //随机码
//        int len=4;
//        int fontSize=28;
//        int width = len *fontSize+10;
//        int height=50;
//        Random random=new Random();
//        String code=getCode();
//        BufferedImage bufferedImage= new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
//        Graphics g=bufferedImage.getGraphics();
//        g.setColor(Color.WHITE);
//        g.fillRect(0,0,width,height);
//        for (int i=0;i<200;i++){
//            g.setColor(new Color(0,0,0));
//            int X1=new Random().nextInt(width);
//            int Y1=new Random().nextInt(height);
//            int X2=new Random().nextInt(width);
//            int Y2=new Random().nextInt(height);
//            g.drawLine(X1,Y1,X2,Y2);
//            int x=new Random().nextInt(width);
//            int y=new Random().nextInt(height);
//            g.drawOval(x,y,1,1);
//        }
//        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
//        g.setColor(color);
//        g.setFont(new Font("宋体",Font.BOLD,fontSize));
//        for(int i=0;i<len;i++){
//            char c=code.charAt(i);
//            g.drawString(c+"",i*fontSize+5,fontSize);
//        }
//        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }
    @Override
    public void destroy() {
        System.out.println("DemoServlet destroy");
    }
//    private String getCode() {
//        Random random = new Random();
//        StringBuilder sb = new StringBuilder();
//        String r = "";
//        for (int i = 0; i < 4; i++) {
//            int type = random.nextInt(3);
//            switch(type) {
//                case 0:
//                    // 生成一个随机数字
//                    r = String.valueOf(random.nextInt(10));
//                    break;
//                case 1:
//                    // 生成一个随机大写字母
//                    r= String.valueOf((char)(random.nextInt(26) + 'A'));
//                    break;
//                case 2:
//                    // 生成一个随机小写字母
//                    r = String.valueOf((char)(random.nextInt(26) + 'a'));
//                    break;
//            }
//
//
//            sb.append(r);
//        }
//        return sb.toString();
//    }


}




