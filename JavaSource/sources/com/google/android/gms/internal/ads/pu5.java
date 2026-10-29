package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class pu5 {

    /* renamed from: a, reason: collision with root package name */
    private String f14115a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f14116b;

    /* renamed from: c, reason: collision with root package name */
    private final b f14117c = new b();

    /* renamed from: d, reason: collision with root package name */
    private final List f14118d;

    /* renamed from: e, reason: collision with root package name */
    private final w04 f14119e;

    /* renamed from: f, reason: collision with root package name */
    private final m3 f14120f;

    /* renamed from: g, reason: collision with root package name */
    private final l7 f14121g;

    public pu5() {
        w04.m();
        this.f14118d = Collections.EMPTY_LIST;
        this.f14119e = w04.m();
        this.f14120f = new m3();
        this.f14121g = l7.f11433d;
    }

    public final pu5 a(String str) {
        this.f14115a = str;
        return this;
    }

    public final pu5 b(Uri uri) {
        this.f14116b = uri;
        return this;
    }

    public final j9 c() {
        m5 m5Var;
        Uri uri = this.f14116b;
        byte[] bArr = null;
        if (uri != null) {
            m5Var = new m5(uri, null, null, null, this.f14118d, null, this.f14119e, null, -9223372036854775807L, null);
        } else {
            m5Var = null;
        }
        String str = this.f14115a;
        if (str == null) {
            str = "";
        }
        return new j9(str, new i1(this.f14117c, null), m5Var, new n4(this.f14120f, bArr), jc.B, this.f14121g, null);
    }
}
