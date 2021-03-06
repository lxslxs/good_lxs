package com.dataup.ccc.web.util;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;


public class BindingInitializer implements WebBindingInitializer {

    public void initBinder(WebDataBinder binder, WebRequest request) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,  new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(Timestamp.class, new CustomTimeNativeEditor(null, true));
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
        binder.registerCustomEditor(byte.class, null,new CustomNumNativeEditor(Integer.class, true));
        binder.registerCustomEditor(int.class, null,new CustomNumNativeEditor(Integer.class, true));
        binder.registerCustomEditor(long.class, null,new CustomNumNativeEditor(Long.class, true));
        binder.registerCustomEditor(float.class, null,new CustomNumNativeEditor(Long.class, true));
        binder.registerCustomEditor(double.class, null,new CustomNumNativeEditor(Long.class, true));
        binder.registerCustomEditor(boolean.class, null,new CustomNumNativeEditor(Long.class, true));
        binder.registerCustomEditor(boolean.class, null,new CustomBooleanEditor(null, true));
        
    }
}

