package d1;

import android.os.Looper;
import android.webkit.WebView;

/* compiled from: MyApplication */
public abstract class g {
    public static ClassLoader a() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Looper b(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }
}
