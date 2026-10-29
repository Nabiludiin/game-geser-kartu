package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: MyApplication */
public final class w6 {
    public byte[] P;
    public b4 V;
    public boolean X;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18052a;

    /* renamed from: a0, reason: collision with root package name */
    public a4 f18053a0;

    /* renamed from: b, reason: collision with root package name */
    public String f18054b;

    /* renamed from: b0, reason: collision with root package name */
    public eq5 f18055b0;

    /* renamed from: c, reason: collision with root package name */
    public String f18056c;

    /* renamed from: c0, reason: collision with root package name */
    public int f18057c0;

    /* renamed from: d, reason: collision with root package name */
    public int f18058d;

    /* renamed from: e, reason: collision with root package name */
    public int f18059e;

    /* renamed from: f, reason: collision with root package name */
    public int f18060f;

    /* renamed from: g, reason: collision with root package name */
    public int f18061g;

    /* renamed from: h, reason: collision with root package name */
    private int f18062h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18063i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f18064j;

    /* renamed from: k, reason: collision with root package name */
    public y3 f18065k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f18066l;

    /* renamed from: m, reason: collision with root package name */
    public uj5 f18067m;

    /* renamed from: n, reason: collision with root package name */
    public int f18068n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f18069o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f18070p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18071q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f18072r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f18073s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f18074t = -1;

    /* renamed from: u, reason: collision with root package name */
    public float f18075u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f18076v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public float f18077w = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f18078x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f18079y = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18080z = false;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = 8000;
    public long T = 0;
    public long U = 0;
    public boolean W = false;
    public boolean Y = true;
    private String Z = "eng";

    protected w6() {
    }

    private static Pair f(y82 y82Var) {
        try {
            y82Var.J(16);
            long a8 = y82Var.a();
            if (a8 == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (a8 == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (a8 != 826496599) {
                gv1.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int F = y82Var.F() + 20;
            byte[] H = y82Var.H();
            while (true) {
                int length = H.length;
                if (F >= length - 4) {
                    throw wi.b("Failed to find FourCC VC1 initialization data", null);
                }
                int i7 = F + 1;
                if (H[F] == 0 && H[i7] == 0 && H[F + 2] == 1 && H[F + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(H, F, length)));
                }
                F = i7;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw wi.b("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) {
        int i7;
        int i8;
        try {
            if (bArr[0] != 2) {
                throw wi.b("Error parsing vorbis codec private", null);
            }
            int i9 = 0;
            int i10 = 1;
            while (true) {
                int i11 = bArr[i10];
                i10++;
                i7 = i11 & 255;
                if (i7 != 255) {
                    break;
                }
                i9 += 255;
            }
            int i12 = i9 + i7;
            int i13 = 0;
            while (true) {
                int i14 = bArr[i10];
                i10++;
                i8 = i14 & 255;
                if (i8 != 255) {
                    break;
                }
                i13 += 255;
            }
            int i15 = i13 + i8;
            if (bArr[i10] != 1) {
                throw wi.b("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            int i16 = i10 + i12;
            if (bArr[i16] != 3) {
                throw wi.b("Error parsing vorbis codec private", null);
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw wi.b("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw wi.b("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(y82 y82Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int T = y82Var.T();
            if (T == 1) {
                return true;
            }
            if (T == 65534) {
                y82Var.G(24);
                long d8 = y82Var.d();
                uuid = x6.f18588n0;
                if (d8 == uuid.getMostSignificantBits()) {
                    long d9 = y82Var.d();
                    uuid2 = x6.f18588n0;
                    if (d9 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw wi.b("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) {
        byte[] bArr = this.f18066l;
        if (bArr != null) {
            return bArr;
        }
        throw wi.b("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.p2 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w6.a(com.google.android.gms.internal.ads.p2, int):void");
    }

    final /* synthetic */ void b() {
        this.f18053a0.getClass();
    }

    final /* synthetic */ int c() {
        return this.f18062h;
    }

    final /* synthetic */ void d(int i7) {
        this.f18062h = i7;
    }

    final /* synthetic */ void e(String str) {
        this.Z = str;
    }
}
