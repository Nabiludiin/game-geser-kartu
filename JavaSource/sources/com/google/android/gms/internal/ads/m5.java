package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: MyApplication */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12074d;

    /* renamed from: e, reason: collision with root package name */
    public final w04 f12075e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12076f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12077g;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ m5(Uri uri, String str, k2 k2Var, ot5 ot5Var, List list, String str2, w04 w04Var, Object obj, long j7, byte[] bArr) {
        this.f12071a = uri;
        int i7 = th.f16194c;
        this.f12072b = null;
        this.f12073c = list;
        this.f12074d = null;
        this.f12075e = w04Var;
        int i8 = w04.f17978s;
        t04 t04Var = new t04();
        if (w04Var.size() > 0) {
            android.support.v4.media.session.b.a(w04Var.get(0));
            throw null;
        }
        t04Var.j();
        this.f12076f = null;
        this.f12077g = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return this.f12071a.equals(m5Var.f12071a) && this.f12073c.equals(m5Var.f12073c) && this.f12075e.equals(m5Var.f12075e);
    }

    public final int hashCode() {
        return (int) (((((((this.f12071a.hashCode() * 923521) + this.f12073c.hashCode()) * 961) + this.f12075e.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
