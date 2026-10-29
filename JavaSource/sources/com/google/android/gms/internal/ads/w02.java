package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: MyApplication */
public final class w02 {

    /* renamed from: a, reason: collision with root package name */
    private final f02 f17950a;

    /* renamed from: b, reason: collision with root package name */
    private final bv1 f17951b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17952c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f17953d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f17954e;

    w02(f02 f02Var, bv1 bv1Var) {
        this.f17950a = f02Var;
        this.f17951b = bv1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(List list) {
        String str;
        av1 c8;
        wd0 wd0Var;
        synchronized (this.f17952c) {
            try {
                if (this.f17954e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    t70 t70Var = (t70) it.next();
                    if (((Boolean) s2.b0.c().d(uy.qa)).booleanValue()) {
                        av1 c9 = this.f17951b.c(t70Var.f16007q);
                        if (c9 != null && (wd0Var = c9.f5303c) != null) {
                            str = wd0Var.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    boolean z7 = ((Boolean) s2.b0.c().d(uy.ra)).booleanValue() && (c8 = this.f17951b.c(t70Var.f16007q)) != null && c8.f5304d;
                    List list2 = this.f17953d;
                    String str3 = t70Var.f16007q;
                    list2.add(new v02(str3, str2, this.f17951b.d(str3), t70Var.f16008r ? 1 : 0, t70Var.f16010t, t70Var.f16009s, z7));
                }
                this.f17954e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.f17950a.b(new u02(this));
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f17952c) {
            try {
                if (!this.f17954e) {
                    f02 f02Var = this.f17950a;
                    if (!f02Var.e()) {
                        a();
                        return jSONArray;
                    }
                    c(f02Var.d());
                }
                Iterator it = this.f17953d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((v02) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
