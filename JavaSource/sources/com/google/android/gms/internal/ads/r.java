package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: MyApplication */
public final class r extends Surface {

    /* renamed from: t, reason: collision with root package name */
    private static int f14679t;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f14680u;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14681q;

    /* renamed from: r, reason: collision with root package name */
    private final q f14682r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14683s;

    /* synthetic */ r(q qVar, SurfaceTexture surfaceTexture, boolean z7, byte[] bArr) {
        super(surfaceTexture);
        this.f14682r = qVar;
        this.f14681q = z7;
    }

    public static synchronized boolean a(Context context) {
        int i7;
        int i8;
        synchronized (r.class) {
            if (!f14680u) {
                try {
                } catch (wk1 e8) {
                    gv1.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e8.getMessage())));
                }
                if (xl1.a(context)) {
                    i7 = xl1.b() ? 1 : 2;
                    f14679t = i7;
                    f14680u = true;
                }
                i7 = 0;
                f14679t = i7;
                f14680u = true;
            }
            i8 = f14679t;
        }
        return i8 != 0;
    }

    public static r f(Context context, boolean z7) {
        boolean z8 = true;
        if (z7 && !a(context)) {
            z8 = false;
        }
        rx3.h(z8);
        return new q().a(z7 ? f14679t : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        q qVar = this.f14682r;
        synchronized (qVar) {
            try {
                if (!this.f14683s) {
                    qVar.b();
                    this.f14683s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
