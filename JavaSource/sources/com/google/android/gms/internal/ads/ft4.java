package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ft4 {

    /* renamed from: a, reason: collision with root package name */
    private final jy3 f8481a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8482b;

    /* renamed from: c, reason: collision with root package name */
    private es4 f8483c;

    /* renamed from: d, reason: collision with root package name */
    private mb1 f8484d;

    /* renamed from: f, reason: collision with root package name */
    private int f8486f;

    /* renamed from: h, reason: collision with root package name */
    private cj0 f8488h;

    /* renamed from: g, reason: collision with root package name */
    private float f8487g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f8485e = 0;

    public ft4(final Context context, Looper looper, es4 es4Var) {
        this.f8481a = ny3.a(new jy3() { // from class: com.google.android.gms.internal.ads.dr4
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return gl0.a(context);
            }
        });
        this.f8483c = es4Var;
        this.f8482b = new Handler(looper);
    }

    private final void f() {
        int i7 = this.f8485e;
        if (i7 == 1 || i7 == 0 || this.f8488h == null) {
            return;
        }
        gl0.c((AudioManager) this.f8481a.a(), this.f8488h);
    }

    private final void g(int i7) {
        if (this.f8485e == i7) {
            return;
        }
        this.f8485e = i7;
        float f8 = i7 == 4 ? 0.2f : 1.0f;
        if (this.f8487g != f8) {
            this.f8487g = f8;
            es4 es4Var = this.f8483c;
            if (es4Var != null) {
                es4Var.g(f8);
            }
        }
    }

    private final void h(int i7) {
        es4 es4Var = this.f8483c;
        if (es4Var != null) {
            es4Var.b(i7);
        }
    }

    public final float a() {
        return this.f8487g;
    }

    public final void b(mb1 mb1Var) {
        if (Objects.equals(this.f8484d, mb1Var)) {
            return;
        }
        this.f8484d = mb1Var;
        this.f8486f = mb1Var == null ? 0 : 1;
    }

    public final int c(boolean z7, int i7) {
        if (i7 == 1 || this.f8486f != 1) {
            f();
            g(0);
            return 1;
        }
        if (!z7) {
            int i8 = this.f8485e;
            if (i8 != 1) {
                return i8 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f8485e == 2) {
            return 1;
        }
        if (this.f8488h == null) {
            uf0 uf0Var = new uf0(1);
            mb1 mb1Var = this.f8484d;
            mb1Var.getClass();
            uf0Var.b(mb1Var);
            uf0Var.a(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.cq4
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i9) {
                    ft4.this.e(i9);
                }
            }, this.f8482b);
            this.f8488h = uf0Var.c();
        }
        if (gl0.b((AudioManager) this.f8481a.a(), this.f8488h) == 1) {
            g(2);
            return 1;
        }
        g(1);
        return -1;
    }

    public final void d() {
        this.f8483c = null;
        f();
        g(0);
    }

    final /* synthetic */ void e(int i7) {
        if (i7 == -3 || i7 == -2) {
            if (i7 != -2) {
                g(4);
                return;
            } else {
                h(0);
                g(3);
                return;
            }
        }
        if (i7 == -1) {
            h(-1);
            f();
            g(1);
        } else if (i7 == 1) {
            g(2);
            h(1);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i7);
            gv1.c("AudioFocusManager", sb.toString());
        }
    }
}
