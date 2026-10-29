package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class yd2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f19516a;

    /* renamed from: b, reason: collision with root package name */
    private final ae2 f19517b;

    /* renamed from: c, reason: collision with root package name */
    private final x73 f19518c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f19519d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19520e = ((Boolean) s2.b0.c().d(uy.q7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final pa2 f19521f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19522g;

    /* renamed from: h, reason: collision with root package name */
    private long f19523h;

    /* renamed from: i, reason: collision with root package name */
    private long f19524i;

    public yd2(com.google.android.gms.common.util.e eVar, ae2 ae2Var, pa2 pa2Var, x73 x73Var) {
        this.f19516a = eVar;
        this.f19517b = ae2Var;
        this.f19521f = pa2Var;
        this.f19518c = x73Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean i(c03 c03Var) {
        xd2 xd2Var = (xd2) this.f19519d.get(c03Var);
        if (xd2Var == null) {
            return false;
        }
        return xd2Var.f18769c == 8;
    }

    public final synchronized void a() {
        this.f19524i = this.f19516a.b();
    }

    public final synchronized void b() {
        this.f19523h = this.f19516a.b() - this.f19524i;
    }

    public final synchronized void c(List list) {
        this.f19524i = this.f19516a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c03 c03Var = (c03) it.next();
            String str = c03Var.f6194w;
            if (!TextUtils.isEmpty(str)) {
                this.f19519d.put(c03Var, new xd2(str, c03Var.f6161f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void d(c03 c03Var) {
        try {
            this.f19523h = this.f19516a.b() - this.f19524i;
            if (c03Var != null) {
                this.f19521f.i(c03Var);
            }
            this.f19522g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized a5.d e(o03 o03Var, c03 c03Var, a5.d dVar, t73 t73Var) {
        f03 f03Var = o03Var.f13137b.f12530b;
        long b8 = this.f19516a.b();
        String str = c03Var.f6194w;
        if (str != null) {
            this.f19519d.put(c03Var, new xd2(str, c03Var.f6161f0, 9, 0L, null));
            p64.r(dVar, new wd2(this, b8, f03Var, c03Var, str, t73Var, o03Var), cm0.f6506g);
        }
        return dVar;
    }

    public final synchronized void f(c03 c03Var) {
        xd2 xd2Var = (xd2) this.f19519d.get(c03Var);
        if (xd2Var == null || this.f19522g) {
            return;
        }
        xd2Var.f18769c = 8;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f19519d.entrySet().iterator();
            while (it.hasNext()) {
                xd2 xd2Var = (xd2) ((Map.Entry) it.next()).getValue();
                if (xd2Var.f18769c != Integer.MAX_VALUE) {
                    arrayList.add(xd2Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long h() {
        return this.f19523h;
    }

    final /* synthetic */ com.google.android.gms.common.util.e j() {
        return this.f19516a;
    }

    final /* synthetic */ ae2 k() {
        return this.f19517b;
    }

    final /* synthetic */ x73 l() {
        return this.f19518c;
    }

    final /* synthetic */ LinkedHashMap m() {
        return this.f19519d;
    }

    final /* synthetic */ boolean n() {
        return this.f19520e;
    }

    final /* synthetic */ pa2 o() {
        return this.f19521f;
    }

    final /* synthetic */ boolean p() {
        return this.f19522g;
    }
}
