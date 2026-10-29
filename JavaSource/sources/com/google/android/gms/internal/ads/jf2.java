package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class jf2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10529a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10530b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10531c;

    private jf2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f10529a = w85Var;
        this.f10530b = w85Var2;
        this.f10531c = w85Var3;
    }

    public static jf2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new jf2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new if2((Context) this.f10529a.b(), (Executor) this.f10530b.b(), (st1) this.f10531c.b());
    }
}
