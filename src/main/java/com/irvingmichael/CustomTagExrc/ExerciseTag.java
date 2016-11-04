package com.irvingmichael.CustomTagExrc;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Aaron Anderson on 11/4/16.
 */
public class ExerciseTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        LocalDate now = LocalDate.now();

        out.println("<tap> <tap> Is this thing on?");
        out.println("On this, the " + now.getDayOfMonth() + " in the month of " + now.getMonth() + " in the year of our lord " + now.getYear());

        if (now.getMonthValue() == 10 && now.getDayOfMonth() == 31) {
            out.println("Happy Halloween!");
        } else if (now.getMonthValue() == 1 && now.getDayOfMonth() == 1) {
            out.println("Happy New Year!");
        }
    }
}
