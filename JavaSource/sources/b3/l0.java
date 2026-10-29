package b3;

import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.o32;
import com.google.android.gms.internal.ads.w85;
import com.google.android.gms.internal.ads.z33;

/* compiled from: MyApplication */
public final class l0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3286a;

    private l0(w85 w85Var, w85 w85Var2) {
        this.f3286a = w85Var2;
    }

    public static l0 c(w85 w85Var, w85 w85Var2) {
        return new l0(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k0 b() {
        return new k0(z33.c(), ((o32) this.f3286a).b());
    }
}
