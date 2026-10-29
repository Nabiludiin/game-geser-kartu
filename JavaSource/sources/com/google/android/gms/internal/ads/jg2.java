package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: MyApplication */
public final class jg2 implements r2.g {

    /* renamed from: a, reason: collision with root package name */
    private r2.g f10537a;

    @Override // r2.g
    public final synchronized void a(View view) {
        r2.g gVar = this.f10537a;
        if (gVar != null) {
            gVar.a(view);
        }
    }

    @Override // r2.g
    public final synchronized void b() {
        r2.g gVar = this.f10537a;
        if (gVar != null) {
            gVar.b();
        }
    }

    public final synchronized void c(r2.g gVar) {
        this.f10537a = gVar;
    }

    @Override // r2.g
    public final synchronized void d() {
        r2.g gVar = this.f10537a;
        if (gVar != null) {
            gVar.d();
        }
    }
}
