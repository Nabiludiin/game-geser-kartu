package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: MyApplication */
public abstract class wo5 implements aq5 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f18359a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f18360b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final jq5 f18361c = new jq5();

    /* renamed from: d, reason: collision with root package name */
    private final em5 f18362d = new em5();

    /* renamed from: e, reason: collision with root package name */
    private Looper f18363e;

    /* renamed from: f, reason: collision with root package name */
    private az f18364f;

    /* renamed from: g, reason: collision with root package name */
    private ni5 f18365g;

    @Override // com.google.android.gms.internal.ads.aq5
    public /* synthetic */ az M() {
        return zp5.a(this);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public /* synthetic */ boolean U() {
        return zp5.b(this);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void a(yp5 yp5Var) {
        ArrayList arrayList = this.f18359a;
        arrayList.remove(yp5Var);
        if (!arrayList.isEmpty()) {
            e(yp5Var);
            return;
        }
        this.f18363e = null;
        this.f18364f = null;
        this.f18365g = null;
        this.f18360b.clear();
        p();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void c(kq5 kq5Var) {
        this.f18361c.c(kq5Var);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void d(yp5 yp5Var, kb4 kb4Var, ni5 ni5Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f18363e;
        boolean z7 = true;
        if (looper != null && looper != myLooper) {
            z7 = false;
        }
        rx3.a(z7);
        this.f18365g = ni5Var;
        az azVar = this.f18364f;
        this.f18359a.add(yp5Var);
        if (this.f18363e == null) {
            this.f18363e = myLooper;
            this.f18360b.add(yp5Var);
            n(kb4Var);
        } else if (azVar != null) {
            k(yp5Var);
            yp5Var.a(this, azVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void e(yp5 yp5Var) {
        HashSet hashSet = this.f18360b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(yp5Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        o();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void g(Handler handler, kq5 kq5Var) {
        this.f18361c.b(handler, kq5Var);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void j(Handler handler, fm5 fm5Var) {
        this.f18362d.b(handler, fm5Var);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void k(yp5 yp5Var) {
        this.f18363e.getClass();
        HashSet hashSet = this.f18360b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(yp5Var);
        if (isEmpty) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void l(fm5 fm5Var) {
        this.f18362d.c(fm5Var);
    }

    protected abstract void n(kb4 kb4Var);

    protected abstract void p();

    protected final void q(az azVar) {
        this.f18364f = azVar;
        ArrayList arrayList = this.f18359a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((yp5) arrayList.get(i7)).a(this, azVar);
        }
    }

    protected final jq5 s(xp5 xp5Var) {
        return this.f18361c.a(0, xp5Var);
    }

    protected final jq5 t(int i7, xp5 xp5Var) {
        return this.f18361c.a(0, xp5Var);
    }

    protected final em5 u(xp5 xp5Var) {
        return this.f18362d.a(0, xp5Var);
    }

    protected final em5 v(int i7, xp5 xp5Var) {
        return this.f18362d.a(0, xp5Var);
    }

    protected final boolean w() {
        return !this.f18360b.isEmpty();
    }

    protected final ni5 x() {
        ni5 ni5Var = this.f18365g;
        ni5Var.getClass();
        return ni5Var;
    }

    protected void m() {
    }

    protected void o() {
    }
}
