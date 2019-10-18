package com.helb.noziv.weather48;

import android.content.Context;


public class Helper {

        public  static String getHour(String date){
            return date.substring(11,16);//+" H";


        }

        public static int getImageId(Context context, String imageName) {
            return context.getResources().getIdentifier("drawable/icon" + imageName, null, context.getPackageName());
        }
}
