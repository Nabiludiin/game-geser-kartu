package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class ud3 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16724a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f16725b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f16726c;

    /* renamed from: d, reason: collision with root package name */
    private cq3 f16727d;

    protected ud3(boolean z7) {
        this.f16724a = z7;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
        kb4Var.getClass();
        ArrayList arrayList = this.f16725b;
        if (arrayList.contains(kb4Var)) {
            return;
        }
        arrayList.add(kb4Var);
        this.f16726c++;
    }

    protected final void c(cq3 cq3Var) {
        for (int i7 = 0; i7 < this.f16726c; i7++) {
            ((kb4) this.f16725b.get(i7)).d(this, cq3Var, this.f16724a);
        }
    }

    protected final void e(cq3 cq3Var) {
        this.f16727d = cq3Var;
        for (int i7 = 0; i7 < this.f16726c; i7++) {
            ((kb4) this.f16725b.get(i7)).p(this, cq3Var, this.f16724a);
        }
    }

    protected final void f(int i7) {
        cq3 cq3Var = this.f16727d;
        String str = hi2.f9535a;
        for (int i8 = 0; i8 < this.f16726c; i8++) {
            ((kb4) this.f16725b.get(i8)).i(this, cq3Var, this.f16724a, i7);
        }
    }

    protected final void g() {
        cq3 cq3Var = this.f16727d;
        String str = hi2.f9535a;
        for (int i7 = 0; i7 < this.f16726c; i7++) {
            ((kb4) this.f16725b.get(i7)).l(this, cq3Var, this.f16724a);
        }
        this.f16727d = null;
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public /* synthetic */ Map i() {
        return xl3.a(this);
    }
}
