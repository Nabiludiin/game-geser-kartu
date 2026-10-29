package b3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.ey;
import com.google.android.gms.internal.ads.g14;
import com.google.android.gms.internal.ads.uy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3203a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f3204b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3205c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f3206d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f3207e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f3208f = new AtomicBoolean(false);

    a1(Context context, ey eyVar, List list, w2.a aVar) {
        this.f3203a = context;
        this.f3204b = context.getApplicationInfo();
        this.f3205c = list;
        this.f3206d = aVar;
    }

    public final void a(WebView webView) {
        if (this.f3208f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            ApplicationInfo applicationInfo = this.f3204b;
            if (applicationInfo != null) {
                packageInfo = u3.e.a(this.f3203a).f(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                JSONObject jSONObject = this.f3207e;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e8) {
                r2.t.l().i(e8, "PawAppSignalGenerator.initialize");
            }
        }
        ApplicationInfo applicationInfo2 = this.f3204b;
        if (applicationInfo2 != null) {
            this.f3207e.put("pn", applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.f3207e;
        List list = this.f3205c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) s2.b0.c().d(uy.Pa)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.f3206d.f27051q);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) b10.f5452b.e()).booleanValue() && c1.h.a("DOCUMENT_START_SCRIPT") && webView != null) {
            c1.g.a(webView, String.format(Locale.getDefault(), (String) s2.b0.c().d(uy.Oa), b()), g14.m("*"));
        }
    }

    public final JSONObject b() {
        if (!this.f3208f.get()) {
            a(null);
        }
        return this.f3207e;
    }
}
