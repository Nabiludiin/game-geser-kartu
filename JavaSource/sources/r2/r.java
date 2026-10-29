package r2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.i00;
import java.util.Map;
import java.util.TreeMap;
import s2.b5;
import v2.n1;

/* compiled from: MyApplication */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25822a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25823b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f25824c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f25825d;

    /* renamed from: e, reason: collision with root package name */
    private String f25826e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25827f;

    public r(Context context, String str) {
        String concat;
        this.f25822a = context.getApplicationContext();
        this.f25823b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = u3.e.a(context).f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e8) {
            int i7 = n1.f26802b;
            w2.p.d("Unable to get package version name for reporting", e8);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f25827f = concat;
    }

    public final String a() {
        return this.f25826e;
    }

    public final String b() {
        return this.f25825d;
    }

    public final String c() {
        return this.f25823b;
    }

    public final String d() {
        return this.f25827f;
    }

    public final Map e() {
        return this.f25824c;
    }

    public final void f(b5 b5Var, w2.a aVar) {
        this.f25825d = b5Var.f26065z.f26212q;
        Bundle bundle = b5Var.C;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) i00.f9780c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f25826e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f25824c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        Map map = this.f25824c;
        map.put("SDKVersion", aVar.f27051q);
        if (((Boolean) i00.f9778a.e()).booleanValue()) {
            Bundle b8 = v2.d.b(this.f25822a, (String) i00.f9779b.e());
            for (String str3 : b8.keySet()) {
                map.put(str3, b8.get(str3).toString());
            }
        }
    }
}
