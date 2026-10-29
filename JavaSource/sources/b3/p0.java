package b3;

import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.w85;

/* compiled from: MyApplication */
public final class p0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3317a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3318b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f3319c;

    private p0(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f3317a = w85Var;
        this.f3318b = w85Var2;
        this.f3319c = w85Var3;
    }

    public static p0 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new p0(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new o0((c0) this.f3317a.b(), ((Integer) this.f3318b.b()).intValue(), (String) this.f3319c.b());
    }
}
