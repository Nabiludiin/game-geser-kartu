package v2;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.i92;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.yr0;
import java.io.InputStream;
import java.util.Map;

/* compiled from: MyApplication */
public class g2 extends x2 {
    public g2() {
        super(null);
    }

    @Override // v2.x2
    public final CookieManager a(Context context) {
        r2.t.g();
        if (f2.j()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i7 = n1.f26802b;
            w2.p.d("Failed to obtain CookieManager.", th);
            r2.t.l().j(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // v2.x2
    public yr0 b(mr0 mr0Var, iu iuVar, boolean z7, i92 i92Var) {
        return new ct0(mr0Var, iuVar, z7, i92Var);
    }

    @Override // v2.x2
    public final WebResourceResponse c(String str, String str2, int i7, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i7, str3, map, inputStream);
    }
}
