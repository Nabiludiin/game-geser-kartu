package b3;

import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.ou0;
import com.google.android.gms.internal.ads.w85;
import com.google.android.gms.internal.ads.wx1;
import com.google.android.gms.internal.ads.z33;

/* compiled from: MyApplication */
public final class m1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3301a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3302b;

    private m1(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f3301a = w85Var;
        this.f3302b = w85Var2;
    }

    public static m1 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new m1(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new j1(((ou0) this.f3301a).a(), (wx1) this.f3302b.b(), z33.c());
    }
}
