package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class o8 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13222a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static u3 a(n2 n2Var) {
        return c(n2Var, true, false);
    }

    public static u3 b(n2 n2Var, boolean z7) {
        return c(n2Var, false, z7);
    }

    private static u3 c(n2 n2Var, boolean z7, boolean z8) {
        u3 u3Var;
        long j7;
        y82 y82Var;
        int i7;
        int i8;
        long j8;
        int i9;
        int i10;
        int[] iArr;
        long q7 = n2Var.q();
        long j9 = -1;
        long j10 = 4096;
        if (q7 != -1 && q7 <= 4096) {
            j10 = q7;
        }
        y82 y82Var2 = new y82(64);
        int i11 = (int) j10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            y82Var2.z(8);
            if (!n2Var.x(y82Var2.H(), i12, 8, true)) {
                break;
            }
            long Y = y82Var2.Y();
            int b8 = y82Var2.b();
            if (Y == 1) {
                j7 = j9;
                n2Var.u(y82Var2.H(), 8, 8);
                i7 = 16;
                y82Var2.E(16);
                Y = y82Var2.d();
                y82Var = y82Var2;
            } else {
                j7 = j9;
                if (Y == 0) {
                    long q8 = n2Var.q();
                    if (q8 != j7) {
                        Y = (q8 - n2Var.n()) + 8;
                    }
                }
                y82Var = y82Var2;
                i7 = 8;
            }
            long j11 = Y;
            u3Var = null;
            long j12 = i7;
            if (j11 < j12) {
                i8 = 1;
                if (b8 == 1718773093) {
                    if (i7 == 8) {
                        j11 = 8;
                        b8 = 1718773093;
                    } else {
                        b8 = 1718773093;
                    }
                }
                return new j7(b8, j11, i7);
            }
            i8 = 1;
            i13 += i7;
            if (b8 == 1836019574) {
                i11 += (int) j11;
                if (q7 != -1 && i11 > q7) {
                    i11 = (int) q7;
                }
                y82Var2 = y82Var;
                j9 = j7;
                i12 = 0;
            } else {
                if (b8 == 1953653099 || b8 == 1835297121 || b8 == 1835626086) {
                    j8 = q7;
                    i9 = 0;
                } else {
                    if (b8 == 1836019558 || b8 == 1836475768) {
                        i12 = i8;
                        break;
                    }
                    i14 |= (b8 == 1835295092 ? 0 : i8) ^ 1;
                    if (b8 == 1937007212) {
                        if (j11 > 1000000) {
                            i12 = 0;
                            break;
                        }
                        b8 = 1937007212;
                    }
                    j8 = q7;
                    if ((i13 + j11) - j12 >= i11) {
                        i12 = 0;
                        break;
                    }
                    int i15 = (int) (j11 - j12);
                    i13 += i15;
                    if (b8 != 1718909296) {
                        i9 = 0;
                        if (i15 != 0) {
                            n2Var.P(i15);
                        }
                    } else {
                        if (i15 < 8) {
                            return new j7(1718909296, i15, 8);
                        }
                        y82Var.z(i15);
                        i9 = 0;
                        n2Var.u(y82Var.H(), 0, i15);
                        int b9 = y82Var.b();
                        int i16 = (d(b9, z8) ? 1 : 0) | i14;
                        y82Var.J(4);
                        int C = y82Var.C() / 4;
                        if (i16 == 0 && C > 0) {
                            iArr = new int[C];
                            int i17 = 0;
                            while (true) {
                                if (i17 >= C) {
                                    i10 = i16;
                                    break;
                                }
                                int b10 = y82Var.b();
                                iArr[i17] = b10;
                                if (d(b10, z8)) {
                                    i10 = i8;
                                    break;
                                }
                                i17++;
                            }
                        } else {
                            i10 = i16;
                            iArr = null;
                        }
                        if (i10 == 0) {
                            return new t8(b9, iArr);
                        }
                        i14 = i10;
                    }
                }
                i12 = i9;
                y82Var2 = y82Var;
                q7 = j8;
                j9 = j7;
            }
        }
        u3Var = null;
        return i14 == 0 ? k8.f10919a : z7 != i12 ? i12 != 0 ? d8.f6964b : d8.f6965c : u3Var;
    }

    private static boolean d(int i7, boolean z7) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579) {
            if (z7) {
                return true;
            }
            i7 = 1751476579;
        }
        int[] iArr = f13222a;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }
}
