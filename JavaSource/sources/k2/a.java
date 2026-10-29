package k2;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.List;
import s2.h3;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final h3 f24374a;

    protected a() {
        h3 h3Var = new h3();
        this.f24374a = h3Var;
        h3Var.i("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public a a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            w2.p.f(sb.toString());
        }
        this.f24374a.p(str, str2);
        return d();
    }

    public a b(String str) {
        this.f24374a.g(str);
        return d();
    }

    public a c(Class cls, Bundle bundle) {
        h3 h3Var = this.f24374a;
        h3Var.h(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            h3Var.j("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return d();
    }

    protected abstract a d();

    public a e(String str) {
        p3.o.n(str, "Content URL must be non-null.");
        p3.o.h(str, "Content URL must be non-empty.");
        int length = str.length();
        p3.o.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.f24374a.k(str);
        return d();
    }

    public a f(List list) {
        if (list == null) {
            w2.p.f("neighboring content URLs list should not be null");
            return d();
        }
        this.f24374a.l(list);
        return d();
    }

    public a g(String str) {
        this.f24374a.n(str);
        return d();
    }

    public final a h(String str) {
        this.f24374a.i(str);
        return d();
    }

    public final a i(boolean z7) {
        this.f24374a.o(z7);
        return d();
    }

    public final a j(boolean z7) {
        this.f24374a.r(z7);
        return d();
    }
}
