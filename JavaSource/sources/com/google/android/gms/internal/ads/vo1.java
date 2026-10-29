package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class vo1 implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    private final xs1 f17692q;

    /* renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f17693r;

    /* renamed from: s, reason: collision with root package name */
    private a40 f17694s;

    /* renamed from: t, reason: collision with root package name */
    private y50 f17695t;

    /* renamed from: u, reason: collision with root package name */
    String f17696u;

    /* renamed from: v, reason: collision with root package name */
    Long f17697v;

    /* renamed from: w, reason: collision with root package name */
    WeakReference f17698w;

    public vo1(xs1 xs1Var, com.google.android.gms.common.util.e eVar) {
        this.f17692q = xs1Var;
        this.f17693r = eVar;
    }

    private final void d() {
        View view;
        this.f17696u = null;
        this.f17697v = null;
        WeakReference weakReference = this.f17698w;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f17698w = null;
    }

    public final void a(final a40 a40Var) {
        this.f17694s = a40Var;
        y50 y50Var = this.f17695t;
        if (y50Var != null) {
            this.f17692q.e("/unconfirmedClick", y50Var);
        }
        y50 y50Var2 = new y50() { // from class: com.google.android.gms.internal.ads.uo1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                vo1 vo1Var = vo1.this;
                try {
                    vo1Var.f17697v = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i7 = v2.n1.f26802b;
                    w2.p.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                a40 a40Var2 = a40Var;
                vo1Var.f17696u = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (a40Var2 == null) {
                    int i8 = v2.n1.f26802b;
                    w2.p.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        a40Var2.y(str);
                    } catch (RemoteException e8) {
                        w2.p.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        };
        this.f17695t = y50Var2;
        this.f17692q.d("/unconfirmedClick", y50Var2);
    }

    public final a40 b() {
        return this.f17694s;
    }

    public final void c() {
        if (this.f17694s == null || this.f17697v == null) {
            return;
        }
        d();
        try {
            this.f17694s.e();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f17698w;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f17696u != null && this.f17697v != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f17696u);
            hashMap.put("time_interval", String.valueOf(this.f17693r.a() - this.f17697v.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f17692q.f("sendMessageToNativeJs", hashMap);
        }
        d();
    }
}
