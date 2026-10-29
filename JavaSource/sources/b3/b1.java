package b3;

import com.google.android.gms.internal.ads.ev0;
import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.ou0;
import com.google.android.gms.internal.ads.w85;
import com.google.android.gms.internal.ads.xm2;
import com.google.android.gms.internal.ads.zx0;

/* compiled from: MyApplication */
public final class b1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3214a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3215b;

    private b1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f3214a = w85Var;
        this.f3215b = w85Var4;
    }

    public static b1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new b1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new a1(((ou0) this.f3214a).a(), zx0.a(), xm2.c(), ((ev0) this.f3215b).a());
    }
}
