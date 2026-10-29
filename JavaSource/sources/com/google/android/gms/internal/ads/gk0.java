package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class gk0 implements gr {

    /* renamed from: q, reason: collision with root package name */
    private final Context f8963q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f8964r;

    /* renamed from: s, reason: collision with root package name */
    private final String f8965s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8966t;

    public gk0(Context context, String str) {
        this.f8963q = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8965s = str;
        this.f8966t = false;
        this.f8964r = new Object();
    }

    public final void a(boolean z7) {
        jk0 d8 = r2.t.d();
        Context context = this.f8963q;
        if (d8.a(context)) {
            synchronized (this.f8964r) {
                try {
                    if (this.f8966t == z7) {
                        return;
                    }
                    this.f8966t = z7;
                    String str = this.f8965s;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f8966t) {
                        r2.t.d().d(context, str);
                    } else {
                        r2.t.d().e(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String b() {
        return this.f8965s;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        a(frVar.f8430j);
    }
}
