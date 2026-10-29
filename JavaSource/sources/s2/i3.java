package s2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ec3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f26126a;

    /* renamed from: b, reason: collision with root package name */
    private final List f26127b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f26128c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f26129d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26130e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26131f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26132g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f26133h;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f26134i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f26135j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f26136k;

    /* renamed from: l, reason: collision with root package name */
    private final String f26137l;

    /* renamed from: m, reason: collision with root package name */
    private final int f26138m;

    /* renamed from: n, reason: collision with root package name */
    private long f26139n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f26140o;

    public i3(h3 h3Var, ec3 ec3Var) {
        this.f26140o = 0L;
        this.f26126a = h3Var.y();
        this.f26127b = h3Var.z();
        this.f26128c = Collections.unmodifiableSet(h3Var.s());
        this.f26129d = h3Var.t();
        Collections.unmodifiableMap(h3Var.u());
        this.f26130e = h3Var.A();
        this.f26131f = h3Var.a();
        this.f26132g = h3Var.b();
        this.f26133h = Collections.unmodifiableSet(h3Var.v());
        this.f26134i = h3Var.w();
        this.f26135j = Collections.unmodifiableSet(h3Var.x());
        this.f26136k = h3Var.c();
        this.f26137l = h3Var.d();
        this.f26138m = h3Var.e();
        this.f26140o = h3Var.f();
    }

    public final String a() {
        return this.f26126a;
    }

    public final List b() {
        return new ArrayList(this.f26127b);
    }

    public final Set c() {
        return this.f26128c;
    }

    public final Bundle d(Class cls) {
        return this.f26129d.getBundle(cls.getName());
    }

    public final String e() {
        return this.f26130e;
    }

    public final String f() {
        return this.f26131f;
    }

    public final boolean g(Context context) {
        k2.t h8 = s3.e().h();
        z.a();
        Set set = this.f26133h;
        String d8 = w2.g.d(context);
        return set.contains(d8) || h8.e().contains(d8);
    }

    public final Bundle h() {
        return this.f26129d;
    }

    public final int i() {
        return this.f26132g;
    }

    public final Bundle j() {
        return this.f26134i;
    }

    public final Set k() {
        return this.f26135j;
    }

    public final boolean l() {
        return this.f26136k;
    }

    public final String m() {
        return this.f26137l;
    }

    public final int n() {
        return this.f26138m;
    }

    public final void o(long j7) {
        this.f26139n = j7;
    }

    public final long p() {
        return this.f26139n;
    }

    public final long q() {
        return this.f26140o;
    }
}
