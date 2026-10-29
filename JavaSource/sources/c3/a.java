package c3;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.iy3;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.uy;
import java.util.List;
import java.util.Map;
import r2.t;
import s2.b0;
import v2.f2;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3485a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3486b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3487c;

    public a(Context context, w2.a aVar) {
        this.f3485a = context;
        this.f3486b = context.getPackageName();
        this.f3487c = aVar.f27051q;
    }

    public void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        t.g();
        map.put("device", f2.h0());
        map.put("app", this.f3486b);
        t.g();
        Context context = this.f3485a;
        map.put("is_lite_sdk", true != f2.i(context) ? "0" : "1");
        ly lyVar = uy.f17045a;
        List f8 = b0.b().f();
        if (((Boolean) b0.c().d(uy.s7)).booleanValue()) {
            f8.addAll(t.l().q().j().h());
        }
        map.put("e", TextUtils.join(",", f8));
        map.put("sdkVersion", this.f3487c);
        if (((Boolean) b0.c().d(uy.rc)).booleanValue()) {
            t.g();
            map.put("is_bstar", true != f2.f(context) ? "0" : "1");
        }
        if (((Boolean) b0.c().d(uy.va)).booleanValue()) {
            if (((Boolean) b0.c().d(uy.I2)).booleanValue()) {
                map.put("plugin", iy3.a(t.l().w()));
            }
        }
    }
}
