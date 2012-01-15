package com.eklekt.captchatext;


import java.io.IOException;
import javax.servlet.http.*;
import nl.captcha.Captcha;
import nl.captcha.gimpy.*;
import nl.captcha.servlet.CaptchaServletUtil;

@SuppressWarnings("serial")
public class CaptchaTextServlet extends HttpServlet {
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		//resp.setContentType("text/plain");
		//resp.getWriter().println("Hello, world");
		
		Captcha captcha = new Captcha.Builder(200, 50)
        .addText(new CustomizableTextProducer("captcha"))
        .gimp()
        .addNoise()
        .addNoise()
        .addNoise()
        .addBackground()
        .build();
       CaptchaServletUtil.writeImage(resp, captcha.getImage());
	}
}
