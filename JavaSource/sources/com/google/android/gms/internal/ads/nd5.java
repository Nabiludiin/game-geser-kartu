package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class nd5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12709a;

    /* renamed from: b, reason: collision with root package name */
    public final az f12710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12711c;

    /* renamed from: d, reason: collision with root package name */
    public final xp5 f12712d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12713e;

    /* renamed from: f, reason: collision with root package name */
    public final az f12714f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12715g;

    /* renamed from: h, reason: collision with root package name */
    public final xp5 f12716h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12717i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12718j;

    public nd5(long j7, az azVar, int i7, xp5 xp5Var, long j8, az azVar2, int i8, xp5 xp5Var2, long j9, long j10) {
        this.f12709a = j7;
        this.f12710b = azVar;
        this.f12711c = i7;
        this.f12712d = xp5Var;
        this.f12713e = j8;
        this.f12714f = azVar2;
        this.f12715g = i8;
        this.f12716h = xp5Var2;
        this.f12717i = j9;
        this.f12718j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nd5.class == obj.getClass()) {
            nd5 nd5Var = (nd5) obj;
            if (this.f12709a == nd5Var.f12709a && this.f12711c == nd5Var.f12711c && this.f12713e == nd5Var.f12713e && this.f12715g == nd5Var.f12715g && this.f12717i == nd5Var.f12717i && this.f12718j == nd5Var.f12718j && Objects.equals(this.f12710b, nd5Var.f12710b) && Objects.equals(this.f12712d, nd5Var.f12712d) && Objects.equals(this.f12714f, nd5Var.f12714f) && Objects.equals(this.f12716h, nd5Var.f12716h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12709a), this.f12710b, Integer.valueOf(this.f12711c), this.f12712d, Long.valueOf(this.f12713e), this.f12714f, Integer.valueOf(this.f12715g), this.f12716h, Long.valueOf(this.f12717i), Long.valueOf(this.f12718j));
    }
}
