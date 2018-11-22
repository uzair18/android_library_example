package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by muhammaduzair on 11/22/18.
 */

public class ToasterMessage
{

     public static void s(Context c, String message){

          Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

     }
}
