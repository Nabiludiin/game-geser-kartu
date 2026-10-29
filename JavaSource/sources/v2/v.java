package v2;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class v extends s2.j2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Context f26866q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y f26867r;

    v(y yVar, Context context) {
        this.f26866q = context;
        Objects.requireNonNull(yVar);
        this.f26867r = yVar;
    }

    @Override // s2.k2
    public final void T0(s2.x2 x2Var) {
        if (x2Var == null) {
            return;
        }
        this.f26867r.n(this.f26866q, x2Var.f26260r, true, true);
    }
}
