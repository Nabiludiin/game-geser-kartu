package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.e;

/* compiled from: MyApplication */
public final class oc0 implements y2.p {

    /* renamed from: a, reason: collision with root package name */
    private final Date f13272a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13273b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f13274c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13275d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f13276e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13277f;

    /* renamed from: g, reason: collision with root package name */
    private final z10 f13278g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13280i;

    /* renamed from: h, reason: collision with root package name */
    private final List f13279h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f13281j = new HashMap();

    public oc0(Date date, int i7, Set set, Location location, boolean z7, int i8, z10 z10Var, List list, boolean z8, int i9, String str) {
        this.f13272a = date;
        this.f13273b = i7;
        this.f13274c = set;
        this.f13276e = location;
        this.f13275d = z7;
        this.f13277f = i8;
        this.f13278g = z10Var;
        this.f13280i = z8;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f13281j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f13281j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f13279h.add(str2);
                }
            }
        }
    }

    @Override // y2.p
    public final boolean a() {
        return this.f13279h.contains("3");
    }

    @Override // y2.p
    public final Map b() {
        return this.f13281j;
    }

    @Override // y2.p
    public final com.google.android.gms.ads.nativead.c c() {
        return z10.M0(this.f13278g);
    }

    @Override // y2.e
    public final int d() {
        return this.f13277f;
    }

    @Override // y2.p
    public final boolean e() {
        return this.f13279h.contains("6");
    }

    @Override // y2.e
    public final boolean f() {
        return this.f13280i;
    }

    @Override // y2.e
    public final boolean g() {
        return this.f13275d;
    }

    @Override // y2.e
    public final Set h() {
        return this.f13274c;
    }

    @Override // y2.p
    public final n2.e i() {
        Parcelable.Creator<z10> creator = z10.CREATOR;
        e.a aVar = new e.a();
        z10 z10Var = this.f13278g;
        if (z10Var == null) {
            return aVar.a();
        }
        int i7 = z10Var.f19954q;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    aVar.e(z10Var.f19960w);
                    aVar.d(z10Var.f19961x);
                }
                aVar.g(z10Var.f19955r);
                aVar.c(z10Var.f19956s);
                aVar.f(z10Var.f19957t);
                return aVar.a();
            }
            s2.u4 u4Var = z10Var.f19959v;
            if (u4Var != null) {
                aVar.h(new k2.x(u4Var));
            }
        }
        aVar.b(z10Var.f19958u);
        aVar.g(z10Var.f19955r);
        aVar.c(z10Var.f19956s);
        aVar.f(z10Var.f19957t);
        return aVar.a();
    }
}
