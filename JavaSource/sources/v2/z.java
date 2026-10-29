package v2;

import android.content.Context;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.s70;
import com.google.android.gms.internal.ads.se3;
import com.google.android.gms.internal.ads.tf;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.uy;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class z extends uf {

    /* renamed from: c, reason: collision with root package name */
    private final Context f26895c;

    private z(Context context, tf tfVar) {
        super(tfVar);
        this.f26895c = context;
    }

    public static hf b(Context context) {
        hf hfVar = new hf(new bg(new File(se3.a().a(context.getCacheDir(), "admob_volley")), 20971520), new z(context, new gg(null, null)), 4);
        hfVar.a();
        return hfVar;
    }

    @Override // com.google.android.gms.internal.ads.uf, com.google.android.gms.internal.ads.ze
    public final cf a(gf gfVar) {
        if (gfVar.a() == 0) {
            if (Pattern.matches((String) s2.b0.c().d(uy.Z4), gfVar.n())) {
                Context context = this.f26895c;
                s2.z.a();
                if (w2.g.A(context, 13400000)) {
                    cf a8 = new s70(context).a(gfVar);
                    if (a8 != null) {
                        n1.k("Got gmscore asset response: ".concat(String.valueOf(gfVar.n())));
                        return a8;
                    }
                    n1.k("Failed to get gmscore asset response: ".concat(String.valueOf(gfVar.n())));
                }
            }
        }
        return super.a(gfVar);
    }
}
