package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.d;
import w.l;
import w.n;
import w.p;

/* compiled from: MyApplication */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList X;
    private boolean[] Y;
    public b[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f26622a0;

    /* renamed from: b0, reason: collision with root package name */
    int f26624b0;

    /* renamed from: c, reason: collision with root package name */
    public w.c f26625c;

    /* renamed from: c0, reason: collision with root package name */
    int f26626c0;

    /* renamed from: d, reason: collision with root package name */
    public w.c f26627d;

    /* renamed from: d0, reason: collision with root package name */
    public float f26628d0;

    /* renamed from: e0, reason: collision with root package name */
    protected int f26630e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f26632f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f26634g0;

    /* renamed from: h0, reason: collision with root package name */
    int f26636h0;

    /* renamed from: i0, reason: collision with root package name */
    int f26638i0;

    /* renamed from: j0, reason: collision with root package name */
    protected int f26640j0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f26642k0;

    /* renamed from: l0, reason: collision with root package name */
    int f26644l0;

    /* renamed from: m0, reason: collision with root package name */
    protected int f26646m0;

    /* renamed from: n0, reason: collision with root package name */
    protected int f26648n0;

    /* renamed from: o, reason: collision with root package name */
    public String f26649o;

    /* renamed from: o0, reason: collision with root package name */
    float f26650o0;

    /* renamed from: p0, reason: collision with root package name */
    float f26652p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f26654q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f26656r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f26658s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f26660t0;

    /* renamed from: u0, reason: collision with root package name */
    private String f26662u0;

    /* renamed from: v0, reason: collision with root package name */
    private String f26664v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f26666w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f26668x0;

    /* renamed from: y0, reason: collision with root package name */
    boolean f26670y0;

    /* renamed from: z0, reason: collision with root package name */
    int f26672z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f26621a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f26623b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public l f26629e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f26631f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f26633g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f26635h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26637i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26639j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26641k = true;

    /* renamed from: l, reason: collision with root package name */
    private int f26643l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f26645m = -1;

    /* renamed from: n, reason: collision with root package name */
    public u.a f26647n = new u.a(this);

    /* renamed from: p, reason: collision with root package name */
    private boolean f26651p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26653q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26655r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26657s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f26659t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f26661u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f26663v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f26665w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f26667x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f26669y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f26671z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26673a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26674b;

        static {
            int[] iArr = new int[b.values().length];
            f26674b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26674b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26674b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26674b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f26673a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26673a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26673a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26673a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26673a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26673a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26673a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26673a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26673a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: MyApplication */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f26622a0 = null;
        this.f26624b0 = 0;
        this.f26626c0 = 0;
        this.f26628d0 = 0.0f;
        this.f26630e0 = -1;
        this.f26632f0 = 0;
        this.f26634g0 = 0;
        this.f26636h0 = 0;
        this.f26638i0 = 0;
        this.f26640j0 = 0;
        this.f26642k0 = 0;
        this.f26644l0 = 0;
        float f8 = K0;
        this.f26650o0 = f8;
        this.f26652p0 = f8;
        this.f26656r0 = 0;
        this.f26658s0 = 0;
        this.f26660t0 = false;
        this.f26662u0 = null;
        this.f26664v0 = null;
        this.f26670y0 = false;
        this.f26672z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb, String str, int i7, int i8, int i9, int i10, int i11, int i12, float f8, float f9) {
        sb.append(str);
        sb.append(" :  {\n");
        v0(sb, "      size", i7, 0);
        v0(sb, "      min", i8, 0);
        v0(sb, "      max", i9, Integer.MAX_VALUE);
        v0(sb, "      matchMin", i11, 0);
        v0(sb, "      matchDef", i12, 0);
        u0(sb, "      matchPercent", f8, 1.0f);
        sb.append("    },\n");
    }

    private void O(StringBuilder sb, String str, d dVar) {
        if (dVar.f26606f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f26606f);
        sb.append("'");
        if (dVar.f26608h != Integer.MIN_VALUE || dVar.f26607g != 0) {
            sb.append(",");
            sb.append(dVar.f26607g);
            if (dVar.f26608h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.f26608h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i7) {
        d dVar;
        d dVar2;
        int i8 = i7 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i8];
        d dVar4 = dVar3.f26606f;
        return (dVar4 == null || dVar4.f26606f == dVar3 || (dVar2 = (dVar = dVarArr[i8 + 1]).f26606f) == null || dVar2.f26606f != dVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x051f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(s.d r31, boolean r32, boolean r33, boolean r34, boolean r35, s.i r36, s.i r37, v.e.b r38, boolean r39, v.d r40, v.d r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.i(s.d, boolean, boolean, boolean, boolean, s.i, s.i, v.e$b, boolean, v.d, v.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb, String str, float f8, float f9) {
        if (f8 == f9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f8);
        sb.append(",\n");
    }

    private void v0(StringBuilder sb, String str, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i7);
        sb.append(",\n");
    }

    private void w0(StringBuilder sb, String str, float f8, int i7) {
        if (f8 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f8);
        sb.append(",");
        sb.append(i7);
        sb.append("");
        sb.append("],\n");
    }

    public int A() {
        return this.M;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void A0(String str) {
        float f8;
        int i7 = 0;
        if (str == null || str.length() == 0) {
            this.f26628d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i8 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i8 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f8 = Float.parseFloat(substring2);
            }
            f8 = i7;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f8 = i8 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f8 = i7;
        }
        i7 = (f8 > i7 ? 1 : (f8 == i7 ? 0 : -1));
        if (i7 > 0) {
            this.f26628d0 = f8;
            this.f26630e0 = i8;
        }
    }

    public int B() {
        return this.N;
    }

    public void B0(int i7) {
        if (this.J) {
            int i8 = i7 - this.f26644l0;
            int i9 = this.f26626c0 + i8;
            this.f26634g0 = i8;
            this.P.s(i8);
            this.R.s(i9);
            this.S.s(i7);
            this.f26653q = true;
        }
    }

    public int C(int i7) {
        if (i7 == 0) {
            return U();
        }
        if (i7 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i7, int i8) {
        if (this.f26651p) {
            return;
        }
        this.O.s(i7);
        this.Q.s(i8);
        this.f26632f0 = i7;
        this.f26624b0 = i8 - i7;
        this.f26651p = true;
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i7) {
        this.O.s(i7);
        this.f26632f0 = i7;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i7) {
        this.P.s(i7);
        this.f26634g0 = i7;
    }

    public int F() {
        return this.f26648n0;
    }

    public void F0(int i7, int i8) {
        if (this.f26653q) {
            return;
        }
        this.P.s(i7);
        this.R.s(i8);
        this.f26634g0 = i7;
        this.f26626c0 = i8 - i7;
        if (this.J) {
            this.S.s(i7 + this.f26644l0);
        }
        this.f26653q = true;
    }

    public int G() {
        return this.f26646m0;
    }

    public void G0(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = i9 - i7;
        int i14 = i10 - i8;
        this.f26632f0 = i7;
        this.f26634g0 = i8;
        if (this.f26658s0 == 8) {
            this.f26624b0 = 0;
            this.f26626c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i13 < (i12 = this.f26624b0)) {
            i13 = i12;
        }
        if (bVarArr[1] == bVar2 && i14 < (i11 = this.f26626c0)) {
            i14 = i11;
        }
        this.f26624b0 = i13;
        this.f26626c0 = i14;
        int i15 = this.f26648n0;
        if (i14 < i15) {
            this.f26626c0 = i15;
        }
        int i16 = this.f26646m0;
        if (i13 < i16) {
            this.f26624b0 = i16;
        }
        int i17 = this.A;
        if (i17 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f26624b0 = Math.min(this.f26624b0, i17);
        }
        int i18 = this.D;
        if (i18 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f26626c0 = Math.min(this.f26626c0, i18);
        }
        int i19 = this.f26624b0;
        if (i13 != i19) {
            this.f26643l = i19;
        }
        int i20 = this.f26626c0;
        if (i14 != i20) {
            this.f26645m = i20;
        }
    }

    public e H(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.R).f26606f) != null && dVar2.f26606f == dVar) {
                return dVar2.f26604d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f26606f;
        if (dVar4 == null || dVar4.f26606f != dVar3) {
            return null;
        }
        return dVar4.f26604d;
    }

    public void H0(boolean z7) {
        this.J = z7;
    }

    public e I() {
        return this.f26622a0;
    }

    public void I0(int i7) {
        this.f26626c0 = i7;
        int i8 = this.f26648n0;
        if (i7 < i8) {
            this.f26626c0 = i8;
        }
    }

    public e J(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.P).f26606f) != null && dVar2.f26606f == dVar) {
                return dVar2.f26604d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f26606f;
        if (dVar4 == null || dVar4.f26606f != dVar3) {
            return null;
        }
        return dVar4.f26604d;
    }

    public void J0(float f8) {
        this.f26650o0 = f8;
    }

    public int K() {
        return V() + this.f26624b0;
    }

    public void K0(int i7) {
        this.f26672z0 = i7;
    }

    public p L(int i7) {
        if (i7 == 0) {
            return this.f26629e;
        }
        if (i7 == 1) {
            return this.f26631f;
        }
        return null;
    }

    public void L0(int i7, int i8) {
        this.f26632f0 = i7;
        int i9 = i8 - i7;
        this.f26624b0 = i9;
        int i10 = this.f26646m0;
        if (i9 < i10) {
            this.f26624b0 = i10;
        }
    }

    public void M(StringBuilder sb) {
        sb.append("  " + this.f26649o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f26624b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f26626c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f26632f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f26634g0);
        sb.append("\n");
        O(sb, "left", this.O);
        O(sb, "top", this.P);
        O(sb, "right", this.Q);
        O(sb, "bottom", this.R);
        O(sb, "baseline", this.S);
        O(sb, "centerX", this.T);
        O(sb, "centerY", this.U);
        N(sb, "    width", this.f26624b0, this.f26646m0, this.H[0], this.f26643l, this.f26671z, this.f26665w, this.B, this.D0[0]);
        N(sb, "    height", this.f26626c0, this.f26648n0, this.H[1], this.f26645m, this.C, this.f26667x, this.E, this.D0[1]);
        w0(sb, "    dimensionRatio", this.f26628d0, this.f26630e0);
        u0(sb, "    horizontalBias", this.f26650o0, K0);
        u0(sb, "    verticalBias", this.f26652p0, K0);
        v0(sb, "    horizontalChainStyle", this.f26672z0, 0);
        v0(sb, "    verticalChainStyle", this.A0, 0);
        sb.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i7, int i8, int i9, float f8) {
        this.f26665w = i7;
        this.f26671z = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.A = i9;
        this.B = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i7 != 0) {
            return;
        }
        this.f26665w = 2;
    }

    public void O0(float f8) {
        this.D0[0] = f8;
    }

    public float P() {
        return this.f26652p0;
    }

    protected void P0(int i7, boolean z7) {
        this.Y[i7] = z7;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z7) {
        this.K = z7;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(int i7, int i8) {
        this.M = i7;
        this.N = i8;
        U0(false);
    }

    public int S() {
        int i7 = this.O != null ? this.P.f26607g : 0;
        return this.Q != null ? i7 + this.R.f26607g : i7;
    }

    public void S0(int i7) {
        this.H[1] = i7;
    }

    public int T() {
        return this.f26658s0;
    }

    public void T0(int i7) {
        this.H[0] = i7;
    }

    public int U() {
        if (this.f26658s0 == 8) {
            return 0;
        }
        return this.f26624b0;
    }

    public void U0(boolean z7) {
        this.f26637i = z7;
    }

    public int V() {
        e eVar = this.f26622a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f26632f0 : ((f) eVar).S0 + this.f26632f0;
    }

    public void V0(int i7) {
        if (i7 < 0) {
            this.f26648n0 = 0;
        } else {
            this.f26648n0 = i7;
        }
    }

    public int W() {
        e eVar = this.f26622a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f26634g0 : ((f) eVar).T0 + this.f26634g0;
    }

    public void W0(int i7) {
        if (i7 < 0) {
            this.f26646m0 = 0;
        } else {
            this.f26646m0 = i7;
        }
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i7, int i8) {
        this.f26632f0 = i7;
        this.f26634g0 = i8;
    }

    public boolean Y(int i7) {
        if (i7 == 0) {
            return (this.O.f26606f != null ? 1 : 0) + (this.Q.f26606f != null ? 1 : 0) < 2;
        }
        return ((this.P.f26606f != null ? 1 : 0) + (this.R.f26606f != null ? 1 : 0)) + (this.S.f26606f != null ? 1 : 0) < 2;
    }

    public void Y0(e eVar) {
        this.f26622a0 = eVar;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((d) this.X.get(i7)).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(float f8) {
        this.f26652p0 = f8;
    }

    public boolean a0() {
        return (this.f26643l == -1 && this.f26645m == -1) ? false : true;
    }

    public void a1(int i7) {
        this.A0 = i7;
    }

    public boolean b0(int i7, int i8) {
        d dVar;
        d dVar2;
        if (i7 == 0) {
            d dVar3 = this.O.f26606f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.Q.f26606f) != null && dVar2.m() && (this.Q.f26606f.d() - this.Q.e()) - (this.O.f26606f.d() + this.O.e()) >= i8;
        }
        d dVar4 = this.P.f26606f;
        if (dVar4 != null && dVar4.m() && (dVar = this.R.f26606f) != null && dVar.m() && (this.R.f26606f.d() - this.R.e()) - (this.P.f26606f.d() + this.P.e()) >= i8) {
            return true;
        }
        return false;
    }

    public void b1(int i7, int i8) {
        this.f26634g0 = i7;
        int i9 = i8 - i7;
        this.f26626c0 = i9;
        int i10 = this.f26648n0;
        if (i9 < i10) {
            this.f26626c0 = i10;
        }
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i7, int i8) {
        m(bVar).a(eVar.m(bVar2), i7, i8, true);
    }

    public void c1(b bVar) {
        this.Z[1] = bVar;
    }

    public void d1(int i7, int i8, int i9, float f8) {
        this.f26667x = i7;
        this.C = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.D = i9;
        this.E = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i7 != 0) {
            return;
        }
        this.f26667x = 2;
    }

    public void e(f fVar, s.d dVar, HashSet hashSet, int i7, boolean z7) {
        if (z7) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.O1(64));
        }
        if (i7 == 0) {
            HashSet c8 = this.O.c();
            if (c8 != null) {
                Iterator it = c8.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f26604d.e(fVar, dVar, hashSet, i7, true);
                }
            }
            HashSet c9 = this.Q.c();
            if (c9 != null) {
                Iterator it2 = c9.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f26604d.e(fVar, dVar, hashSet, i7, true);
                }
                return;
            }
            return;
        }
        HashSet c10 = this.P.c();
        if (c10 != null) {
            Iterator it3 = c10.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f26604d.e(fVar, dVar, hashSet, i7, true);
            }
        }
        HashSet c11 = this.R.c();
        if (c11 != null) {
            Iterator it4 = c11.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f26604d.e(fVar, dVar, hashSet, i7, true);
            }
        }
        HashSet c12 = this.S.c();
        if (c12 != null) {
            Iterator it5 = c12.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f26604d.e(fVar, dVar, hashSet, i7, true);
            }
        }
    }

    public boolean e0() {
        return this.f26655r;
    }

    public void e1(float f8) {
        this.D0[1] = f8;
    }

    boolean f() {
        return this instanceof g;
    }

    public boolean f0(int i7) {
        return this.Y[i7];
    }

    public void f1(int i7) {
        this.f26658s0 = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r13 != 3) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(s.d r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.g(s.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f26606f;
        if (dVar2 != null && dVar2.f26606f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f26606f;
        return dVar4 != null && dVar4.f26606f == dVar3;
    }

    public void g1(int i7) {
        this.f26624b0 = i7;
        int i8 = this.f26646m0;
        if (i7 < i8) {
            this.f26624b0 = i8;
        }
    }

    public boolean h() {
        return this.f26658s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i7) {
        if (i7 < 0 || i7 > 3) {
            return;
        }
        this.f26663v = i7;
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f26606f;
        if (dVar2 != null && dVar2.f26606f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f26606f;
        return dVar4 != null && dVar4.f26606f == dVar3;
    }

    public void i1(int i7) {
        this.f26632f0 = i7;
    }

    public void j(e eVar, float f8, int i7) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i7, 0);
        this.I = f8;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i7) {
        this.f26634g0 = i7;
    }

    public void k(s.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f26644l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f26637i && this.f26658s0 != 8;
    }

    public void k1(boolean z7, boolean z8, boolean z9, boolean z10) {
        if (this.F == -1) {
            if (z9 && !z10) {
                this.F = 0;
            } else if (!z9 && z10) {
                this.F = 1;
                if (this.f26630e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i7 = this.f26671z;
            if (i7 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i7 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public void l() {
        if (this.f26629e == null) {
            this.f26629e = new l(this);
        }
        if (this.f26631f == null) {
            this.f26631f = new n(this);
        }
    }

    public boolean l0() {
        if (this.f26651p) {
            return true;
        }
        return this.O.m() && this.Q.m();
    }

    public void l1(boolean z7, boolean z8) {
        int i7;
        int i8;
        boolean k7 = z7 & this.f26629e.k();
        boolean k8 = z8 & this.f26631f.k();
        l lVar = this.f26629e;
        int i9 = lVar.f27005h.f26951g;
        n nVar = this.f26631f;
        int i10 = nVar.f27005h.f26951g;
        int i11 = lVar.f27006i.f26951g;
        int i12 = nVar.f27006i.f26951g;
        int i13 = i12 - i10;
        if (i11 - i9 < 0 || i13 < 0 || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            i11 = 0;
            i9 = 0;
            i12 = 0;
            i10 = 0;
        }
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        if (k7) {
            this.f26632f0 = i9;
        }
        if (k8) {
            this.f26634g0 = i10;
        }
        if (this.f26658s0 == 8) {
            this.f26624b0 = 0;
            this.f26626c0 = 0;
            return;
        }
        if (k7) {
            if (this.Z[0] == b.FIXED && i14 < (i8 = this.f26624b0)) {
                i14 = i8;
            }
            this.f26624b0 = i14;
            int i16 = this.f26646m0;
            if (i14 < i16) {
                this.f26624b0 = i16;
            }
        }
        if (k8) {
            if (this.Z[1] == b.FIXED && i15 < (i7 = this.f26626c0)) {
                i15 = i7;
            }
            this.f26626c0 = i15;
            int i17 = this.f26648n0;
            if (i15 < i17) {
                this.f26626c0 = i17;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f26673a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        if (this.f26653q) {
            return true;
        }
        return this.P.m() && this.R.m();
    }

    public void m1(s.d dVar, boolean z7) {
        n nVar;
        l lVar;
        int x7 = dVar.x(this.O);
        int x8 = dVar.x(this.P);
        int x9 = dVar.x(this.Q);
        int x10 = dVar.x(this.R);
        if (z7 && (lVar = this.f26629e) != null) {
            w.f fVar = lVar.f27005h;
            if (fVar.f26954j) {
                w.f fVar2 = lVar.f27006i;
                if (fVar2.f26954j) {
                    x7 = fVar.f26951g;
                    x9 = fVar2.f26951g;
                }
            }
        }
        if (z7 && (nVar = this.f26631f) != null) {
            w.f fVar3 = nVar.f27005h;
            if (fVar3.f26954j) {
                w.f fVar4 = nVar.f27006i;
                if (fVar4.f26954j) {
                    x8 = fVar3.f26951g;
                    x10 = fVar4.f26951g;
                }
            }
        }
        int i7 = x10 - x8;
        if (x9 - x7 < 0 || i7 < 0 || x7 == Integer.MIN_VALUE || x7 == Integer.MAX_VALUE || x8 == Integer.MIN_VALUE || x8 == Integer.MAX_VALUE || x9 == Integer.MIN_VALUE || x9 == Integer.MAX_VALUE || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE) {
            x7 = 0;
            x10 = 0;
            x8 = 0;
            x9 = 0;
        }
        G0(x7, x8, x9, x10);
    }

    public int n() {
        return this.f26644l0;
    }

    public boolean n0() {
        return this.f26657s;
    }

    public float o(int i7) {
        if (i7 == 0) {
            return this.f26650o0;
        }
        if (i7 == 1) {
            return this.f26652p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f26655r = true;
    }

    public int p() {
        return W() + this.f26626c0;
    }

    public void p0() {
        this.f26657s = true;
    }

    public Object q() {
        return this.f26654q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f26662u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f26622a0 = null;
        this.I = 0.0f;
        this.f26624b0 = 0;
        this.f26626c0 = 0;
        this.f26628d0 = 0.0f;
        this.f26630e0 = -1;
        this.f26632f0 = 0;
        this.f26634g0 = 0;
        this.f26640j0 = 0;
        this.f26642k0 = 0;
        this.f26644l0 = 0;
        this.f26646m0 = 0;
        this.f26648n0 = 0;
        float f8 = K0;
        this.f26650o0 = f8;
        this.f26652p0 = f8;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f26654q0 = null;
        this.f26656r0 = 0;
        this.f26658s0 = 0;
        this.f26664v0 = null;
        this.f26666w0 = false;
        this.f26668x0 = false;
        this.f26672z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26659t = -1;
        this.f26661u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f26665w = 0;
        this.f26667x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f26671z = 0;
        this.C = 0;
        this.f26635h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f26670y0 = false;
        boolean[] zArr = this.f26633g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26637i = true;
        int[] iArr2 = this.f26669y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f26643l = -1;
        this.f26645m = -1;
    }

    public b s(int i7) {
        if (i7 == 0) {
            return y();
        }
        if (i7 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f26651p = false;
        this.f26653q = false;
        this.f26655r = false;
        this.f26657s = false;
        int size = this.X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d) this.X.get(i7)).q();
        }
    }

    public float t() {
        return this.f26628d0;
    }

    public void t0(s.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f26664v0 != null) {
            str = "type: " + this.f26664v0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f26662u0 != null) {
            str2 = "id: " + this.f26662u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f26632f0);
        sb.append(", ");
        sb.append(this.f26634g0);
        sb.append(") - (");
        sb.append(this.f26624b0);
        sb.append(" x ");
        sb.append(this.f26626c0);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.f26630e0;
    }

    public int v() {
        if (this.f26658s0 == 8) {
            return 0;
        }
        return this.f26626c0;
    }

    public float w() {
        return this.f26650o0;
    }

    public int x() {
        return this.f26672z0;
    }

    public void x0(int i7) {
        this.f26644l0 = i7;
        this.J = i7 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f26654q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i7 = dVar != null ? dVar.f26607g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i7 + dVar2.f26607g : i7;
    }

    public void z0(String str) {
        this.f26662u0 = str;
    }
}
