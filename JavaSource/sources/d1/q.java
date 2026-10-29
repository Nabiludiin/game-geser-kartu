package d1;

import android.net.Uri;
import android.webkit.WebView;
import c1.g;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: MyApplication */
public class q implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f23077a;

    public q(g.a aVar) {
        this.f23077a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z7, InvocationHandler invocationHandler2) {
        c1.e b8 = p.b((WebMessageBoundaryInterface) h7.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b8 != null) {
            this.f23077a.a(webView, b8, uri, z7, k.b(invocationHandler2));
        }
    }
}
