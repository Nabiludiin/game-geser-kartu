package b3;

import android.os.Bundle;
import com.google.android.gms.internal.ads.a91;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.f53;
import com.google.android.gms.internal.ads.fj1;
import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.n91;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.v85;
import com.google.android.gms.internal.ads.w85;
import com.google.android.gms.internal.ads.yw1;
import com.google.android.gms.internal.ads.z43;
import com.google.android.gms.internal.ads.z81;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class i0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3254a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3255b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f3256c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f3257d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f3258e;

    /* renamed from: f, reason: collision with root package name */
    private final w85 f3259f;

    /* renamed from: g, reason: collision with root package name */
    private final w85 f3260g;

    /* renamed from: h, reason: collision with root package name */
    private final w85 f3261h;

    /* renamed from: i, reason: collision with root package name */
    private final w85 f3262i;

    private i0(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9) {
        this.f3254a = w85Var;
        this.f3255b = w85Var2;
        this.f3256c = w85Var3;
        this.f3257d = w85Var4;
        this.f3258e = w85Var5;
        this.f3259f = w85Var6;
        this.f3260g = w85Var7;
        this.f3261h = w85Var8;
        this.f3262i = w85Var9;
    }

    public static i0 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8, w85 w85Var9) {
        return new i0(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8, w85Var9);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        a5.d i7;
        w wVar = (w) this.f3254a.b();
        f53 f53Var = (f53) this.f3255b.b();
        k0 b8 = ((l0) this.f3256c).b();
        z81 b9 = ((a91) this.f3257d).b();
        fj1 fj1Var = (fj1) this.f3258e.b();
        c0 c0Var = (c0) this.f3259f.b();
        al0 al0Var = (al0) this.f3260g.b();
        int intValue = ((Integer) this.f3261h.b()).intValue();
        Bundle bundle = ((n91) this.f3262i).a().f17974t;
        m0 m0Var = null;
        if (intValue == 1 && al0Var != null) {
            bundle.putLong(yw1.READ_FROM_DISK_START.c(), r2.t.o().a());
            m0Var = c0Var.b(al0Var, wVar, bundle);
            bundle.putLong(yw1.READ_FROM_DISK_END.c(), r2.t.o().a());
        }
        if (m0Var != null) {
            fj1Var.U0(m0Var);
            i7 = p64.a(m0Var);
        } else {
            i7 = f53Var.a(z43.GENERATE_SIGNALS, b9.b()).c(b8).h(((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS).i();
            p64.r(i7, new y(fj1Var), cm0.f6500a);
        }
        v85.b(i7);
        return i7;
    }
}
