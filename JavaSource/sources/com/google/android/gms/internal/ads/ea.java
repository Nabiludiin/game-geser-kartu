package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class ea implements s9 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f7495h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f7496i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f7497j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f7498a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f7499b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f7500c;

    /* renamed from: d, reason: collision with root package name */
    private final x9 f7501d;

    /* renamed from: e, reason: collision with root package name */
    private final w9 f7502e;

    /* renamed from: f, reason: collision with root package name */
    private final da f7503f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f7504g;

    public ea(List list) {
        y82 y82Var = new y82((byte[]) list.get(0));
        int S = y82Var.S();
        int S2 = y82Var.S();
        Paint paint = new Paint();
        this.f7498a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7499b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7500c = new Canvas();
        this.f7501d = new x9(719, 575, 0, 719, 0, 575);
        this.f7502e = new w9(0, d(), e(), f());
        this.f7503f = new da(S, S2);
    }

    private static w9 b(w72 w72Var, int i7) {
        int j7;
        int j8;
        int i8;
        int i9;
        int i10 = 8;
        int j9 = w72Var.j(8);
        w72Var.h(8);
        int[] d8 = d();
        int[] e8 = e();
        int[] f8 = f();
        int i11 = i7 - 2;
        while (i11 > 0) {
            int j10 = w72Var.j(i10);
            int j11 = w72Var.j(i10);
            int[] iArr = (j11 & 128) != 0 ? d8 : (j11 & 64) != 0 ? e8 : f8;
            if ((j11 & 1) != 0) {
                i8 = w72Var.j(i10);
                i9 = w72Var.j(i10);
                j7 = w72Var.j(i10);
                j8 = w72Var.j(i10);
                i11 -= 6;
            } else {
                int j12 = w72Var.j(6) << 2;
                int j13 = w72Var.j(4) << 4;
                i11 -= 4;
                j7 = w72Var.j(4) << 4;
                j8 = w72Var.j(2) << 6;
                i8 = j12;
                i9 = j13;
            }
            if (i8 == 0) {
                j8 = 255;
            }
            if (i8 == 0) {
                j7 = 0;
            }
            if (i8 == 0) {
                i9 = 0;
            }
            double d9 = i8;
            String str = hi2.f9535a;
            double d10 = i9 - 128;
            double d11 = j7 - 128;
            iArr[j10] = g((byte) (255 - (j8 & 255)), Math.max(0, Math.min((int) (d9 + (1.402d * d10)), 255)), Math.max(0, Math.min((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d9 + (d11 * 1.772d)), 255)));
            j9 = j9;
            i10 = 8;
        }
        return new w9(j9, d8, e8, f8);
    }

    private static y9 c(w72 w72Var) {
        byte[] bArr;
        int j7 = w72Var.j(16);
        w72Var.h(4);
        int j8 = w72Var.j(2);
        boolean i7 = w72Var.i();
        w72Var.h(1);
        byte[] bArr2 = hi2.f9536b;
        if (j8 == 1) {
            w72Var.h(w72Var.j(8) * 16);
        } else if (j8 == 0) {
            int j9 = w72Var.j(16);
            int j10 = w72Var.j(16);
            if (j9 > 0) {
                bArr2 = new byte[j9];
                w72Var.n(bArr2, 0, j9);
            }
            if (j10 > 0) {
                bArr = new byte[j10];
                w72Var.n(bArr, 0, j10);
                return new y9(j7, i7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new y9(j7, i7, bArr2, bArr);
    }

    private static int[] d() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            int i8 = i7 & 4;
            int i9 = i7 & 2;
            int i10 = i7 & 1;
            if (i7 < 8) {
                iArr[i7] = g(255, 1 != i10 ? 0 : 255, i9 != 0 ? 255 : 0, i8 != 0 ? 255 : 0);
            } else {
                iArr[i7] = g(255, 1 != i10 ? 0 : 127, i9 != 0 ? 127 : 0, i8 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = g(63, 1 != (i7 & 1) ? 0 : 255, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = g(255, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = g(127, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = g(255, (1 != (i7 & 1) ? 0 : 43) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = g(255, (1 != (i7 & 1) ? 0 : 43) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int g(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201 A[LOOP:3: B:85:0x0163->B:98:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ea.h(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] i(int i7, int i8, w72 w72Var) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) w72Var.j(i8);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        boolean z7;
        k9 k9Var;
        Canvas canvas;
        char c8;
        char c9;
        char c10;
        int i9;
        da daVar;
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        ba baVar;
        int j7;
        int j8;
        int i13;
        int i14;
        int i15;
        int i16;
        w72 w72Var = new w72(bArr, i7 + i8);
        w72Var.f(i7);
        while (true) {
            z7 = true;
            if (w72Var.c() >= 48 && w72Var.j(8) == 15) {
                da daVar2 = this.f7503f;
                int j9 = w72Var.j(8);
                int j10 = w72Var.j(16);
                int j11 = w72Var.j(16);
                int e8 = w72Var.e() + j11;
                if (j11 * 8 > w72Var.c()) {
                    gv1.c("DvbParser", "Data field length exceeds limit");
                    w72Var.h(w72Var.c());
                } else {
                    switch (j9) {
                        case 16:
                            if (j10 == daVar2.f7001a) {
                                z9 z9Var = daVar2.f7009i;
                                int j12 = w72Var.j(8);
                                int j13 = w72Var.j(4);
                                int j14 = w72Var.j(2);
                                w72Var.h(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = j11 - 2; i17 > 0; i17 -= 6) {
                                    int j15 = w72Var.j(8);
                                    w72Var.h(8);
                                    sparseArray.put(j15, new aa(w72Var.j(16), w72Var.j(16)));
                                }
                                z9 z9Var2 = new z9(j12, j13, j14, sparseArray);
                                if (z9Var2.f20073b != 0) {
                                    daVar2.f7009i = z9Var2;
                                    daVar2.f7003c.clear();
                                    daVar2.f7004d.clear();
                                    daVar2.f7005e.clear();
                                    break;
                                } else if (z9Var != null) {
                                    if (z9Var.f20072a != z9Var2.f20072a) {
                                        daVar2.f7009i = z9Var2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            z9 z9Var3 = daVar2.f7009i;
                            if (j10 == daVar2.f7001a && z9Var3 != null) {
                                int j16 = w72Var.j(8);
                                w72Var.h(4);
                                boolean i18 = w72Var.i();
                                w72Var.h(3);
                                int j17 = w72Var.j(16);
                                int j18 = w72Var.j(16);
                                int j19 = w72Var.j(3);
                                int j20 = w72Var.j(3);
                                w72Var.h(2);
                                int j21 = w72Var.j(8);
                                int j22 = w72Var.j(8);
                                int j23 = w72Var.j(4);
                                int j24 = w72Var.j(2);
                                w72Var.h(2);
                                int i19 = j11 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i19 > 0) {
                                    int j25 = w72Var.j(16);
                                    int j26 = w72Var.j(2);
                                    int j27 = w72Var.j(2);
                                    int j28 = w72Var.j(12);
                                    w72Var.h(4);
                                    int j29 = w72Var.j(12);
                                    int i20 = i19 - 6;
                                    if (j26 != 1) {
                                        if (j26 == 2) {
                                            j26 = 2;
                                        } else {
                                            i19 = i20;
                                            j7 = 0;
                                            j8 = 0;
                                            sparseArray2.put(j25, new ca(j26, j27, j28, j29, j7, j8));
                                        }
                                    }
                                    i19 -= 8;
                                    j7 = w72Var.j(8);
                                    j8 = w72Var.j(8);
                                    sparseArray2.put(j25, new ca(j26, j27, j28, j29, j7, j8));
                                }
                                ba baVar2 = new ba(j16, i18, j17, j18, j19, j20, j21, j22, j23, j24, sparseArray2);
                                if (z9Var3.f20073b == 0 && (baVar = (ba) daVar2.f7003c.get(baVar2.f5635a)) != null) {
                                    int i21 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = baVar.f5644j;
                                        if (i21 < sparseArray3.size()) {
                                            baVar2.f5644j.put(sparseArray3.keyAt(i21), (ca) sparseArray3.valueAt(i21));
                                            i21++;
                                        }
                                    }
                                }
                                daVar2.f7003c.put(baVar2.f5635a, baVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (j10 == daVar2.f7001a) {
                                w9 b8 = b(w72Var, j11);
                                daVar2.f7004d.put(b8.f18116a, b8);
                                break;
                            } else if (j10 == daVar2.f7002b) {
                                w9 b9 = b(w72Var, j11);
                                daVar2.f7006f.put(b9.f18116a, b9);
                                break;
                            }
                            break;
                        case 19:
                            if (j10 == daVar2.f7001a) {
                                y9 c11 = c(w72Var);
                                daVar2.f7005e.put(c11.f19425a, c11);
                                break;
                            } else if (j10 == daVar2.f7002b) {
                                y9 c12 = c(w72Var);
                                daVar2.f7007g.put(c12.f19425a, c12);
                                break;
                            }
                            break;
                        case 20:
                            if (j10 == daVar2.f7001a) {
                                w72Var.h(4);
                                boolean i22 = w72Var.i();
                                w72Var.h(3);
                                int j30 = w72Var.j(16);
                                int j31 = w72Var.j(16);
                                if (i22) {
                                    int j32 = w72Var.j(16);
                                    i13 = w72Var.j(16);
                                    i16 = w72Var.j(16);
                                    i14 = w72Var.j(16);
                                    i15 = j32;
                                } else {
                                    i13 = j30;
                                    i14 = j31;
                                    i15 = 0;
                                    i16 = 0;
                                }
                                daVar2.f7008h = new x9(j30, j31, i15, i13, i16, i14);
                                break;
                            }
                            break;
                    }
                    w72Var.o(e8 - w72Var.e());
                }
            }
        }
        da daVar3 = this.f7503f;
        z9 z9Var4 = daVar3.f7009i;
        if (z9Var4 == null) {
            k9Var = new k9(w04.m(), -9223372036854775807L, -9223372036854775807L);
        } else {
            x9 x9Var = daVar3.f7008h;
            if (x9Var == null) {
                x9Var = this.f7501d;
            }
            Bitmap bitmap = this.f7504g;
            if (bitmap == null || x9Var.f18667a + 1 != bitmap.getWidth() || x9Var.f18668b + 1 != this.f7504g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(x9Var.f18667a + 1, x9Var.f18668b + 1, Bitmap.Config.ARGB_8888);
                this.f7504g = createBitmap;
                this.f7500c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = z9Var4.f20074c;
            int i23 = 0;
            while (i23 < sparseArray4.size()) {
                Canvas canvas3 = this.f7500c;
                canvas3.save();
                aa aaVar = (aa) sparseArray4.valueAt(i23);
                ba baVar3 = (ba) daVar3.f7003c.get(sparseArray4.keyAt(i23));
                int i24 = aaVar.f4837a + x9Var.f18669c;
                int i25 = aaVar.f4838b + x9Var.f18671e;
                int i26 = baVar3.f5637c;
                int i27 = i24 + i26;
                boolean z8 = z7;
                int min = Math.min(i27, x9Var.f18670d);
                int i28 = baVar3.f5638d;
                int i29 = i25 + i28;
                canvas3.clipRect(i24, i25, min, Math.min(i29, x9Var.f18672f));
                int i30 = baVar3.f5640f;
                w9 w9Var = (w9) daVar3.f7004d.get(i30);
                if (w9Var == null && (w9Var = (w9) daVar3.f7006f.get(i30)) == null) {
                    w9Var = this.f7502e;
                }
                SparseArray sparseArray5 = baVar3.f5644j;
                SparseArray sparseArray6 = sparseArray4;
                int i31 = i23;
                int i32 = 0;
                while (i32 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i32);
                    int i33 = i32;
                    ca caVar = (ca) sparseArray5.valueAt(i32);
                    SparseArray sparseArray7 = sparseArray5;
                    y9 y9Var = (y9) daVar3.f7005e.get(keyAt);
                    if (y9Var == null) {
                        y9Var = (y9) daVar3.f7007g.get(keyAt);
                    }
                    if (y9Var != null) {
                        Paint paint = y9Var.f19426b ? null : this.f7498a;
                        i11 = i26;
                        int i34 = baVar3.f5639e;
                        daVar = daVar3;
                        int i35 = caVar.f6331a + i24;
                        int i36 = i25 + caVar.f6332b;
                        canvas2 = canvas3;
                        i10 = i24;
                        int[] iArr = i34 == 3 ? w9Var.f18119d : i34 == 2 ? w9Var.f18118c : w9Var.f18117b;
                        i12 = i27;
                        h(y9Var.f19427c, iArr, i34, i35, i36, paint, canvas2);
                        h(y9Var.f19428d, iArr, i34, i35, i36 + 1, paint, canvas2);
                    } else {
                        daVar = daVar3;
                        canvas2 = canvas3;
                        i10 = i24;
                        i11 = i26;
                        i12 = i27;
                    }
                    i24 = i10;
                    i27 = i12;
                    i32 = i33 + 1;
                    i26 = i11;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    daVar3 = daVar;
                }
                da daVar4 = daVar3;
                Canvas canvas4 = canvas3;
                int i37 = i24;
                int i38 = i26;
                int i39 = i27;
                float f8 = i25;
                float f9 = i37;
                if (baVar3.f5636b) {
                    int i40 = baVar3.f5639e;
                    if (i40 == 3) {
                        i9 = w9Var.f18119d[baVar3.f5641g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i9 = i40 == 2 ? w9Var.f18118c[baVar3.f5642h] : w9Var.f18117b[baVar3.f5643i];
                    }
                    Paint paint2 = this.f7499b;
                    paint2.setColor(i9);
                    float f10 = i39;
                    c9 = c10;
                    c8 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f9, f8, f10, i29, paint2);
                } else {
                    canvas = canvas4;
                    c8 = 3;
                    c9 = 2;
                }
                uv0 uv0Var = new uv0();
                uv0Var.c(Bitmap.createBitmap(this.f7504g, i37, i25, i38, i28));
                float f11 = x9Var.f18667a;
                uv0Var.i(f9 / f11);
                uv0Var.j(0);
                float f12 = x9Var.f18668b;
                uv0Var.f(f8 / f12, 0);
                uv0Var.g(0);
                uv0Var.m(i38 / f11);
                uv0Var.n(i28 / f12);
                arrayList.add(uv0Var.r());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i23 = i31 + 1;
                z7 = z8;
                daVar3 = daVar4;
                sparseArray4 = sparseArray6;
            }
            k9Var = new k9(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        th1Var.d(k9Var);
    }
}
