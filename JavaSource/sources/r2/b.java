package r2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.mg0;
import com.google.android.gms.internal.ads.vj0;
import java.util.Collections;
import java.util.List;
import v2.f2;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25784a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25785b;

    /* renamed from: c, reason: collision with root package name */
    private final vj0 f25786c;

    /* renamed from: d, reason: collision with root package name */
    private final mg0 f25787d = new mg0(false, Collections.EMPTY_LIST);

    public b(Context context, vj0 vj0Var, mg0 mg0Var) {
        this.f25784a = context;
        this.f25786c = vj0Var;
    }

    private final boolean d() {
        vj0 vj0Var = this.f25786c;
        return (vj0Var != null && vj0Var.a().f15650v) || this.f25787d.f12247q;
    }

    public final void a() {
        this.f25785b = true;
    }

    public final boolean b() {
        return !d() || this.f25785b;
    }

    public final void c(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            vj0 vj0Var = this.f25786c;
            if (vj0Var != null) {
                vj0Var.c(str, null, 3);
                return;
            }
            mg0 mg0Var = this.f25787d;
            if (!mg0Var.f12247q || (list = mg0Var.f12248r) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f25784a;
                    t.g();
                    f2.p(context, "", replace);
                }
            }
        }
    }
}
