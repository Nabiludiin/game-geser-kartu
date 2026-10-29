package d1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: MyApplication */
public class w implements v {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f23117a;

    public w(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f23117a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // d1.v
    public String[] a() {
        return this.f23117a.getSupportedFeatures();
    }

    @Override // d1.v
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) h7.a.a(WebViewProviderBoundaryInterface.class, this.f23117a.createWebView(webView));
    }

    @Override // d1.v
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) h7.a.a(ProfileStoreBoundaryInterface.class, this.f23117a.getProfileStore());
    }

    @Override // d1.v
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) h7.a.a(StaticsBoundaryInterface.class, this.f23117a.getStatics());
    }
}
