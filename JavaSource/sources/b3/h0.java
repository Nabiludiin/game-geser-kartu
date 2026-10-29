package b3;

import com.google.android.gms.internal.ads.hi1;
import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.w85;
import com.google.android.gms.internal.ads.z33;
import com.google.android.gms.internal.ads.z64;

/* compiled from: MyApplication */
public final class h0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3247a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3248b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f3249c;

    private h0(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f3247a = w85Var;
        this.f3248b = w85Var2;
        this.f3249c = w85Var4;
    }

    public static h0 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new h0(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Object obj = (r1) this.f3247a.b();
        Object obj2 = (o0) this.f3248b.b();
        z64 c8 = z33.c();
        if (((Integer) this.f3249c.b()).intValue() == 2) {
            obj = obj2;
        }
        return new hi1(obj, c8);
    }
}
