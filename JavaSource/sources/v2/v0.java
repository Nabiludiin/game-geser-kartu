package v2;

import android.content.Context;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.n73;
import com.google.android.gms.internal.ads.o73;

/* compiled from: MyApplication */
public final class v0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final w2.v f26868c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26869d;

    /* renamed from: e, reason: collision with root package name */
    private final w2.w f26870e;

    public v0(Context context, String str, String str2, o73 o73Var, w2.w wVar) {
        this.f26868c = new w2.v(context, r2.t.g().Q(context, str));
        this.f26869d = str2;
        this.f26870e = wVar;
    }

    @Override // v2.b0
    public final void a() {
        w2.w wVar = this.f26870e;
        if (wVar == null) {
            this.f26868c.c(this.f26869d, null);
        } else {
            new n73(wVar.a(), this.f26868c, cm0.f6504e, null, null).a(this.f26869d);
        }
    }
}
