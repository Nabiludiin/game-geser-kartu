package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* compiled from: MyApplication */
final class r95 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, z0, vj5, ds5, vo5, ao4, cd5 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ta5 f14806q;

    /* synthetic */ r95(ta5 ta5Var, byte[] bArr) {
        Objects.requireNonNull(ta5Var);
        this.f14806q = ta5Var;
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void K0(String str) {
        this.f14806q.U().U(str);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void L0(String str, long j7, long j8) {
        this.f14806q.U().T(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void M0(long j7) {
        this.f14806q.U().Z(j7);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void N0(eq5 eq5Var, iw4 iw4Var) {
        this.f14806q.U().o(eq5Var, iw4Var);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void O0(Exception exc) {
        this.f14806q.U().a(exc);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void P0(final int i7) {
        this.f14806q.V().a(new hx3() { // from class: com.google.android.gms.internal.ads.n95
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i7);
            }
        }, new hx3() { // from class: com.google.android.gms.internal.ads.o95
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void Q0(Exception exc) {
        this.f14806q.U().i(exc);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void R0(final boolean z7) {
        ta5 ta5Var = this.f14806q;
        if (ta5Var.X() == z7) {
            return;
        }
        ta5Var.Y(z7);
        fu1 T = ta5Var.T();
        T.d(23, new ap1() { // from class: com.google.android.gms.internal.ads.m95
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((jp) obj).m(z7);
            }
        });
        T.e();
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void S0(hv4 hv4Var) {
        this.f14806q.U().O(hv4Var);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void T0(wj5 wj5Var) {
        this.f14806q.U().G(wj5Var);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void U0(wj5 wj5Var) {
        this.f14806q.U().b0(wj5Var);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void V0(hv4 hv4Var) {
        this.f14806q.U().S(hv4Var);
    }

    @Override // com.google.android.gms.internal.ads.vj5
    public final void W0(int i7, long j7, long j8) {
        this.f14806q.U().F(i7, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.cd5
    public final void a(jd5 jd5Var) {
        this.f14806q.P(b45.c(jd5Var, 1003));
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void a0(String str) {
        this.f14806q.U().d(str);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void b0(int i7, long j7) {
        this.f14806q.U().g(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void c0(long j7, int i7) {
        this.f14806q.U().N(j7, i7);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void d0(hv4 hv4Var) {
        this.f14806q.U().W(hv4Var);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void e0(hv4 hv4Var) {
        this.f14806q.U().h(hv4Var);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void f0(final te0 te0Var) {
        ap1 ap1Var = new ap1() { // from class: com.google.android.gms.internal.ads.p95
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((jp) obj).b(te0.this);
            }
        };
        fu1 T = this.f14806q.T();
        T.d(25, ap1Var);
        T.e();
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void g0(Exception exc) {
        this.f14806q.U().M(exc);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void h0(String str, long j7, long j8) {
        this.f14806q.U().J(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void i0(Object obj, long j7) {
        ta5 ta5Var = this.f14806q;
        ta5Var.U().y(obj, j7);
        if (ta5Var.W() == obj) {
            fu1 T = ta5Var.T();
            T.d(26, q95.f14325a);
            T.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.z0
    public final void j0(eq5 eq5Var, iw4 iw4Var) {
        this.f14806q.U().K(eq5Var, iw4Var);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        ta5 ta5Var = this.f14806q;
        ta5Var.Q(surfaceTexture);
        ta5Var.S(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ta5 ta5Var = this.f14806q;
        ta5Var.R(null);
        ta5Var.S(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f14806q.S(i7, i8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        this.f14806q.S(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f14806q.S(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
