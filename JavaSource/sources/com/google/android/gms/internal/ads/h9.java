package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
final class h9 extends f9 {

    /* renamed from: n, reason: collision with root package name */
    private g9 f9377n;

    /* renamed from: o, reason: collision with root package name */
    private int f9378o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9379p;

    /* renamed from: q, reason: collision with root package name */
    private f4 f9380q;

    /* renamed from: r, reason: collision with root package name */
    private d4 f9381r;

    h9() {
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final void a(boolean z7) {
        super.a(z7);
        if (z7) {
            this.f9377n = null;
            this.f9380q = null;
            this.f9381r = null;
        }
        this.f9378o = 0;
        this.f9379p = false;
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final long b(y82 y82Var) {
        if ((y82Var.H()[0] & 1) == 1) {
            return -1L;
        }
        byte b8 = y82Var.H()[0];
        g9 g9Var = this.f9377n;
        g9Var.getClass();
        int i7 = !g9Var.f8715d[(b8 >> 1) & (255 >>> (8 - g9Var.f8716e))].f7414a ? g9Var.f8712a.f8022e : g9Var.f8712a.f8023f;
        int i8 = this.f9379p ? (this.f9378o + i7) / 4 : 0;
        if (y82Var.I() < y82Var.D() + 4) {
            byte[] copyOf = Arrays.copyOf(y82Var.H(), y82Var.D() + 4);
            y82Var.A(copyOf, copyOf.length);
        } else {
            y82Var.E(y82Var.D() + 4);
        }
        long j7 = i8;
        byte[] H = y82Var.H();
        H[y82Var.D() - 4] = (byte) (j7 & 255);
        H[y82Var.D() - 3] = (byte) ((j7 >>> 8) & 255);
        H[y82Var.D() - 2] = (byte) ((j7 >>> 16) & 255);
        H[y82Var.D() - 1] = (byte) ((j7 >>> 24) & 255);
        this.f9379p = true;
        this.f9378o = i7;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final boolean c(y82 y82Var, long j7, d9 d9Var) {
        g9 g9Var;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        long j8;
        if (this.f9377n != null) {
            d9Var.f6985a.getClass();
            return false;
        }
        f4 f4Var = this.f9380q;
        int i11 = 1;
        if (f4Var == null) {
            g4.d(1, y82Var, false);
            int i12 = y82Var.i();
            int R = y82Var.R();
            int i13 = y82Var.i();
            int c8 = y82Var.c();
            int i14 = c8 <= 0 ? -1 : c8;
            int c9 = y82Var.c();
            int i15 = c9 <= 0 ? -1 : c9;
            int c10 = y82Var.c();
            int i16 = c10 <= 0 ? -1 : c10;
            int R2 = y82Var.R();
            this.f9380q = new f4(i12, R, i13, i14, i15, i16, (int) Math.pow(2.0d, R2 & 15), (int) Math.pow(2.0d, (R2 & 240) >> 4), 1 == (y82Var.R() & 1), Arrays.copyOf(y82Var.H(), y82Var.D()));
        } else {
            int i17 = 4;
            d4 d4Var = this.f9381r;
            if (d4Var == null) {
                this.f9381r = g4.b(y82Var, true, true);
            } else {
                byte[] bArr = new byte[y82Var.D()];
                System.arraycopy(y82Var.H(), 0, bArr, 0, y82Var.D());
                int i18 = f4Var.f8018a;
                int i19 = 5;
                g4.d(5, y82Var, false);
                int R3 = y82Var.R() + 1;
                c4 c4Var = new c4(y82Var.H());
                c4Var.c(y82Var.F() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 >= R3) {
                        int i23 = i11;
                        int i24 = 6;
                        int b8 = c4Var.b(6) + i23;
                        for (int i25 = 0; i25 < b8; i25++) {
                            if (c4Var.b(16) != 0) {
                                throw wi.b("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int b9 = c4Var.b(6) + i23;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < b9) {
                                int b10 = c4Var.b(i22);
                                if (b10 == 0) {
                                    int i28 = 8;
                                    c4Var.c(8);
                                    c4Var.c(16);
                                    c4Var.c(16);
                                    c4Var.c(6);
                                    c4Var.c(8);
                                    int b11 = c4Var.b(4) + 1;
                                    int i29 = 0;
                                    while (i29 < b11) {
                                        c4Var.c(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (b10 != i23) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(b10);
                                        throw wi.b(sb.toString(), null);
                                    }
                                    int b12 = c4Var.b(5);
                                    int[] iArr2 = new int[b12];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < b12; i31++) {
                                        int b13 = c4Var.b(4);
                                        iArr2[i31] = b13;
                                        if (b13 > i30) {
                                            i30 = b13;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        int i34 = 1;
                                        iArr3[i33] = c4Var.b(i27) + 1;
                                        int b14 = c4Var.b(2);
                                        if (b14 > 0) {
                                            i9 = 8;
                                            c4Var.c(8);
                                        } else {
                                            i9 = 8;
                                        }
                                        int i35 = i32;
                                        int i36 = 0;
                                        while (true) {
                                            int i37 = i34 << b14;
                                            iArr = iArr2;
                                            if (i36 < i37) {
                                                c4Var.c(i9);
                                                i36++;
                                                iArr2 = iArr;
                                                i9 = 8;
                                                i34 = 1;
                                            }
                                        }
                                        i33++;
                                        iArr2 = iArr;
                                        i32 = i35;
                                        i27 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    c4Var.c(2);
                                    int b15 = c4Var.b(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < b12; i40++) {
                                        i38 += iArr3[iArr4[i40]];
                                        while (i39 < i38) {
                                            c4Var.c(b15);
                                            i39++;
                                        }
                                    }
                                }
                                i26++;
                                i24 = 6;
                                i22 = 16;
                                i23 = 1;
                            } else {
                                int i41 = 1;
                                int b16 = c4Var.b(i24) + 1;
                                int i42 = 0;
                                while (i42 < b16) {
                                    if (c4Var.b(16) > 2) {
                                        throw wi.b("residueType greater than 2 is not decodable", null);
                                    }
                                    c4Var.c(24);
                                    c4Var.c(24);
                                    c4Var.c(24);
                                    int b17 = c4Var.b(i24) + i41;
                                    int i43 = 8;
                                    c4Var.c(8);
                                    int[] iArr5 = new int[b17];
                                    for (int i44 = 0; i44 < b17; i44++) {
                                        iArr5[i44] = ((c4Var.a() ? c4Var.b(5) : 0) * 8) + c4Var.b(3);
                                    }
                                    int i45 = 0;
                                    while (i45 < b17) {
                                        int i46 = 0;
                                        while (i46 < i43) {
                                            if ((iArr5[i45] & (1 << i46)) != 0) {
                                                c4Var.c(i43);
                                            }
                                            i46++;
                                            i43 = 8;
                                        }
                                        i45++;
                                        i43 = 8;
                                    }
                                    i42++;
                                    i24 = 6;
                                    i41 = 1;
                                }
                                int b18 = c4Var.b(i24) + 1;
                                for (int i47 = 0; i47 < b18; i47++) {
                                    int b19 = c4Var.b(16);
                                    if (b19 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(b19).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(b19);
                                        gv1.e("VorbisUtil", sb2.toString());
                                    } else {
                                        if (c4Var.a()) {
                                            i7 = 1;
                                            i8 = c4Var.b(4) + 1;
                                        } else {
                                            i7 = 1;
                                            i8 = 1;
                                        }
                                        if (c4Var.a()) {
                                            int b20 = c4Var.b(8) + i7;
                                            for (int i48 = 0; i48 < b20; i48++) {
                                                int i49 = i18 - 1;
                                                c4Var.c(g4.a(i49));
                                                c4Var.c(g4.a(i49));
                                            }
                                        }
                                        if (c4Var.b(2) != 0) {
                                            throw wi.b("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i8 > 1) {
                                            for (int i50 = 0; i50 < i18; i50++) {
                                                c4Var.c(4);
                                            }
                                        }
                                        for (int i51 = 0; i51 < i8; i51++) {
                                            c4Var.c(8);
                                            c4Var.c(8);
                                            c4Var.c(8);
                                        }
                                    }
                                }
                                int b21 = c4Var.b(6);
                                int i52 = b21 + 1;
                                e4[] e4VarArr = new e4[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    e4VarArr[i53] = new e4(c4Var.a(), c4Var.b(16), c4Var.b(16), c4Var.b(8));
                                }
                                if (!c4Var.a()) {
                                    throw wi.b("framing bit after modes not set as expected", null);
                                }
                                g9Var = new g9(f4Var, d4Var, bArr, e4VarArr, g4.a(b21));
                            }
                        }
                    } else {
                        if (c4Var.b(24) != 5653314) {
                            int d8 = c4Var.d();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(d8).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(d8);
                            throw wi.b(sb3.toString(), null);
                        }
                        int b22 = c4Var.b(16);
                        int b23 = c4Var.b(24);
                        if (c4Var.a()) {
                            c4Var.c(i19);
                            for (int i54 = 0; i54 < b23; i54 += c4Var.b(g4.a(b23 - i54))) {
                            }
                        } else {
                            boolean a8 = c4Var.a();
                            for (int i55 = 0; i55 < b23; i55++) {
                                if (!a8) {
                                    c4Var.c(i19);
                                } else if (c4Var.a()) {
                                    c4Var.c(i19);
                                }
                            }
                        }
                        int i56 = i17;
                        int b24 = c4Var.b(i56);
                        if (b24 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(b24).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(b24);
                            throw wi.b(sb4.toString(), null);
                        }
                        if (b24 == i11) {
                            i21 = b24;
                        } else if (b24 != 2) {
                            i10 = i11;
                            i20++;
                            i11 = i10;
                            i17 = 4;
                            i19 = 5;
                        }
                        c4Var.c(32);
                        c4Var.c(32);
                        int b25 = c4Var.b(i56) + i11;
                        c4Var.c(i11);
                        if (i21 != i11) {
                            i10 = i11;
                            j8 = b22 * b23;
                        } else if (b22 != 0) {
                            i10 = i11;
                            j8 = (long) Math.floor(Math.pow(b23, 1.0d / b22));
                        } else {
                            i10 = i11;
                            j8 = 0;
                        }
                        c4Var.c((int) (j8 * b25));
                        i20++;
                        i11 = i10;
                        i17 = 4;
                        i19 = 5;
                    }
                }
            }
        }
        g9Var = null;
        this.f9377n = g9Var;
        if (g9Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        f4 f4Var2 = g9Var.f8712a;
        arrayList.add(f4Var2.f8024g);
        arrayList.add(g9Var.f8714c);
        le c11 = g4.c(w04.v(g9Var.f8713b.f6916a));
        xn5 xn5Var = new xn5();
        xn5Var.k0("audio/ogg");
        xn5Var.l0("audio/vorbis");
        xn5Var.g0(f4Var2.f8021d);
        xn5Var.h0(f4Var2.f8020c);
        xn5Var.e(f4Var2.f8018a);
        xn5Var.f(f4Var2.f8019b);
        xn5Var.o0(arrayList);
        xn5Var.j0(c11);
        d9Var.f6985a = xn5Var.m();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final void i(long j7) {
        super.i(j7);
        this.f9379p = j7 != 0;
        f4 f4Var = this.f9380q;
        this.f9378o = f4Var != null ? f4Var.f8022e : 0;
    }
}
