package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class vx4 implements Closeable {
    private int[] A;
    private String[] C;
    private int[] D;

    /* renamed from: q, reason: collision with root package name */
    private final Reader f17908q;

    /* renamed from: y, reason: collision with root package name */
    private long f17916y;

    /* renamed from: z, reason: collision with root package name */
    private int f17917z;

    /* renamed from: r, reason: collision with root package name */
    private uw4 f17909r = uw4.LEGACY_STRICT;

    /* renamed from: s, reason: collision with root package name */
    private final char[] f17910s = new char[1024];

    /* renamed from: t, reason: collision with root package name */
    private int f17911t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f17912u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f17913v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f17914w = 0;

    /* renamed from: x, reason: collision with root package name */
    int f17915x = 0;
    private int B = 1;

    static {
        xw4.f19283a = new ux4();
    }

    public vx4(Reader reader) {
        int[] iArr = new int[32];
        this.A = iArr;
        iArr[0] = 6;
        this.C = new String[32];
        this.D = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f17908q = reader;
    }

    private final void B() {
        if (this.f17909r != uw4.LENIENT) {
            throw G("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void F() {
        char c8;
        do {
            if (this.f17911t >= this.f17912u && !w(1)) {
                return;
            }
            char[] cArr = this.f17910s;
            int i7 = this.f17911t;
            int i8 = i7 + 1;
            this.f17911t = i8;
            c8 = cArr[i7];
            if (c8 == '\n') {
                this.f17913v++;
                this.f17914w = i8;
                return;
            }
        } while (c8 != '\r');
    }

    private final yx4 G(String str) {
        String p7 = p();
        StringBuilder sb = new StringBuilder(str.length() + p7.length() + 79);
        sb.append(str);
        sb.append(p7);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new yx4(sb.toString());
    }

    private final IllegalStateException H(String str) {
        int q7 = q();
        String a8 = wx4.a(q());
        String p7 = p();
        int length = str.length() + 18 + a8.length() + p7.length();
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(q7 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(length + 5 + concat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(a8);
        sb.append(p7);
        sb.append("\nSee ");
        sb.append(concat);
        return new IllegalStateException(sb.toString());
    }

    private final boolean r(char c8) {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        B();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.f17911t = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        throw G("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.f17911t, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String s(char r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vx4.s(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        B();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String t() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.f17911t
            int r3 = r3 + r2
            int r4 = r5.f17912u
            if (r3 >= r4) goto L4c
            char[] r4 = r5.f17910s
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.B()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.w(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.f17910s
            int r4 = r5.f17911t
            r1.append(r3, r4, r2)
            int r3 = r5.f17911t
            int r3 = r3 + r2
            r5.f17911t = r3
            r2 = 1
            boolean r2 = r5.w(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.f17910s
            java.lang.String r2 = new java.lang.String
            int r3 = r5.f17911t
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.f17910s
            int r3 = r5.f17911t
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.f17911t
            int r1 = r1 + r0
            r5.f17911t = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vx4.t():java.lang.String");
    }

    private final void u(int i7) {
        int i8 = this.B;
        if (i8 - 1 >= 1280) {
            String p7 = p();
            StringBuilder sb = new StringBuilder(p7.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(p7);
            throw new yx4(sb.toString());
        }
        int[] iArr = this.A;
        if (i8 == iArr.length) {
            int i9 = i8 + i8;
            this.A = Arrays.copyOf(iArr, i9);
            this.D = Arrays.copyOf(this.D, i9);
            this.C = (String[]) Arrays.copyOf(this.C, i9);
        }
        int[] iArr2 = this.A;
        int i10 = this.B;
        this.B = i10 + 1;
        iArr2[i10] = i7;
    }

    private final boolean w(int i7) {
        int i8;
        int i9 = this.f17914w;
        int i10 = this.f17911t;
        this.f17914w = i9 - i10;
        char[] cArr = this.f17910s;
        int i11 = this.f17912u;
        if (i11 != i10) {
            int i12 = i11 - i10;
            this.f17912u = i12;
            System.arraycopy(cArr, i10, cArr, 0, i12);
        } else {
            this.f17912u = 0;
        }
        this.f17911t = 0;
        do {
            Reader reader = this.f17908q;
            int i13 = this.f17912u;
            int read = reader.read(cArr, i13, 1024 - i13);
            if (read == -1) {
                return false;
            }
            i8 = this.f17912u + read;
            this.f17912u = i8;
            if (this.f17913v == 0 && this.f17914w == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f17911t++;
                this.f17914w = 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    private final int z(boolean z7) {
        int i7;
        int i8 = this.f17911t;
        int i9 = this.f17912u;
        while (true) {
            if (i8 == i9) {
                this.f17911t = i8;
                if (!w(1)) {
                    if (z7) {
                        throw new EOFException("End of input".concat(p()));
                    }
                    return -1;
                }
                i8 = this.f17911t;
                i9 = this.f17912u;
            }
            char[] cArr = this.f17910s;
            int i10 = i8 + 1;
            char c8 = cArr[i8];
            if (c8 == '\n') {
                this.f17913v++;
                this.f17914w = i10;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f17911t = i10;
                    if (i10 == i9) {
                        this.f17911t = i8;
                        boolean w7 = w(2);
                        this.f17911t++;
                        if (!w7) {
                            return 47;
                        }
                    }
                    B();
                    int i11 = this.f17911t;
                    char c9 = cArr[i11];
                    if (c9 == '*') {
                        this.f17911t = i11 + 1;
                        while (true) {
                            if (this.f17911t + 2 > this.f17912u && !w(2)) {
                                throw G("Unterminated comment");
                            }
                            int i12 = this.f17911t;
                            if (cArr[i12] != '\n') {
                                while (i7 < 2) {
                                    i7 = cArr[this.f17911t + i7] == "*/".charAt(i7) ? i7 + 1 : 0;
                                }
                                i8 = this.f17911t + 2;
                                i9 = this.f17912u;
                                break;
                            }
                            this.f17913v++;
                            this.f17914w = i12 + 1;
                            this.f17911t++;
                        }
                    } else {
                        if (c9 != '/') {
                            return 47;
                        }
                        this.f17911t = i11 + 1;
                        F();
                        i8 = this.f17911t;
                        i9 = this.f17912u;
                    }
                } else {
                    if (c8 != '#') {
                        this.f17911t = i10;
                        return c8;
                    }
                    this.f17911t = i10;
                    B();
                    F();
                    i8 = this.f17911t;
                    i9 = this.f17912u;
                }
            }
            i8 = i10;
        }
    }

    public final void a(uw4 uw4Var) {
        Objects.requireNonNull(uw4Var);
        this.f17909r = uw4Var;
    }

    public final void c() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 != 3) {
            throw H("BEGIN_ARRAY");
        }
        u(1);
        this.D[this.B - 1] = 0;
        this.f17915x = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17915x = 0;
        this.A[0] = 8;
        this.B = 1;
        this.f17908q.close();
    }

    public final void e() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 != 4) {
            throw H("END_ARRAY");
        }
        int i8 = this.B;
        this.B = i8 - 1;
        int[] iArr = this.D;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f17915x = 0;
    }

    public final void g() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 != 1) {
            throw H("BEGIN_OBJECT");
        }
        u(3);
        this.f17915x = 0;
    }

    public final void h() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 != 2) {
            throw H("END_OBJECT");
        }
        int i8 = this.B;
        int i9 = i8 - 1;
        this.B = i9;
        this.C[i9] = null;
        int[] iArr = this.D;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f17915x = 0;
    }

    public final boolean j() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01de, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022c, code lost:
    
        if (r(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0230, code lost:
    
        if (r15 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0232, code lost:
    
        if (r16 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0238, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023a, code lost:
    
        if (r17 == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x023c, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0245, code lost:
    
        if (r11 != r20) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0247, code lost:
    
        if (r3 != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024d, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024e, code lost:
    
        r24.f17916y = r11;
        r24.f17911t += r10;
        r3 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
    
        r24.f17915x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        if (r3 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0241, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023e, code lost:
    
        r8 = 2;
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025a, code lost:
    
        if (r15 == r8) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025d, code lost:
    
        if (r15 == 4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025f, code lost:
    
        if (r15 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0261, code lost:
    
        r24.f17917z = r10;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int k() {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vx4.k():int");
    }

    public final String l() {
        String s7;
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 == 14) {
            s7 = t();
        } else if (i7 == 12) {
            s7 = s('\'');
        } else {
            if (i7 != 13) {
                throw H("a name");
            }
            s7 = s('\"');
        }
        this.f17915x = 0;
        this.C[this.B - 1] = s7;
        return s7;
    }

    public final String m() {
        String str;
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 == 10) {
            str = t();
        } else if (i7 == 8) {
            str = s('\'');
        } else if (i7 == 9) {
            str = s('\"');
        } else if (i7 == 11) {
            str = null;
        } else if (i7 == 15) {
            str = Long.toString(this.f17916y);
        } else {
            if (i7 != 16) {
                throw H("a string");
            }
            String str2 = new String(this.f17910s, this.f17911t, this.f17917z);
            this.f17911t += this.f17917z;
            str = str2;
        }
        this.f17915x = 0;
        int[] iArr = this.D;
        int i8 = this.B - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    public final boolean n() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 == 5) {
            this.f17915x = 0;
            int[] iArr = this.D;
            int i8 = this.B - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (i7 != 6) {
            throw H("a boolean");
        }
        this.f17915x = 0;
        int[] iArr2 = this.D;
        int i9 = this.B - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return false;
    }

    public final void o() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        if (i7 != 7) {
            throw H("null");
        }
        this.f17915x = 0;
        int[] iArr = this.D;
        int i8 = this.B - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    final String p() {
        int i7 = this.f17913v + 1;
        int i8 = this.f17911t - this.f17914w;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i9 = 0; i9 < this.B; i9++) {
            int i10 = this.A[i9];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.D[i9];
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.C[i9];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i10);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i12 = i8 + 1;
        String sb3 = sb.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i7).length() + 17 + String.valueOf(i12).length() + 6 + sb3.length());
        sb4.append(" at line ");
        sb4.append(i7);
        sb4.append(" column ");
        sb4.append(i12);
        sb4.append(" path ");
        sb4.append(sb3);
        return sb4.toString();
    }

    public final int q() {
        int i7 = this.f17915x;
        if (i7 == 0) {
            i7 = k();
        }
        switch (i7) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return vx4.class.getSimpleName().concat(p());
    }
}
