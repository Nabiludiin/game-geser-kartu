package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: MyApplication */
public final class x6 implements m2 {

    /* renamed from: j0, reason: collision with root package name */
    private static final byte[] f18584j0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: k0, reason: collision with root package name */
    private static final byte[] f18585k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final byte[] f18586l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final byte[] f18587m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final UUID f18588n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final Map f18589o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f18590p0 = 0;
    private long A;
    private final SparseArray B;
    private boolean C;
    private long D;
    private int E;
    private long F;
    private int G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private long X;
    private int Y;
    private int Z;

    /* renamed from: a, reason: collision with root package name */
    private final z6 f18591a;

    /* renamed from: a0, reason: collision with root package name */
    private int f18592a0;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f18593b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f18594b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18595c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f18596c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18597d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f18598d0;

    /* renamed from: e, reason: collision with root package name */
    private final q9 f18599e;

    /* renamed from: e0, reason: collision with root package name */
    private int f18600e0;

    /* renamed from: f, reason: collision with root package name */
    private final y82 f18601f;

    /* renamed from: f0, reason: collision with root package name */
    private byte f18602f0;

    /* renamed from: g, reason: collision with root package name */
    private final y82 f18603g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f18604g0;

    /* renamed from: h, reason: collision with root package name */
    private final y82 f18605h;

    /* renamed from: h0, reason: collision with root package name */
    private p2 f18606h0;

    /* renamed from: i, reason: collision with root package name */
    private final y82 f18607i;

    /* renamed from: i0, reason: collision with root package name */
    private final r6 f18608i0;

    /* renamed from: j, reason: collision with root package name */
    private final y82 f18609j;

    /* renamed from: k, reason: collision with root package name */
    private final y82 f18610k;

    /* renamed from: l, reason: collision with root package name */
    private final y82 f18611l;

    /* renamed from: m, reason: collision with root package name */
    private final y82 f18612m;

    /* renamed from: n, reason: collision with root package name */
    private final y82 f18613n;

    /* renamed from: o, reason: collision with root package name */
    private final y82 f18614o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f18615p;

    /* renamed from: q, reason: collision with root package name */
    private long f18616q;

    /* renamed from: r, reason: collision with root package name */
    private long f18617r;

    /* renamed from: s, reason: collision with root package name */
    private long f18618s;

    /* renamed from: t, reason: collision with root package name */
    private long f18619t;

    /* renamed from: u, reason: collision with root package name */
    private long f18620u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18621v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18622w;

    /* renamed from: x, reason: collision with root package name */
    private w6 f18623x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18624y;

    /* renamed from: z, reason: collision with root package name */
    private int f18625z;

    static {
        String str = hi2.f9535a;
        f18585k0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f18586l0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f18587m0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f18588n0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f18589o0 = Collections.unmodifiableMap(hashMap);
    }

    public x6() {
        this(new r6(), 2, q9.f14305a);
    }

