package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class yd0 implements u2.c0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ zzbub f19514q;

    yd0(zzbub zzbubVar) {
        Objects.requireNonNull(zzbubVar);
        this.f19514q = zzbubVar;
    }

    @Override // u2.c0
    public final void C7() {
        w2.p.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // u2.c0
    public final void H2() {
        w2.p.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // u2.c0
    public final void M5() {
        w2.p.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // u2.c0
    public final void P4() {
        w2.p.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // u2.c0
    public final void T5() {
        w2.p.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // u2.c0
    public final void V5(int i7) {
        w2.p.a("AdMobCustomTabsAdapter overlay is closed.");
        zzbub zzbubVar = this.f19514q;
        zzbubVar.b().q(zzbubVar);
    }

    @Override // u2.c0
    public final void Z4() {
        w2.p.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // u2.c0
    public final void a4() {
        w2.p.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // u2.c0
    public final void g() {
        w2.p.a("Opening AdMobCustomTabsAdapter overlay.");
        zzbub zzbubVar = this.f19514q;
        zzbubVar.b().s(zzbubVar);
    }

    @Override // u2.c0
    public final void v3() {
        w2.p.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // u2.c0
    public final void t7() {
    }
}
