package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* compiled from: MyApplication */
abstract class be {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f5726a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f5727b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5728c = 0;

    public static boolean a(n2 n2Var) {
        y82 y82Var = new y82(8);
        int i7 = ae.a(n2Var, y82Var).f4894a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        n2Var.u(y82Var.H(), 0, 4);
        y82Var.G(0);
        int b8 = y82Var.b();
        if (b8 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(b8);
        gv1.e("WavHeaderReader", sb.toString());
        return false;
    }

    public static zd b(n2 n2Var) {
        byte[] bArr;
        int i7;
        byte[] bArr2;
        y82 y82Var = new y82(16);
        long j7 = d(1718449184, n2Var, y82Var).f4895b;
        rx3.h(j7 >= 16);
        n2Var.u(y82Var.H(), 0, 16);
        y82Var.G(0);
        int T = y82Var.T();
        int T2 = y82Var.T();
        int i8 = y82Var.i();
        int i9 = y82Var.i();
        int T3 = y82Var.T();
        int T4 = y82Var.T();
        int i10 = ((int) j7) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            n2Var.u(bArr, 0, i10);
            if (T == 65534) {
                if (i10 != 24) {
                    bArr2 = bArr;
                    i7 = 65534;
                    n2Var.B((int) (n2Var.n() - n2Var.o()));
                    return new zd(i7, T2, i8, i9, T3, T4, bArr2);
                }
                y82 y82Var2 = new y82(bArr);
                y82Var2.T();
                int T5 = y82Var2.T();
                if (T5 != 0 && T5 != T4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(T5).length() + 33 + String.valueOf(T4).length() + 19);
                    sb.append("validBits ( ");
                    sb.append(T5);
                    sb.append(")  != bitsPerSample( ");
                    sb.append(T4);
                    sb.append(") are not supported");
                    throw wi.c(sb.toString());
                }
                int i11 = y82Var2.i();
                if ((i11 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(i11);
                    throw wi.c(sb2.toString());
                }
                if (i11 != 0 && Integer.bitCount(i11) != T2) {
                    int bitCount = Integer.bitCount(i11);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bitCount).length() + 46 + String.valueOf(i11).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(bitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(i11);
                    throw wi.c(sb3.toString());
                }
                T = y82Var2.T();
                byte[] bArr3 = new byte[14];
                y82Var2.L(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, f5726a) && !Arrays.equals(bArr3, f5727b)) {
                    throw wi.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = hi2.f9536b;
        }
        i7 = T;
        bArr2 = bArr;
        n2Var.B((int) (n2Var.n() - n2Var.o()));
        return new zd(i7, T2, i8, i9, T3, T4, bArr2);
    }

    public static Pair c(n2 n2Var) {
        n2Var.k();
        ae d8 = d(1684108385, n2Var, new y82(8));
        n2Var.B(8);
        return Pair.create(Long.valueOf(n2Var.o()), Long.valueOf(d8.f4895b));
    }

    private static ae d(int i7, n2 n2Var, y82 y82Var) {
        ae a8 = ae.a(n2Var, y82Var);
        while (true) {
            int i8 = a8.f4894a;
            if (i8 == i7) {
                return a8;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i8);
            gv1.c("WavHeaderReader", sb.toString());
            long j7 = a8.f4895b;
            long j8 = 8 + j7;
            if ((1 & j7) != 0) {
                j8 = 9 + j7;
            }
            if (j8 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i8);
                throw wi.c(sb2.toString());
            }
            n2Var.B((int) j8);
            a8 = ae.a(n2Var, y82Var);
        }
    }
}
