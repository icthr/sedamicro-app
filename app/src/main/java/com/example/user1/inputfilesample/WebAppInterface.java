package com.example.user1.inputfilesample;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 <input type="button" value="Say hello" onClick="showAndroidToast('Hello Android!')" />

 <script type="text/javascript">
 function showAndroidToast(toast) {
 Android.showToast(toast);
 }
 </script>
 */
public class WebAppInterface {
    public WebAppInterface(MainActivityFragment mainActivityFragment) {
    }
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
