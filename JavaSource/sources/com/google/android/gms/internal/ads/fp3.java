package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class fp3 implements yk3 {

    /* renamed from: a, reason: collision with root package name */
    private final h85 f8380a;

    /* renamed from: b, reason: collision with root package name */
    private final h85 f8381b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f8382c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8383d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8384e;

    fp3(h85 h85Var, h85 h85Var2, h85 h85Var3, boolean z7, long j7) {
        this.f8380a = h85Var;
        this.f8381b = h85Var2;
        this.f8382c = h85Var3;
        this.f8383d = z7;
        this.f8384e = j7;
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final String a() {
        return ((kq3) this.f8381b.b()).a();
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d b() {
        if (this.f8383d) {
            return (h64) p64.j((h64) p64.g(h64.C(((yp3) this.f8380a.b()).a()), Throwable.class, ep3.f7747a, g74.a()), new w54() { // from class: com.google.android.gms.internal.ads.cp3
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return fp3.this.h((xp3) obj);
                }
            }, g74.a());
        }
        a5.d b8 = ((kq3) this.f8381b.b()).b();
        long j7 = this.f8384e;
        if (j7 > 0) {
            ((ScheduledExecutorService) this.f8382c.b()).schedule(new Callable() { // from class: com.google.android.gms.internal.ads.dp3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    fp3.this.i();
                    return null;
                }
            }, j7, TimeUnit.MILLISECONDS);
            return b8;
        }
        ((yp3) this.f8380a.b()).a();
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d c(Context context, String str, View view, Activity activity) {
        return ((kq3) this.f8381b.b()).c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d d(Context context) {
        return ((kq3) this.f8381b.b()).d(context);
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final a5.d e(Context context, String str, View view, Activity activity) {
        return ((kq3) this.f8381b.b()).e(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final int f() {
        return ((kq3) this.f8381b.b()).f();
    }

    @Override // com.google.android.gms.internal.ads.yk3
    public final void g(InputEvent inputEvent) {
        ((kq3) this.f8381b.b()).g(inputEvent);
    }

    final /* synthetic */ a5.d h(xp3 xp3Var) {
        return ((kq3) this.f8381b.b()).b();
    }

    final /* synthetic */ Object i() {
        ((yp3) this.f8380a.b()).a();
        return null;
    }
}
