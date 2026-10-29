package d1;

import android.webkit.WebViewClient;
import c1.g;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: MyApplication */
public class u {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f23116a;

    public u(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f23116a = webViewProviderBoundaryInterface;
    }

    public n a(String str, String[] strArr) {
        return n.a(this.f23116a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, g.a aVar) {
        this.f23116a.addWebMessageListener(str, strArr, h7.a.c(new q(aVar)));
    }

    public WebViewClient c() {
        return this.f23116a.getWebViewClient();
    }

    public void d(String str) {
        this.f23116a.removeWebMessageListener(str);
    }

    public void e(boolean z7) {
        this.f23116a.setAudioMuted(z7);
    }

    public void f(String str) {
        this.f23116a.setProfile(str);
    }
}
