package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class sc {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.google.android.gms.internal.ads.w72 r18, com.google.android.gms.internal.ads.oc r19) {
        /*
            r0 = r18
            r1 = r19
            r0.e()
            r2 = 3
            r3 = 8
            int r2 = f(r0, r2, r3, r3)
            r1.f13269a = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Ld1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.rx3.a(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.rc.a(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.rc.a(r14, r10)
            int r6 = r0.c()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.k(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.c()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.k(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.c()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.k(r7)
            long r14 = r16 + r6
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.f13270b = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.f13269a
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.wi r0 = com.google.android.gms.internal.ads.wi.b(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.wi r0 = com.google.android.gms.internal.ads.wi.b(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.wi r0 = com.google.android.gms.internal.ads.wi.b(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = f(r0, r2, r3, r3)
            r1.f13271c = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.wi r0 = com.google.android.gms.internal.ads.wi.c(r0)
            throw r0
        Ld1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sc.a(com.google.android.gms.internal.ads.w72, com.google.android.gms.internal.ads.oc):boolean");
    }

    public static pc b(w72 w72Var) {
        int i7;
        int i8;
        char c8;
        int i9;
        int i10;
        int i11;
        char c9;
        int j7 = w72Var.j(8);
        int i12 = 5;
        int j8 = w72Var.j(5);
        if (j8 != 31) {
            switch (j8) {
                case 0:
                    i7 = 96000;
                    break;
                case 1:
                    i7 = 88200;
                    break;
                case 2:
                    i7 = 64000;
                    break;
                case 3:
                    i7 = 48000;
                    break;
                case 4:
                    i7 = 44100;
                    break;
                case 5:
                    i7 = 32000;
                    break;
                case 6:
                    i7 = 24000;
                    break;
                case 7:
                    i7 = 22050;
                    break;
                case 8:
                    i7 = 16000;
                    break;
                case 9:
                    i7 = 12000;
                    break;
                case 10:
                    i7 = 11025;
                    break;
                case 11:
                    i7 = 8000;
                    break;
                case 12:
                    i7 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(j8);
                    throw wi.c(sb.toString());
                case 15:
                    i7 = 57600;
                    break;
                case 16:
                    i7 = 51200;
                    break;
                case 17:
                    i7 = 40000;
                    break;
                case 18:
                    i7 = 38400;
                    break;
                case 19:
                    i7 = 34150;
                    break;
                case 20:
                    i7 = 28800;
                    break;
                case 21:
                    i7 = 25600;
                    break;
                case 22:
                    i7 = 20000;
                    break;
                case 23:
                    i7 = 19200;
                    break;
                case 24:
                    i7 = 17075;
                    break;
                case 25:
                    i7 = 14400;
                    break;
                case 26:
                    i7 = 12800;
                    break;
                case 27:
                    i7 = 9600;
                    break;
            }
        } else {
            i7 = w72Var.j(24);
        }
        int j9 = w72Var.j(3);
        int i13 = 1;
        if (j9 == 0) {
            i8 = 768;
        } else if (j9 == 1) {
            i8 = 1024;
        } else if (j9 == 2 || j9 == 3) {
            i8 = 2048;
        } else {
            if (j9 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(j9);
                throw wi.c(sb2.toString());
            }
            i8 = 4096;
        }
        if (j9 == 0 || j9 == 1) {
            c8 = 0;
        } else if (j9 == 2) {
            c8 = 2;
        } else if (j9 == 3) {
            c8 = 3;
        } else {
            if (j9 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(j9);
                throw wi.c(sb3.toString());
            }
            c8 = 1;
        }
        w72Var.h(2);
        c(w72Var);
        int j10 = w72Var.j(5);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 16;
            if (i14 < j10 + 1) {
                int j11 = w72Var.j(3);
                i15 += f(w72Var, 5, 8, 16) + 1;
                if ((j11 == 0 || j11 == 2) && w72Var.i()) {
                    c(w72Var);
                }
                i14++;
            } else {
                int f8 = f(w72Var, 4, 8, 16) + 1;
                w72Var.g();
                int i17 = 0;
                while (true) {
                    double d8 = 2.0d;
                    if (i17 >= f8) {
                        int i18 = j7;
                        byte[] bArr = null;
                        if (w72Var.i()) {
                            int f9 = f(w72Var, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < f9; i19++) {
                                int f10 = f(w72Var, 4, 8, 16);
                                int f11 = f(w72Var, 4, 8, 16);
                                if (f10 == 7) {
                                    int j12 = w72Var.j(4) + 1;
                                    w72Var.h(4);
                                    byte[] bArr2 = new byte[j12];
                                    for (int i20 = 0; i20 < j12; i20++) {
                                        bArr2[i20] = (byte) w72Var.j(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    w72Var.h(f11 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i7) {
                            case 14700:
                            case 16000:
                                d8 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d8 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d8 = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i7).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i7);
                                throw wi.c(sb4.toString());
                        }
                        return new pc(i18, (int) (i7 * d8), (int) (i8 * d8), bArr3, null);
                    }
                    int j13 = w72Var.j(2);
                    if (j13 == 0) {
                        i9 = j7;
                        i10 = i13;
                        d(w72Var);
                        if (c8 > 0) {
                            e(w72Var);
                        }
                    } else if (j13 == i13) {
                        i10 = i13;
                        if (d(w72Var)) {
                            w72Var.g();
                        }
                        if (c8 > 0) {
                            e(w72Var);
                            i11 = w72Var.j(2);
                            c9 = c8;
                        } else {
                            i11 = 0;
                            c9 = 0;
                        }
                        if (i11 > 0) {
                            w72Var.h(6);
                            int j14 = w72Var.j(2);
                            w72Var.h(4);
                            if (w72Var.i()) {
                                w72Var.h(i12);
                            }
                            if (i11 == 2 || i11 == 3) {
                                w72Var.h(6);
                            }
                            if (j14 == 2) {
                                w72Var.g();
                            }
                        }
                        i9 = j7;
                        int floor = ((int) Math.floor(Math.log(i15 - 1) / Math.log(2.0d))) + 1;
                        int j15 = w72Var.j(2);
                        if (j15 > 0 && w72Var.i()) {
                            w72Var.h(floor);
                        }
                        if (w72Var.i()) {
                            w72Var.h(floor);
                        }
                        if (c9 == 0 && j15 == 0) {
                            w72Var.g();
                        }
                    } else if (j13 != 3) {
                        i9 = j7;
                        i10 = i13;
                    } else {
                        f(w72Var, 4, 8, i16);
                        int f12 = f(w72Var, 4, 8, i16);
                        i10 = i13;
                        if (w72Var.i()) {
                            f(w72Var, 8, i16, 0);
                        }
                        w72Var.g();
                        if (f12 > 0) {
                            w72Var.h(f12 * 8);
                        }
                        i9 = j7;
                    }
                    i17++;
                    j7 = i9;
                    i13 = i10;
                    i12 = 5;
                    i16 = 16;
                }
            }
        }
    }

    private static void c(w72 w72Var) {
        int j7;
        int j8 = w72Var.j(2);
        if (j8 == 0) {
            w72Var.h(6);
            return;
        }
        int f8 = f(w72Var, 5, 8, 16) + 1;
        if (j8 == 1) {
            w72Var.h(f8 * 7);
            return;
        }
        if (j8 == 2) {
            boolean i7 = w72Var.i();
            int i8 = true != i7 ? 5 : 1;
            int i9 = true == i7 ? 7 : 5;
            int i10 = true == i7 ? 8 : 6;
            int i11 = 0;
            while (i11 < f8) {
                if (w72Var.i()) {
                    w72Var.h(7);
                    j7 = 0;
                } else {
                    if (w72Var.j(2) == 3 && w72Var.j(i9) * i8 != 0) {
                        w72Var.g();
                    }
                    j7 = w72Var.j(i10) * i8;
                    if (j7 != 0 && j7 != 180) {
                        w72Var.g();
                    }
                    w72Var.g();
                }
                if (j7 != 0 && j7 != 180 && w72Var.i()) {
                    i11++;
                }
                i11++;
            }
        }
    }

    private static boolean d(w72 w72Var) {
        w72Var.h(3);
        boolean i7 = w72Var.i();
        if (i7) {
            w72Var.h(13);
        }
        return i7;
    }

    private static void e(w72 w72Var) {
        w72Var.h(3);
        w72Var.h(8);
        boolean i7 = w72Var.i();
        boolean i8 = w72Var.i();
        if (i7) {
            w72Var.h(5);
        }
        if (i8) {
            w72Var.h(6);
        }
    }

    private static int f(w72 w72Var, int i7, int i8, int i9) {
        rx3.a(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        qc.a(qc.a(i10, i11), 1 << i9);
        if (w72Var.c() < i7) {
            return -1;
        }
        int j7 = w72Var.j(i7);
        if (j7 != i10) {
            return j7;
        }
        if (w72Var.c() < i8) {
            return -1;
        }
        int j8 = w72Var.j(i8);
        int i12 = j7 + j8;
        if (j8 != i11) {
            return i12;
        }
        if (w72Var.c() < i9) {
            return -1;
        }
        return i12 + w72Var.j(i9);
    }
}