    private static int[] A(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[i7];
        }
        int length = iArr.length;
        return length >= i7 ? iArr : new int[Math.max(length + length, i7)];
    }

    private final void a() {
        if (!this.f18622w) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f18593b;
            if (i7 >= sparseArray.size()) {
                p2 p2Var = this.f18606h0;
                p2Var.getClass();
                p2Var.z();
                this.f18622w = false;
                return;
            }
            if (((w6) sparseArray.valueAt(i7)).W) {
                return;
            } else {
                i7++;
            }
        }
    }

    private final void q(int i7) {
        if (this.f18623x != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 32);
        sb.append("Element ");
        sb.append(i7);
        sb.append(" must be in a TrackEntry");
        throw wi.b(sb.toString(), null);
    }

    private final void r(int i7) {
        if (this.C) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 26);
        sb.append("Element ");
        sb.append(i7);
        sb.append(" must be in a Cues");
        throw wi.b(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r2 = x(r10, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(com.google.android.gms.internal.ads.w6 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x6.s(com.google.android.gms.internal.ads.w6, long, int, int, int):void");
    }

    private final void t(n2 n2Var, int i7) {
        y82 y82Var = this.f18605h;
        if (y82Var.D() >= i7) {
            return;
        }
        if (y82Var.I() < i7) {
            int I = y82Var.I();
            y82Var.B(Math.max(I + I, i7));
        }
        n2Var.s(y82Var.H(), y82Var.D(), i7 - y82Var.D());
        y82Var.E(i7);
    }

    private final int u(n2 n2Var, w6 w6Var, int i7, boolean z7) {
        int i8;
        if ("S_TEXT/UTF8".equals(w6Var.f18056c)) {
            w(n2Var, f18584j0, i7);
            int i9 = this.Z;
            v();
            return i9;
        }
        if ("S_TEXT/ASS".equals(w6Var.f18056c) || "S_TEXT/SSA".equals(w6Var.f18056c)) {
            w(n2Var, f18586l0, i7);
            int i10 = this.Z;
            v();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(w6Var.f18056c)) {
            w(n2Var, f18587m0, i7);
            int i11 = this.Z;
            v();
            return i11;
        }
        if (w6Var.W) {
            w6Var.f18055b0.getClass();
            int i12 = j2.f10315j;
            y82 y82Var = new y82(i7);
            if (n2Var.x(y82Var.H(), 0, i7, true)) {
                n2Var.k();
                if (j2.a(y82Var.Q()) == 1 && y82Var.C() >= 10) {
                    byte[] bArr = new byte[10];
                    y82Var.L(bArr, 0, 10);
                    y82Var.G(0);
                    int c8 = j2.c(bArr);
                    if (y82Var.C() >= c8 + 4) {
                        y82Var.J(c8);
                        if (j2.a(y82Var.b()) == 2) {
                            xn5 a8 = w6Var.f18055b0.a();
                            a8.l0("audio/vnd.dts.hd");
                            w6Var.f18055b0 = a8.m();
                        }
                    }
                }
            }
            w6Var.f18053a0.c(w6Var.f18055b0);
            w6Var.W = false;
            a();
        }
        a4 a4Var = w6Var.f18053a0;
        if (!this.f18594b0) {
            if (w6Var.f18063i) {
                this.U &= -1073741825;
                if (!this.f18596c0) {
                    y82 y82Var2 = this.f18605h;
                    n2Var.s(y82Var2.H(), 0, 1);
                    this.Y++;
                    if ((y82Var2.H()[0] & 128) == 128) {
                        throw wi.b("Extension bit is set in signal byte", null);
                    }
                    this.f18602f0 = y82Var2.H()[0];
                    this.f18596c0 = true;
                }
                byte b8 = this.f18602f0;
                if ((b8 & 1) == 1) {
                    int i13 = b8 & 2;
                    this.U |= 1073741824;
                    if (!this.f18604g0) {
                        y82 y82Var3 = this.f18612m;
                        n2Var.s(y82Var3.H(), 0, 8);
                        this.Y += 8;
                        this.f18604g0 = true;
                        y82 y82Var4 = this.f18605h;
                        y82Var4.H()[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        y82Var4.G(0);
                        a4Var.d(y82Var4, 1, 1);
                        this.Z++;
                        y82Var3.G(0);
                        a4Var.d(y82Var3, 8, 1);
                        this.Z += 8;
                    }
                    if (i13 == 2) {
                        if (!this.f18598d0) {
                            y82 y82Var5 = this.f18605h;
                            n2Var.s(y82Var5.H(), 0, 1);
                            this.Y++;
                            y82Var5.G(0);
                            this.f18600e0 = y82Var5.R();
                            this.f18598d0 = true;
                        }
                        int i14 = this.f18600e0 * 4;
                        y82 y82Var6 = this.f18605h;
                        y82Var6.z(i14);
                        n2Var.s(y82Var6.H(), 0, i14);
                        this.Y += i14;
                        int i15 = (this.f18600e0 >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.f18615p;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f18615p = ByteBuffer.allocate(i16);
                        }
                        this.f18615p.position(0);
                        this.f18615p.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i8 = this.f18600e0;
                            if (i17 >= i8) {
                                break;
                            }
                            int h8 = y82Var6.h();
                            int i19 = h8 - i18;
                            if (i17 % 2 == 0) {
                                this.f18615p.putShort((short) i19);
                            } else {
                                this.f18615p.putInt(i19);
                            }
                            i17++;
                            i18 = h8;
                        }
                        int i20 = (i7 - this.Y) - i18;
                        if ((i8 & 1) == 1) {
                            this.f18615p.putInt(i20);
                        } else {
                            this.f18615p.putShort((short) i20);
                            this.f18615p.putInt(0);
                        }
                        y82 y82Var7 = this.f18613n;
                        y82Var7.A(this.f18615p.array(), i16);
                        a4Var.d(y82Var7, i16, 1);
                        this.Z += i16;
                    }
                }
            } else {
                byte[] bArr2 = w6Var.f18064j;
                if (bArr2 != null) {
                    this.f18610k.A(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(w6Var.f18056c) ? w6Var.f18061g > 0 : z7) {
                this.U |= 268435456;
                this.f18614o.z(0);
                int D = (this.f18610k.D() + i7) - this.Y;
                y82 y82Var8 = this.f18605h;
                y82Var8.z(4);
                y82Var8.H()[0] = (byte) ((D >> 24) & 255);
                y82Var8.H()[1] = (byte) ((D >> 16) & 255);
                y82Var8.H()[2] = (byte) ((D >> 8) & 255);
                y82Var8.H()[3] = (byte) (D & 255);
                a4Var.d(y82Var8, 4, 2);
                this.Z += 4;
            }
            this.f18594b0 = true;
        }
        y82 y82Var9 = this.f18610k;
        int D2 = i7 + y82Var9.D();
        if (!"V_MPEG4/ISO/AVC".equals(w6Var.f18056c) && !"V_MPEGH/ISO/HEVC".equals(w6Var.f18056c)) {
            if (w6Var.V != null) {
                rx3.h(y82Var9.D() == 0);
                w6Var.V.b(n2Var);
            }
            while (true) {
                int i21 = this.Y;
                if (i21 >= D2) {
                    break;
                }
                int y7 = y(n2Var, a4Var, D2 - i21);
                this.Y += y7;
                this.Z += y7;
            }
        } else {
            y82 y82Var10 = this.f18603g;
            byte[] H = y82Var10.H();
            H[0] = 0;
            H[1] = 0;
            H[2] = 0;
            int i22 = w6Var.f18057c0;
            int i23 = 4 - i22;
            while (this.Y < D2) {
                int i24 = this.f18592a0;
                if (i24 == 0) {
                    int min = Math.min(i22, y82Var9.C());
                    n2Var.s(H, i23 + min, i22 - min);
                    if (min > 0) {
                        y82Var9.L(H, i23, min);
                    }
                    this.Y += i22;
                    y82Var10.G(0);
                    this.f18592a0 = y82Var10.h();
                    y82 y82Var11 = this.f18601f;
                    y82Var11.G(0);
                    a4Var.e(y82Var11, 4);
                    this.Z += 4;
                } else {
                    int y8 = y(n2Var, a4Var, i24);
                    this.Y += y8;
                    this.Z += y8;
                    this.f18592a0 -= y8;
                }
            }
        }
        if ("A_VORBIS".equals(w6Var.f18056c)) {
            y82 y82Var12 = this.f18607i;
            y82Var12.G(0);
            a4Var.e(y82Var12, 4);
            this.Z += 4;
        }
        int i25 = this.Z;
        v();
        return i25;
    }

    private final void v() {
        this.Y = 0;
        this.Z = 0;
        this.f18592a0 = 0;
        this.f18594b0 = false;
        this.f18596c0 = false;
        this.f18598d0 = false;
        this.f18600e0 = 0;
        this.f18602f0 = (byte) 0;
        this.f18604g0 = false;
        this.f18610k.z(0);
    }

    private final void w(n2 n2Var, byte[] bArr, int i7) {
        int length = bArr.length;
        int i8 = length + i7;
        y82 y82Var = this.f18611l;
        if (y82Var.I() < i8) {
            byte[] copyOf = Arrays.copyOf(bArr, i8 + i7);
            y82Var.A(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, y82Var.H(), 0, length);
        }
        n2Var.s(y82Var.H(), length, i7);
        y82Var.G(0);
        y82Var.E(i8);
    }

    private static byte[] x(long j7, String str, long j8) {
        rx3.a(j7 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i7 = (int) (j7 / 3600000000L);
        Integer valueOf = Integer.valueOf(i7);
        long j9 = j7 - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        Integer valueOf2 = Integer.valueOf(i8);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8)));
        String str2 = hi2.f9535a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int y(n2 n2Var, a4 a4Var, int i7) {
        y82 y82Var = this.f18610k;
        int C = y82Var.C();
        if (C <= 0) {
            return a4Var.f(n2Var, i7, false);
        }
        int min = Math.min(i7, C);
        a4Var.e(y82Var, min);
        return min;
    }

    private final long z(long j7) {
        long j8 = this.f18618s;
        if (j8 != -9223372036854775807L) {
            return hi2.Q(j7, j8, 1000L, RoundingMode.DOWN);
        }
        throw wi.b("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    protected final void c(int i7, long j7, long j8) {
        p2 p2Var = this.f18606h0;
        p2Var.getClass();
        if (i7 == 160) {
            this.W = false;
            this.X = 0L;
            return;
        }
        if (i7 == 174) {
            w6 w6Var = new w6();
            this.f18623x = w6Var;
            w6Var.f18052a = this.f18621v;
            return;
        }
        if (i7 == 183) {
            r(i7);
            this.E = -1;
            this.F = -1L;
            return;
        }
        if (i7 == 187) {
            r(i7);
            this.D = -9223372036854775807L;
            return;
        }
        if (i7 == 19899) {
            this.f18625z = -1;
            this.A = -1L;
            return;
        }
        if (i7 == 20533) {
            q(i7);
            this.f18623x.f18063i = true;
            return;
        }
        if (i7 == 21968) {
            q(i7);
            this.f18623x.f18080z = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f18617r;
            if (j9 != -1 && j9 != j7) {
                throw wi.b("Multiple Segment elements not supported", null);
            }
            this.f18617r = j7;
            this.f18616q = j8;
            return;
        }
        if (i7 == 475249515) {
            this.C = true;
            return;
        }
        if (i7 == 524531317 && !this.f18624y) {
            if (this.f18595c && this.I != -1) {
                this.H = true;
            } else {
                p2Var.B(new p3(this.f18620u, 0L));
                this.f18624y = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c9, code lost:
    
        if (r3.equals("A_OPUS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x030b, code lost:
    
        r1.a(r2, r1.f18058d);
        r24.f18593b.put(r1.f18058d, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01d3, code lost:
    
        if (r3.equals("A_FLAC") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01dd, code lost:
    
        if (r3.equals("A_EAC3") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01e7, code lost:
    
        if (r3.equals("V_MPEG2") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01f1, code lost:
    
        if (r3.equals("S_TEXT/UTF8") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fb, code lost:
    
        if (r3.equals("S_TEXT/WEBVTT") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0205, code lost:
    
        if (r3.equals("V_MPEGH/ISO/HEVC") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x020f, code lost:
    
        if (r3.equals("S_TEXT/SSA") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0219, code lost:
    
        if (r3.equals("S_TEXT/ASS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0223, code lost:
    
        if (r3.equals("A_PCM/INT/LIT") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x022d, code lost:
    
        if (r3.equals("A_PCM/INT/BIG") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0237, code lost:
    
        if (r3.equals("A_PCM/FLOAT/IEEE") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0241, code lost:
    
        if (r3.equals("A_DTS/EXPRESS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x024b, code lost:
    
        if (r3.equals("V_THEORA") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0255, code lost:
    
        if (r3.equals("S_HDMV/PGS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x025f, code lost:
    
        if (r3.equals("V_VP9") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0269, code lost:
    
        if (r3.equals("V_VP8") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0273, code lost:
    
        if (r3.equals("V_AV1") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x027d, code lost:
    
        if (r3.equals("A_DTS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0287, code lost:
    
        if (r3.equals("A_AC3") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0291, code lost:
    
        if (r3.equals("A_AAC") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x029b, code lost:
    
        if (r3.equals("A_DTS/LOSSLESS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02a5, code lost:
    
        if (r3.equals("S_VOBSUB") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02af, code lost:
    
        if (r3.equals("V_MPEG4/ISO/AVC") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02b8, code lost:
    
        if (r3.equals("V_MPEG4/ISO/ASP") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02c1, code lost:
    
        if (r3.equals("S_DVBSUB") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02ca, code lost:
    
        if (r3.equals("V_MS/VFW/FOURCC") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02d3, code lost:
    
        if (r3.equals("A_MPEG/L3") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02dc, code lost:
    
        if (r3.equals("A_MPEG/L2") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e5, code lost:
    
        if (r3.equals("A_VORBIS") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ee, code lost:
    
        if (r3.equals("A_TRUEHD") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02f7, code lost:
    
        if (r3.equals("A_MS/ACM") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0300, code lost:
    
        if (r3.equals("V_MPEG4/ISO/SP") != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0309, code lost:
    
        if (r3.equals("V_MPEG4/ISO/AP") != false) goto L223;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void d(int r25) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x6.d(int):void");
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    protected final void f(int i7, long j7) {
        boolean z7;
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j7);
            sb.append(" not supported");
            throw wi.b(sb.toString(), null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j7);
            sb2.append(" not supported");
            throw wi.b(sb2.toString(), null);
        }
        switch (i7) {
            case 131:
                int i8 = (int) j7;
                if (i8 == 1) {
                    q(i7);
                    this.f18623x.f18059e = 2;
                    return;
                }
                if (i8 == 2) {
                    q(i7);
                    this.f18623x.f18059e = 1;
                    return;
                } else if (i8 == 17) {
                    q(i7);
                    this.f18623x.f18059e = 3;
                    return;
                } else if (i8 != 33) {
                    q(i7);
                    this.f18623x.f18059e = -1;
                    return;
                } else {
                    q(i7);
                    this.f18623x.f18059e = 5;
                    return;
                }
            case 136:
                z7 = j7 == 1;
                q(i7);
                this.f18623x.Y = z7;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.O = z(j7);
                return;
            case 159:
                q(i7);
                this.f18623x.Q = (int) j7;
                return;
            case 176:
                q(i7);
                this.f18623x.f18068n = (int) j7;
                return;
            case 179:
                r(i7);
                this.D = z(j7);
                return;
            case 186:
                q(i7);
                this.f18623x.f18069o = (int) j7;
                return;
            case 215:
                q(i7);
                this.f18623x.f18058d = (int) j7;
                return;
            case 231:
                this.K = z(j7);
                return;
            case 238:
                this.V = (int) j7;
                return;
            case 241:
                r(i7);
                if (this.F == -1) {
                    this.F = j7;
                    return;
                }
                return;
            case 247:
                r(i7);
                this.E = (int) j7;
                return;
            case 251:
                this.W = true;
                return;
            case 16871:
                q(i7);
                this.f18623x.d((int) j7);
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j7);
                sb3.append(" not supported");
                throw wi.b(sb3.toString(), null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j7).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j7);
                    sb4.append(" not supported");
                    throw wi.b(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j7).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j7);
                sb5.append(" not supported");
                throw wi.b(sb5.toString(), null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j7).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j7);
                sb6.append(" not supported");
                throw wi.b(sb6.toString(), null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j7).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j7);
                sb7.append(" not supported");
                throw wi.b(sb7.toString(), null);
            case 21420:
                this.A = j7 + this.f18617r;
                return;
            case 21432:
                int i9 = (int) j7;
                q(i7);
                if (i9 == 0) {
                    this.f18623x.f18079y = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f18623x.f18079y = 2;
                    return;
                } else if (i9 == 3) {
                    this.f18623x.f18079y = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f18623x.f18079y = 3;
                    return;
                }
            case 21680:
                q(i7);
                this.f18623x.f18071q = (int) j7;
                return;
            case 21682:
                q(i7);
                this.f18623x.f18073s = (int) j7;
                return;
            case 21690:
                q(i7);
                this.f18623x.f18072r = (int) j7;
                return;
            case 21930:
                z7 = j7 == 1;
                q(i7);
                this.f18623x.X = z7;
                return;
            case 21938:
                q(i7);
                w6 w6Var = this.f18623x;
                w6Var.f18080z = true;
                w6Var.f18070p = (int) j7;
                return;
            case 21998:
                q(i7);
                this.f18623x.f18061g = (int) j7;
                return;
            case 22186:
                q(i7);
                this.f18623x.T = j7;
                return;
            case 22203:
                q(i7);
                this.f18623x.U = j7;
                return;
            case 25188:
                q(i7);
                this.f18623x.R = (int) j7;
                return;
            case 30114:
                this.X = j7;
                return;
            case 30321:
                int i10 = (int) j7;
                q(i7);
                if (i10 == 0) {
                    this.f18623x.f18074t = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f18623x.f18074t = 1;
                    return;
                } else if (i10 == 2) {
                    this.f18623x.f18074t = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f18623x.f18074t = 3;
                    return;
                }
            case 2352003:
                q(i7);
                this.f18623x.f18060f = (int) j7;
                return;
            case 2807729:
                this.f18618s = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        int i11 = (int) j7;
                        q(i7);
                        if (i11 == 1) {
                            this.f18623x.C = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f18623x.C = 1;
                            return;
                        }
                    case 21946:
                        q(i7);
                        int c8 = w25.c((int) j7);
                        if (c8 != -1) {
                            this.f18623x.B = c8;
                            return;
                        }
                        return;
                    case 21947:
                        q(i7);
                        this.f18623x.f18080z = true;
                        int b8 = w25.b((int) j7);
                        if (b8 != -1) {
                            this.f18623x.A = b8;
                            return;
                        }
                        return;
                    case 21948:
                        q(i7);
                        this.f18623x.D = (int) j7;
                        return;
                    case 21949:
                        q(i7);
                        this.f18623x.E = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void g(int i7, double d8) {
        if (i7 == 181) {
            q(i7);
            this.f18623x.S = (int) d8;
            return;
        }
        if (i7 == 17545) {
            this.f18619t = (long) d8;
            return;
        }
        switch (i7) {
            case 21969:
                q(i7);
                this.f18623x.F = (float) d8;
                break;
            case 21970:
                q(i7);
                this.f18623x.G = (float) d8;
                break;
            case 21971:
                q(i7);
                this.f18623x.H = (float) d8;
                break;
            case 21972:
                q(i7);
                this.f18623x.I = (float) d8;
                break;
            case 21973:
                q(i7);
                this.f18623x.J = (float) d8;
                break;
            case 21974:
                q(i7);
                this.f18623x.K = (float) d8;
                break;
            case 21975:
                q(i7);
                this.f18623x.L = (float) d8;
                break;
            case 21976:
                q(i7);
                this.f18623x.M = (float) d8;
                break;
            case 21977:
                q(i7);
                this.f18623x.N = (float) d8;
                break;
            case 21978:
                q(i7);
                this.f18623x.O = (float) d8;
                break;
            default:
                switch (i7) {
                    case 30323:
                        q(i7);
                        this.f18623x.f18075u = (float) d8;
                        break;
                    case 30324:
                        q(i7);
                        this.f18623x.f18076v = (float) d8;
                        break;
                    case 30325:
                        q(i7);
                        this.f18623x.f18077w = (float) d8;
                        break;
                }
        }
    }

    protected final void h(int i7, String str) {
        if (i7 == 134) {
            q(i7);
            this.f18623x.f18056c = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 == 21358) {
                q(i7);
                this.f18623x.f18054b = str;
                return;
            } else {
                if (i7 != 2274716) {
                    return;
                }
                q(i7);
                this.f18623x.e(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f18621v = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw wi.b(sb.toString(), null);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.K = -9223372036854775807L;
        int i7 = 0;
        this.M = 0;
        this.f18608i0.b();
        this.f18591a.a();
        v();
        this.C = false;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        while (true) {
            SparseArray sparseArray = this.f18593b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            b4 b4Var = ((w6) sparseArray.valueAt(i7)).V;
            if (b4Var != null) {
                b4Var.a();
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        return new y6().a(n2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        if (this.f18597d) {
            p2Var = new t9(p2Var, this.f18599e);
        }
        this.f18606h0 = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        int i7 = 0;
        this.L = false;
        while (!this.L) {
            if (this.f18608i0.c(n2Var)) {
                long o7 = n2Var.o();
                if (this.H) {
                    this.J = o7;
                    n3Var.f12555a = this.I;
                    this.H = false;
                    return 1;
                }
                if (this.f18624y) {
                    long j7 = this.J;
                    if (j7 != -1) {
                        n3Var.f12555a = j7;
                        this.J = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.f18593b;
                    if (i7 >= sparseArray.size()) {
                        return -1;
                    }
                    w6 w6Var = (w6) sparseArray.valueAt(i7);
                    w6Var.b();
                    b4 b4Var = w6Var.V;
                    if (b4Var != null) {
                        b4Var.d(w6Var.f18053a0, w6Var.f18065k);
                    }
                    i7++;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0276, code lost:
    
        throw com.google.android.gms.internal.ads.wi.b("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m(int r26, int r27, com.google.android.gms.internal.ads.n2 r28) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x6.m(int, int, com.google.android.gms.internal.ads.n2):void");
    }

    x6(r6 r6Var, int i7, q9 q9Var) {
        this.f18617r = -1L;
        this.f18618s = -9223372036854775807L;
        this.f18619t = -9223372036854775807L;
        this.f18620u = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1L;
        this.G = -1;
        this.I = -1L;
        this.J = -1L;
        this.K = -9223372036854775807L;
        this.f18608i0 = r6Var;
        r6Var.a(new t6(this, null));
        this.f18599e = q9Var;
        this.B = new SparseArray();
        this.f18595c = 1 == ((i7 & 1) ^ 1);
        this.f18597d = (i7 & 2) == 0;
        this.f18591a = new z6();
        this.f18593b = new SparseArray();
        this.f18605h = new y82(4);
        this.f18607i = new y82(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18609j = new y82(4);
        this.f18601f = new y82(p63.f13680a);
        this.f18603g = new y82(4);
        this.f18610k = new y82();
        this.f18611l = new y82();
        this.f18612m = new y82(8);
        this.f18613n = new y82();
        this.f18614o = new y82();
        this.R = new int[1];
        this.f18622w = true;
    }

    public x6(q9 q9Var, int i7) {
        this(new r6(), 0, q9Var);
    }
}
