package com.sensedia.mentoria.factory.utils;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class MentoriaUtils {
    public double toTwoDecimalPlaces(double number){
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(number).replace(',','.'));
    }
}
