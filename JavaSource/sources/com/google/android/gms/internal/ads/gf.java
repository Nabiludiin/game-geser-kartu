package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class gf implements Comparable {
    private ff A;
    private final ue B;

    /* renamed from: q, reason: collision with root package name */
    private final qf f8869q;

    /* renamed from: r, reason: collision with root package name */
    private final int f8870r;

    /* renamed from: s, reason: collision with root package name */
    private final String f8871s;

    /* renamed from: t, reason: collision with root package name */
    private final int f8872t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f8873u;

    /* renamed from: v, reason: collision with root package name */
    private final jf f8874v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f8875w;

    /* renamed from: x, reason: collision with root package name */
    private hf f8876x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8877y;

    /* renamed from: z, reason: collision with root package name */
    private pe f8878z;

    public gf(int i7, String str, jf jfVar) {
        Uri parse;
        String host;
        this.f8869q = qf.f14418c ? new qf() : null;
        this.f8873u = new Object();
        int i8 = 0;
        this.f8877y = false;
        this.f8878z = null;
        this.f8870r = i7;
        this.f8871s = str;
        this.f8874v = jfVar;
        this.B = new ue();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i8 = host.hashCode();
        }
        this.f8872t = i8;
    }

    final void A(ff ffVar) {
        synchronized (this.f8873u) {
            this.A = ffVar;
        }
    }

    final void B(lf lfVar) {
        ff ffVar;
        synchronized (this.f8873u) {
            ffVar = this.A;
        }
        if (ffVar != null) {
            ffVar.b(this, lfVar);
        }
    }

    final void C() {
        ff ffVar;
        synchronized (this.f8873u) {
            ffVar = this.A;
        }
        if (ffVar != null) {
            ffVar.a(this);
        }
    }

    final /* synthetic */ qf D() {
        return this.f8869q;
    }

    public final ue E() {
        return this.B;
    }

    public final int a() {
        return this.f8870r;
    }

    public final int c() {
        return this.f8872t;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8875w.intValue() - ((gf) obj).f8875w.intValue();
    }

    public final void d(String str) {
        if (qf.f14418c) {
            this.f8869q.a(str, Thread.currentThread().getId());
        }
    }

    final void j(String str) {
        hf hfVar = this.f8876x;
        if (hfVar != null) {
            hfVar.c(this);
        }
        if (qf.f14418c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new ef(this, str, id));
                return;
            }
            qf qfVar = this.f8869q;
            qfVar.a(str, id);
            qfVar.b(toString());
        }
    }

    final void k(int i7) {
        hf hfVar = this.f8876x;
        if (hfVar != null) {
            hfVar.d(this, i7);
        }
    }

    public final gf l(hf hfVar) {
        this.f8876x = hfVar;
        return this;
    }

    public final gf m(int i7) {
        this.f8875w = Integer.valueOf(i7);
        return this;
    }

    public final String n() {
        return this.f8871s;
    }

    public final String o() {
        int i7 = this.f8870r;
        String str = this.f8871s;
        if (i7 == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final gf p(pe peVar) {
        this.f8878z = peVar;
        return this;
    }

    public final pe q() {
        return this.f8878z;
    }

    public final boolean r() {
        synchronized (this.f8873u) {
        }
        return false;
    }

    public Map s() {
        return Collections.EMPTY_MAP;
    }

    public byte[] t() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f8872t));
        r();
        Integer num = this.f8875w;
        String str = this.f8871s;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(length + 5 + concat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int u() {
        return this.B.a();
    }

    public final void v() {
        synchronized (this.f8873u) {
            this.f8877y = true;
        }
    }

    public final boolean w() {
        boolean z7;
        synchronized (this.f8873u) {
            z7 = this.f8877y;
        }
        return z7;
    }

    protected abstract lf x(cf cfVar);

    protected abstract void y(Object obj);

    public final void z(of ofVar) {
        jf jfVar;
        synchronized (this.f8873u) {
            jfVar = this.f8874v;
        }
        jfVar.a(ofVar);
    }
}
