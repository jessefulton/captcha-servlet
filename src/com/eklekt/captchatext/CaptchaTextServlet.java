package com.eklekt.captchatext;


import java.io.IOException;
import javax.servlet.http.*;
import nl.captcha.Captcha;
import nl.captcha.backgrounds.SquigglesBackgroundProducer;
import nl.captcha.servlet.CaptchaServletUtil;

@SuppressWarnings("serial")
public class CaptchaTextServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String text = req.getParameter("text");
		Captcha captcha = new Captcha.Builder((25*text.length()), 50)
        .addText(new CustomizableTextProducer(text))
        //.addNoise()
        .gimp()
        //.addBackground(new SquigglesBackgroundProducer())
        //.addNoise()
        //.addNoise()
        .build();
       CaptchaServletUtil.writeImage(resp, captcha.getImage());
	}
}
