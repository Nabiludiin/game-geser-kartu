package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* compiled from: MyApplication */
final class q4 implements i4 {

    /* renamed from: a, reason: collision with root package name */
    public final w04 f14238a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14239b;

    private q4(int i7, w04 w04Var) {
        this.f14239b = i7;
        this.f14238a = w04Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q4 b(int i7, y82 y82Var) {
        i4 r4Var;
        String str;
        t04 t04Var = new t04();
        int D = y82Var.D();
        int i8 = -2;
        while (y82Var.C() > 8) {
            int c8 = y82Var.c();
            int F = y82Var.F() + y82Var.c();
            y82Var.E(F);
            if (c8 != 1414744396) {
                r4 r4Var2 = null;
                switch (c8) {
                    case 1718776947:
                        if (i8 == 2) {
                            y82Var.J(4);
                            int c9 = y82Var.c();
                            int c10 = y82Var.c();
                            y82Var.J(4);
                            int c11 = y82Var.c();
                            switch (c11) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(c11).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(c11);
                                gv1.c("StreamFormatChunk", sb.toString());
                            } else {
                                xn5 xn5Var = new xn5();
                                xn5Var.s0(c9);
                                xn5Var.t0(c10);
                                xn5Var.l0(str);
                                r4Var2 = new r4(xn5Var.m());
                            }
                        } else if (i8 == 1) {
                            int T = y82Var.T();
                            String str2 = T != 1 ? T != 85 ? T != 255 ? T != 8192 ? T != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int T2 = y82Var.T();
                                int c12 = y82Var.c();
                                y82Var.J(6);
                                int W = hi2.W(y82Var.T(), ByteOrder.LITTLE_ENDIAN);
                                int T3 = y82Var.C() > 0 ? y82Var.T() : 0;
                                xn5 xn5Var2 = new xn5();
                                xn5Var2.l0(str2);
                                xn5Var2.e(T2);
                                xn5Var2.f(c12);
                                if (str2.equals("audio/raw") && W != 0) {
                                    xn5Var2.g(W);
                                }
                                if (str2.equals("audio/mp4a-latm") && T3 > 0) {
                                    byte[] bArr = new byte[T3];
                                    y82Var.L(bArr, 0, T3);
                                    xn5Var2.o0(w04.n(bArr));
                                }
                                r4Var = new r4(xn5Var2.m());
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(T).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(T);
                                gv1.c("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            gv1.c("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(hi2.q(i8)));
                        }
                        r4Var = r4Var2;
                        break;
                    case 1751742049:
                        r4Var = m4.b(y82Var);
                        break;
                    case 1752331379:
                        r4Var = o4.b(y82Var);
                        break;
                    case 1852994675:
                        r4Var = s4.b(y82Var);
                        break;
                    default:
                        r4Var = r4Var2;
                        break;
                }
            } else {
                r4Var = b(y82Var.c(), y82Var);
            }
            if (r4Var != null) {
                if (r4Var.a() == 1752331379) {
                    i8 = ((o4) r4Var).c();
                }
                t04Var.g(r4Var);
            }
            y82Var.G(F);
            y82Var.E(D);
        }
        return new q4(i7, t04Var.j());
    }

    @Override // com.google.android.gms.internal.ads.i4
    public final int a() {
        return this.f14239b;
    }

    public final i4 c(Class cls) {
        w04 w04Var = this.f14238a;
        int size = w04Var.size();
        int i7 = 0;
        while (i7 < size) {
            i4 i4Var = (i4) w04Var.get(i7);
            i7++;
            if (i4Var.getClass() == cls) {
                return i4Var;
            }
        }
        return null;
    }
}
