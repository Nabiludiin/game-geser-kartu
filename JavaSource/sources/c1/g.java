package c1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d1.a;
import d1.s;
import d1.t;
import d1.u;
import d1.v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: MyApplication */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f3483a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f3484b = Uri.parse("");

    /* compiled from: MyApplication */
    public interface a {
        void a(WebView webView, e eVar, Uri uri, boolean z7, c1.a aVar);
    }

    public static d a(WebView webView, String str, Set set) {
        if (s.V.d()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw s.a();
    }

    public static void b(WebView webView, String str, Set set, a aVar) {
        if (!s.U.d()) {
            throw s.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }
        Looper b8 = d1.g.b(webView);
        if (b8 == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + b8 + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return d1.d.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static v f() {
        return t.c();
    }

    private static PackageInfo g() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static u h(WebView webView) {
        return new u(d(webView));
    }

    public static String i() {
        if (s.X.d()) {
            return f().getStatics().getVariationsHeader();
        }
        throw s.a();
    }

    public static WebViewClient j(WebView webView) {
        a.e eVar = s.H;
        if (eVar.c()) {
            return d1.d.b(webView);
        }
        if (!eVar.d()) {
            throw s.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (s.R.d()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw s.a();
    }

    public static void l(WebView webView, String str) {
        if (!s.U.d()) {
            throw s.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z7) {
        if (!s.f23090f0.d()) {
            throw s.a();
        }
        h(webView).e(z7);
    }

    public static void n(WebView webView, String str) {
        if (!s.f23084c0.d()) {
            throw s.a();
        }
        h(webView).f(str);
    }
}
