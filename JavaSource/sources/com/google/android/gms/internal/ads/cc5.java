package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class cc5 implements tb5 {

    /* renamed from: a, reason: collision with root package name */
    public final sp5 f6370a;

    /* renamed from: d, reason: collision with root package name */
    public int f6373d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6374e;

    /* renamed from: c, reason: collision with root package name */
    public final List f6372c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f6371b = new Object();

    public cc5(aq5 aq5Var, boolean z7) {
        this.f6370a = new sp5(aq5Var, z7);
    }

    @Override // com.google.android.gms.internal.ads.tb5
    public final Object a() {
        return this.f6371b;
    }

    @Override // com.google.android.gms.internal.ads.tb5
    public final az b() {
        return this.f6370a.J();
    }

    public final void c(int i7) {
        this.f6373d = i7;
        this.f6374e = false;
        this.f6372c.clear();
    }
}
