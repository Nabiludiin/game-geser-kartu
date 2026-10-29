package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class v01 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17308a;

    /* renamed from: b, reason: collision with root package name */
    private final ya0 f17309b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17310c;

    /* renamed from: d, reason: collision with root package name */
    private b11 f17311d;

    /* renamed from: e, reason: collision with root package name */
    private final y50 f17312e = new s01(this);

    /* renamed from: f, reason: collision with root package name */
    private final y50 f17313f = new u01(this);

    public v01(String str, ya0 ya0Var, Executor executor) {
        this.f17308a = str;
        this.f17309b = ya0Var;
        this.f17310c = executor;
    }

    public final void a(b11 b11Var) {
        ya0 ya0Var = this.f17309b;
        ya0Var.b("/updateActiveView", this.f17312e);
        ya0Var.b("/untrackActiveViewUnit", this.f17313f);
        this.f17311d = b11Var;
    }

    public final void b(mr0 mr0Var) {
        mr0Var.O0("/updateActiveView", this.f17312e);
        mr0Var.O0("/untrackActiveViewUnit", this.f17313f);
    }

    public final void c(mr0 mr0Var) {
        mr0Var.s1("/updateActiveView", this.f17312e);
        mr0Var.s1("/untrackActiveViewUnit", this.f17313f);
    }

    public final void d() {
        ya0 ya0Var = this.f17309b;
        ya0Var.c("/updateActiveView", this.f17312e);
        ya0Var.c("/untrackActiveViewUnit", this.f17313f);
    }

    final /* synthetic */ boolean e(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f17308a);
    }

    final /* synthetic */ Executor f() {
        return this.f17310c;
    }

    final /* synthetic */ b11 g() {
        return this.f17311d;
    }
}
