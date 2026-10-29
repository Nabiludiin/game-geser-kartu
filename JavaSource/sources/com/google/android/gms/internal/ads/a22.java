package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import k2.g;

/* compiled from: MyApplication */
public final class a22 {

    /* renamed from: a, reason: collision with root package name */
    private k2.g f4698a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.nativead.c f4699b;

    /* renamed from: c, reason: collision with root package name */
    private k2.x f4700c;

    /* renamed from: d, reason: collision with root package name */
    private k2.h f4701d = k2.h.f24400i;

    /* renamed from: e, reason: collision with root package name */
    private String f4702e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f4703f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f4704g = false;

    public a22() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.f4698a = ((g.a) new g.a().c(AdMobAdapter.class, bundle)).k();
    }

    public final String a() {
        return this.f4702e;
    }

    public final String b() {
        return this.f4703f;
    }

    public final k2.g c() {
        return this.f4698a;
    }

    public final k2.h d() {
        return this.f4701d;
    }

    public final com.google.android.gms.ads.nativead.c e() {
        return this.f4699b;
    }

    public final k2.x f() {
        return this.f4700c;
    }

    public final boolean g() {
        return this.f4704g;
    }

    public final void h(String str) {
        this.f4702e = str;
    }

    public final void i(String str) {
        this.f4703f = str;
    }

    public final void j(k2.g gVar) {
        this.f4698a = gVar;
    }

    public final void k(k2.h hVar) {
        this.f4701d = hVar;
    }

    public final void l(com.google.android.gms.ads.nativead.c cVar) {
        this.f4699b = cVar;
    }

    public final void m(k2.x xVar) {
        this.f4700c = xVar;
    }

    public final void n(boolean z7) {
        this.f4704g = z7;
    }
}
