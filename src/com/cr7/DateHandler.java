package com.cr7;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateHandler extends SimpleTagSupport {

	private JspContext jspContext;
	private String inputStyle;

	@Override
	public void setJspContext(JspContext jspContext) {
		this.jspContext = jspContext;
	}

	/**
	 * @param inputStyle the inputStyle to set
	 */
	public void setInputStyle(String inputStyle) {
		this.inputStyle = inputStyle;
	}

	@Override
	public void doTag() throws JspException {
		try {
			SimpleDateFormat df = new SimpleDateFormat(inputStyle);
			Date date = new Date();
			String newDate = df.format(date);
			jspContext.getOut().println(newDate);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}

}
