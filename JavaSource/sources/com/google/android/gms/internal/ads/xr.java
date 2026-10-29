package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: MyApplication */
public final class xr {

    /* renamed from: a, reason: collision with root package name */
    private final int f18960a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18961b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18962c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18963d;

    /* renamed from: e, reason: collision with root package name */
    private final ms f18964e;

    /* renamed from: f, reason: collision with root package name */
    private final us f18965f;

    /* renamed from: n, reason: collision with root package name */
    private int f18973n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f18966g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f18967h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f18968i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f18969j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f18970k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f18971l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f18972m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f18974o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f18975p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f18976q = "";

    public xr(int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z7) {
        this.f18960a = i7;
        this.f18961b = i8;
        this.f18962c = i9;
        this.f18963d = z7;
        this.f18964e = new ms(i10);
        this.f18965f = new us(i11, i12, i13);
    }

    private final void m(String str, boolean z7, float f8, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f18962c) {
                return;
            }
            synchronized (this.f18966g) {
                try {
                    this.f18967h.add(str);
                    this.f18970k += str.length();
                    if (z7) {
                        this.f18968i.add(str);
                        this.f18969j.add(new is(f8, f9, f10, f11, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String n(ArrayList arrayList, int i7) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            sb.append((String) arrayList.get(i8));
            sb.append(' ');
            i8++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean a() {
        boolean z7;
        synchronized (this.f18966g) {
            z7 = this.f18972m == 0;
        }
        return z7;
    }

    public final String b() {
        return this.f18974o;
    }

    public final String c() {
        return this.f18976q;
    }

    public final void d() {
        synchronized (this.f18966g) {
            this.f18972m--;
        }
    }

    public final void e() {
        synchronized (this.f18966g) {
            this.f18972m++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((xr) obj).f18974o;
        return str != null && str.equals(this.f18974o);
    }

    public final void f(String str, boolean z7, float f8, float f9, float f10, float f11) {
        m(str, z7, f8, f9, f10, f11);
        synchronized (this.f18966g) {
            try {
                if (this.f18972m < 0) {
                    int i7 = v2.n1.f26802b;
                    w2.p.a("ActivityContent: negative number of WebViews.");
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, boolean z7, float f8, float f9, float f10, float f11) {
        m(str, z7, f8, f9, f10, f11);
    }

    public final void h() {
        synchronized (this.f18966g) {
            try {
                int j7 = j(this.f18970k, this.f18971l);
                if (j7 > this.f18973n) {
                    this.f18973n = j7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int hashCode() {
        return this.f18974o.hashCode();
    }

    public final void i() {
        synchronized (this.f18966g) {
            try {
                int j7 = j(this.f18970k, this.f18971l);
                if (j7 > this.f18973n) {
                    this.f18973n = j7;
                    if (!r2.t.l().q().d()) {
                        ms msVar = this.f18964e;
                        this.f18974o = msVar.a(this.f18967h);
                        this.f18975p = msVar.a(this.f18968i);
                    }
                    if (!r2.t.l().q().c()) {
                        this.f18976q = this.f18965f.a(this.f18968i, this.f18969j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final int j(int i7, int i8) {
        return this.f18963d ? this.f18961b : (i7 * this.f18960a) + (i8 * this.f18961b);
    }

    public final void k(int i7) {
        this.f18971l = i7;
    }

    final int l() {
        return this.f18970k;
    }

    public final String toString() {
        ArrayList arrayList = this.f18967h;
        int i7 = this.f18971l;
        int i8 = this.f18973n;
        int i9 = this.f18970k;
        String n7 = n(arrayList, 100);
        String n8 = n(this.f18968i, 100);
        String str = this.f18974o;
        String str2 = this.f18975p;
        String str3 = this.f18976q;
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(i8).length();
        int length3 = String.valueOf(i9).length();
        int length4 = String.valueOf(n7).length();
        int length5 = String.valueOf(n8).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i7);
        sb.append(" score:");
        sb.append(i8);
        sb.append(" total_length:");
        sb.append(i9);
        sb.append("\n text: ");
        sb.append(n7);
        sb.append("\n viewableText");
        sb.append(n8);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
