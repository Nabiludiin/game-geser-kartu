package m3;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
final class s0 implements w4.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f24849a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24850b;

    /* renamed from: c, reason: collision with root package name */
    private final b f24851c;

    /* renamed from: d, reason: collision with root package name */
    private final long f24852d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24853e;

    s0(g gVar, int i7, b bVar, long j7, long j8, String str, String str2) {
        this.f24849a = gVar;
        this.f24850b = i7;
        this.f24851c = bVar;
        this.f24852d = j7;
        this.f24853e = j8;
    }

    static s0 b(g gVar, int i7, b bVar) {
        boolean z7;
        if (!gVar.d()) {
            return null;
        }
        p3.q a8 = p3.p.b().a();
        if (a8 == null) {
            z7 = true;
        } else {
            if (!a8.O0()) {
                return null;
            }
            z7 = a8.P0();
            h0 s7 = gVar.s(bVar);
            if (s7 != null) {
                if (!(s7.t() instanceof p3.c)) {
                    return null;
                }
                p3.c cVar = (p3.c) s7.t();
                if (cVar.O() && !cVar.f()) {
                    p3.e c8 = c(s7, cVar, i7);
                    if (c8 == null) {
                        return null;
                    }
                    s7.E();
                    z7 = c8.Q0();
                }
            }
        }
        return new s0(gVar, i7, bVar, z7 ? System.currentTimeMillis() : 0L, z7 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static p3.e c(h0 h0Var, p3.c cVar, int i7) {
        int[] N0;
        int[] O0;
        p3.e M = cVar.M();
        if (M == null || !M.P0() || ((N0 = M.N0()) != null ? !com.google.android.gms.common.util.b.a(N0, i7) : !((O0 = M.O0()) == null || !com.google.android.gms.common.util.b.a(O0, i7))) || h0Var.r() >= M.M0()) {
            return null;
        }
        return M;
    }

    @Override // w4.e
    public final void a(w4.i iVar) {
        h0 s7;
        int i7;
        int i8;
        int i9;
        int M0;
        long j7;
        long j8;
        if (this.f24849a.d()) {
            p3.q a8 = p3.p.b().a();
            if ((a8 == null || a8.O0()) && (s7 = this.f24849a.s(this.f24851c)) != null && (s7.t() instanceof p3.c)) {
                p3.c cVar = (p3.c) s7.t();
                int i10 = 0;
                boolean z7 = this.f24852d > 0;
                int E = cVar.E();
                int i11 = 100;
                if (a8 != null) {
                    z7 &= a8.P0();
                    int M02 = a8.M0();
                    int N0 = a8.N0();
                    i7 = a8.Q0();
                    if (cVar.O() && !cVar.f()) {
                        p3.e c8 = c(s7, cVar, this.f24850b);
                        if (c8 == null) {
                            return;
                        }
                        boolean z8 = c8.Q0() && this.f24852d > 0;
                        N0 = c8.M0();
                        z7 = z8;
                    }
                    i9 = M02;
                    i8 = N0;
                } else {
                    i7 = 0;
                    i8 = 100;
                    i9 = 5000;
                }
                g gVar = this.f24849a;
                int i12 = -1;
                if (iVar.n()) {
                    M0 = 0;
                } else {
                    if (!iVar.l()) {
                        Exception j9 = iVar.j();
                        if (j9 instanceof l3.b) {
                            Status a9 = ((l3.b) j9).a();
                            i11 = a9.N0();
                            k3.b M03 = a9.M0();
                            if (M03 != null) {
                                M0 = M03.M0();
                                i10 = i11;
                            }
                        } else {
                            i10 = 101;
                            M0 = -1;
                        }
                    }
                    i10 = i11;
                    M0 = -1;
                }
                if (z7) {
                    long j10 = this.f24852d;
                    long j11 = this.f24853e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i12 = (int) (SystemClock.elapsedRealtime() - j11);
                    j8 = currentTimeMillis;
                    j7 = j10;
                } else {
                    j7 = 0;
                    j8 = 0;
                }
                gVar.B(new p3.m(this.f24850b, i10, M0, j7, j8, null, null, E, i12), i7, i9, i8);
            }
        }
    }
}
