package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public final class db {

    /* renamed from: f, reason: collision with root package name */
    private int f7026f;

    /* renamed from: h, reason: collision with root package name */
    private int f7028h;

    /* renamed from: n, reason: collision with root package name */
    private float f7034n;

    /* renamed from: a, reason: collision with root package name */
    private String f7021a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f7022b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f7023c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f7024d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f7025e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7027g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7029i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f7030j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f7031k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f7032l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f7033m = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f7035o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7036p = false;

    private static int a(int i7, String str, String str2, int i8) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i8;
        }
        return -1;
    }

    public final boolean A() {
        return this.f7036p;
    }

    public final void b(String str) {
        this.f7021a = str;
    }

    public final void c(String str) {
        this.f7022b = str;
    }

    public final void d(String[] strArr) {
        this.f7023c = new HashSet(Arrays.asList(strArr));
    }

    public final void e(String str) {
        this.f7024d = str;
    }

    public final int f(String str, String str2, Set set, String str3) {
        if (this.f7021a.isEmpty() && this.f7022b.isEmpty() && this.f7023c.isEmpty() && this.f7024d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a8 = a(a(a(0, this.f7021a, str, 1073741824), this.f7022b, str2, 2), this.f7024d, str3, 4);
        if (a8 == -1 || !set.containsAll(this.f7023c)) {
            return 0;
        }
        return a8 + (this.f7023c.size() * 4);
    }

    public final int g() {
        int i7 = this.f7031k;
        if (i7 == -1 && this.f7032l == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f7032l == 1 ? 2 : 0);
    }

    public final boolean h() {
        return this.f7030j == 1;
    }

    public final db i(boolean z7) {
        this.f7030j = 1;
        return this;
    }

    public final db j(boolean z7) {
        this.f7031k = 1;
        return this;
    }

    public final db k(boolean z7) {
        this.f7032l = 1;
        return this;
    }

    public final String l() {
        return this.f7025e;
    }

    public final db m(String str) {
        this.f7025e = zw3.a(str);
        return this;
    }

    public final int n() {
        if (this.f7027g) {
            return this.f7026f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final db o(int i7) {
        this.f7026f = i7;
        this.f7027g = true;
        return this;
    }

    public final boolean p() {
        return this.f7027g;
    }

    public final int q() {
        if (this.f7029i) {
            return this.f7028h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final db r(int i7) {
        this.f7028h = i7;
        this.f7029i = true;
        return this;
    }

    public final boolean s() {
        return this.f7029i;
    }

    public final db t(float f8) {
        this.f7034n = f8;
        return this;
    }

    public final db u(int i7) {
        this.f7033m = i7;
        return this;
    }

    public final int v() {
        return this.f7033m;
    }

    public final float w() {
        return this.f7034n;
    }

    public final db x(int i7) {
        this.f7035o = i7;
        return this;
    }

    public final int y() {
        return this.f7035o;
    }

    public final db z(boolean z7) {
        this.f7036p = z7;
        return this;
    }
}
