package custom11.xiaoai.com.beautiful.utils;

import android.util.Log;

/**
 * Created by wangC on 2016/11/30.
 */

public class L {

    private static String tag="custom";

    public static boolean LogOpen=true;

    public  static  void e(String msg){
        if(LogOpen)
            Log.e(tag,msg);

    }
}
