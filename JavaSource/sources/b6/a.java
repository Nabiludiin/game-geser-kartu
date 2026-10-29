package b6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import y5.e;

/* compiled from: MyApplication */
public class a implements Closeable {
    private static final char[] F = ")]}'\n".toCharArray();
    private String A;
    private int[] B;
    private String[] D;
    private int[] E;

    /* renamed from: q, reason: collision with root package name */
    private final Reader f3410q;

    /* renamed from: y, reason: collision with root package name */
    private long f3418y;

    /* renamed from: z, reason: collision with root package name */
    private int f3419z;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3411r = false;

    /* renamed from: s, reason: collision with root package name */
    private final char[] f3412s = new char[1024];

    /* renamed from: t, reason: collision with root package name */
    private int f3413t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f3414u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f3415v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f3416w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f3417x = 0;
    private int C = 1;

    /* compiled from: MyApplication */
    /* renamed from: b6.a$a, reason: collision with other inner class name */
    static class C0063a extends e {
        C0063a() {
        }

        @Override // y5.e
        public void a(a aVar) {
            int i7 = aVar.f3417x;
            if (i7 == 0) {
                i7 = aVar.n();
            }
            if (i7 == 13) {
                aVar.f3417x = 9;
                return;
            }
            if (i7 == 12) {
                aVar.f3417x = 8;
                return;
            }
            if (i7 == 14) {
                aVar.f3417x = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.R() + "  at line " + aVar.s() + " column " + aVar.r() + " path " + aVar.r0());
        }
    }

    static {
        e.f27771a = new C0063a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.B = iArr;
        iArr[0] = 6;
        this.D = new String[32];
        this.E = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f3410q = reader;
    }

    private int I(boolean z7) {
        char c8;
        char[] cArr = this.f3412s;
        int i7 = this.f3413t;
        int i8 = this.f3414u;
        while (true) {
            if (i7 == i8) {
                this.f3413t = i7;
                if (!q(1)) {
                    if (!z7) {
                        return -1;
                    }
                    throw new EOFException("End of input at line " + s() + " column " + r());
                }
                i7 = this.f3413t;
                i8 = this.f3414u;
            }
            int i9 = i7 + 1;
            c8 = cArr[i7];
            if (c8 == '\n') {
                this.f3415v++;
                this.f3416w = i9;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f3413t = i9;
                    if (i9 == i8) {
                        this.f3413t = i7;
                        boolean q7 = q(2);
                        this.f3413t++;
                        if (!q7) {
                            break;
                        }
                    }
                    l();
                    int i10 = this.f3413t;
                    char c9 = cArr[i10];
                    if (c9 == '*') {
                        this.f3413t = i10 + 1;
                        if (!e0("*/")) {
                            throw m0("Unterminated comment");
                        }
                        i7 = this.f3413t + 2;
                        i8 = this.f3414u;
                    } else {
                        if (c9 != '/') {
                            break;
                        }
                        this.f3413t = i10 + 1;
                        f0();
                        i7 = this.f3413t;
                        i8 = this.f3414u;
                    }
                } else {
                    if (c8 != '#') {
                        this.f3413t = i9;
                        return c8;
                    }
                    this.f3413t = i9;
                    l();
                    f0();
                    i7 = this.f3413t;
                    i8 = this.f3414u;
                }
            }
            i7 = i9;
        }
        return c8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r8.f3413t = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String M(char r9) {
        /*
            r8 = this;
            char[] r0 = r8.f3412s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L7:
            int r2 = r8.f3413t
            int r3 = r8.f3414u
        Lb:
            r4 = r3
            r3 = r2
        Ld:
            r5 = 1
            if (r2 >= r4) goto L46
            int r6 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r9) goto L22
            r8.f3413t = r6
            int r6 = r6 - r3
            int r6 = r6 - r5
            r1.append(r0, r3, r6)
            java.lang.String r9 = r1.toString()
            return r9
        L22:
            r7 = 92
            if (r2 != r7) goto L39
            r8.f3413t = r6
            int r6 = r6 - r3
            int r6 = r6 - r5
            r1.append(r0, r3, r6)
            char r2 = r8.V()
            r1.append(r2)
            int r2 = r8.f3413t
            int r3 = r8.f3414u
            goto Lb
        L39:
            r7 = 10
            if (r2 != r7) goto L44
            int r2 = r8.f3415v
            int r2 = r2 + r5
            r8.f3415v = r2
            r8.f3416w = r6
        L44:
            r2 = r6
            goto Ld
        L46:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r8.f3413t = r2
            boolean r2 = r8.q(r5)
            if (r2 == 0) goto L54
            goto L7
        L54:
            java.lang.String r9 = "Unterminated string"
            java.io.IOException r9 = r8.m0(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.M(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        l();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String P() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f3413t
            int r4 = r3 + r2
            int r5 = r6.f3414u
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f3412s
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.l()
            goto L5c
        L4e:
            char[] r3 = r6.f3412s
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.q(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L78
        L5e:
            if (r0 != 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L65:
            char[] r3 = r6.f3412s
            int r4 = r6.f3413t
            r0.append(r3, r4, r2)
            int r3 = r6.f3413t
            int r3 = r3 + r2
            r6.f3413t = r3
            r2 = 1
            boolean r2 = r6.q(r2)
            if (r2 != 0) goto L2
        L78:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f3412s
            int r3 = r6.f3413t
            r0.<init>(r2, r3, r1)
            goto L8f
        L84:
            char[] r2 = r6.f3412s
            int r3 = r6.f3413t
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L8f:
            int r2 = r6.f3413t
            int r2 = r2 + r1
            r6.f3413t = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.P():java.lang.String");
    }

    private int S() {
        String str;
        String str2;
        int i7;
        char c8 = this.f3412s[this.f3413t];
        if (c8 == 't' || c8 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c8 == 'f' || c8 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c8 != 'n' && c8 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i7 = 7;
        }
        int length = str.length();
        for (int i8 = 1; i8 < length; i8++) {
            if (this.f3413t + i8 >= this.f3414u && !q(i8 + 1)) {
                return 0;
            }
            char c9 = this.f3412s[this.f3413t + i8];
            if (c9 != str.charAt(i8) && c9 != str2.charAt(i8)) {
                return 0;
            }
        }
        if ((this.f3413t + length < this.f3414u || q(length + 1)) && w(this.f3412s[this.f3413t + length])) {
            return 0;
        }
        this.f3413t += length;
        this.f3417x = i7;
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0094, code lost:
    
        if (r9 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        if (r10 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        if (r13 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        r19.f3418y = r11;
        r19.f3413t += r8;
        r19.f3417x = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r9 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (r9 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r9 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r19.f3419z = r8;
        r19.f3417x = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0092, code lost:
    
        if (w(r14) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c1, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int T() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.T():int");
    }

    private void U(int i7) {
        int i8 = this.C;
        int[] iArr = this.B;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[i8 * 2];
            int[] iArr3 = new int[i8 * 2];
            String[] strArr = new String[i8 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.E, 0, iArr3, 0, this.C);
            System.arraycopy(this.D, 0, strArr, 0, this.C);
            this.B = iArr2;
            this.E = iArr3;
            this.D = strArr;
        }
        int[] iArr4 = this.B;
        int i9 = this.C;
        this.C = i9 + 1;
        iArr4[i9] = i7;
    }

    private char V() {
        int i7;
        if (this.f3413t == this.f3414u && !q(1)) {
            throw m0("Unterminated escape sequence");
        }
        char[] cArr = this.f3412s;
        int i8 = this.f3413t;
        int i9 = i8 + 1;
        this.f3413t = i9;
        char c8 = cArr[i8];
        if (c8 == '\n') {
            this.f3415v++;
            this.f3416w = i9;
            return c8;
        }
        if (c8 == 'b') {
            return '\b';
        }
        if (c8 == 'f') {
            return '\f';
        }
        if (c8 == 'n') {
            return '\n';
        }
        if (c8 == 'r') {
            return '\r';
        }
        if (c8 == 't') {
            return '\t';
        }
        if (c8 != 'u') {
            return c8;
        }
        if (i8 + 5 > this.f3414u && !q(4)) {
            throw m0("Unterminated escape sequence");
        }
        int i10 = this.f3413t;
        int i11 = i10 + 4;
        char c9 = 0;
        while (i10 < i11) {
            char c10 = this.f3412s[i10];
            char c11 = (char) (c9 << 4);
            if (c10 >= '0' && c10 <= '9') {
                i7 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i7 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f3412s, this.f3413t, 4));
                }
                i7 = c10 - '7';
            }
            c9 = (char) (c11 + i7);
            i10++;
        }
        this.f3413t += 4;
        return c9;
    }

    private void b0(char c8) {
        char[] cArr = this.f3412s;
        do {
            int i7 = this.f3413t;
            int i8 = this.f3414u;
            while (i7 < i8) {
                int i9 = i7 + 1;
                char c9 = cArr[i7];
                if (c9 == c8) {
                    this.f3413t = i9;
                    return;
                }
                if (c9 == '\\') {
                    this.f3413t = i9;
                    V();
                    i7 = this.f3413t;
                    i8 = this.f3414u;
                } else {
                    if (c9 == '\n') {
                        this.f3415v++;
                        this.f3416w = i9;
                    }
                    i7 = i9;
                }
            }
            this.f3413t = i7;
        } while (q(1));
        throw m0("Unterminated string");
    }

    private boolean e0(String str) {
        while (true) {
            if (this.f3413t + str.length() > this.f3414u && !q(str.length())) {
                return false;
            }
            char[] cArr = this.f3412s;
            int i7 = this.f3413t;
            if (cArr[i7] != '\n') {
                for (int i8 = 0; i8 < str.length(); i8++) {
                    if (this.f3412s[this.f3413t + i8] != str.charAt(i8)) {
                        break;
                    }
                }
                return true;
            }
            this.f3415v++;
            this.f3416w = i7 + 1;
            this.f3413t++;
        }
    }

    private void f0() {
        char c8;
        do {
            if (this.f3413t >= this.f3414u && !q(1)) {
                return;
            }
            char[] cArr = this.f3412s;
            int i7 = this.f3413t;
            int i8 = i7 + 1;
            this.f3413t = i8;
            c8 = cArr[i7];
            if (c8 == '\n') {
                this.f3415v++;
                this.f3416w = i8;
                return;
            }
        } while (c8 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f3413t
            int r2 = r1 + r0
            int r3 = r4.f3414u
            if (r2 >= r3) goto L51
            char[] r2 = r4.f3412s
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.l()
        L4b:
            int r1 = r4.f3413t
            int r1 = r1 + r0
            r4.f3413t = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f3413t = r1
            r0 = 1
            boolean r0 = r4.q(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.g0():void");
    }

    private void l() {
        if (!this.f3411r) {
            throw m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void m() {
        I(true);
        int i7 = this.f3413t - 1;
        this.f3413t = i7;
        char[] cArr = F;
        if (i7 + cArr.length > this.f3414u && !q(cArr.length)) {
            return;
        }
        int i8 = 0;
        while (true) {
            char[] cArr2 = F;
            if (i8 >= cArr2.length) {
                this.f3413t += cArr2.length;
                return;
            } else if (this.f3412s[this.f3413t + i8] != cArr2[i8]) {
                return;
            } else {
                i8++;
            }
        }
    }

    private IOException m0(String str) {
        throw new d(str + " at line " + s() + " column " + r() + " path " + r0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n() {
        int I;
        int[] iArr = this.B;
        int i7 = this.C;
        int i8 = iArr[i7 - 1];
        if (i8 == 1) {
            iArr[i7 - 1] = 2;
        } else if (i8 == 2) {
            int I2 = I(true);
            if (I2 != 44) {
                if (I2 != 59) {
                    if (I2 != 93) {
                        throw m0("Unterminated array");
                    }
                    this.f3417x = 4;
                    return 4;
                }
                l();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7 - 1] = 4;
                if (i8 == 5 && (I = I(true)) != 44) {
                    if (I != 59) {
                        if (I != 125) {
                            throw m0("Unterminated object");
                        }
                        this.f3417x = 2;
                        return 2;
                    }
                    l();
                }
                int I3 = I(true);
                if (I3 == 34) {
                    this.f3417x = 13;
                    return 13;
                }
                if (I3 == 39) {
                    l();
                    this.f3417x = 12;
                    return 12;
                }
                if (I3 == 125) {
                    if (i8 == 5) {
                        throw m0("Expected name");
                    }
                    this.f3417x = 2;
                    return 2;
                }
                l();
                this.f3413t--;
                if (!w((char) I3)) {
                    throw m0("Expected name");
                }
                this.f3417x = 14;
                return 14;
            }
            if (i8 == 4) {
                iArr[i7 - 1] = 5;
                int I4 = I(true);
                if (I4 != 58) {
                    if (I4 != 61) {
                        throw m0("Expected ':'");
                    }
                    l();
                    if (this.f3413t < this.f3414u || q(1)) {
                        char[] cArr = this.f3412s;
                        int i9 = this.f3413t;
                        if (cArr[i9] == '>') {
                            this.f3413t = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.f3411r) {
                    m();
                }
                this.B[this.C - 1] = 7;
            } else if (i8 == 7) {
                if (I(false) == -1) {
                    this.f3417x = 17;
                    return 17;
                }
                l();
                this.f3413t--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int I5 = I(true);
        if (I5 == 34) {
            if (this.C == 1) {
                l();
            }
            this.f3417x = 9;
            return 9;
        }
        if (I5 == 39) {
            l();
            this.f3417x = 8;
            return 8;
        }
        if (I5 != 44 && I5 != 59) {
            if (I5 == 91) {
                this.f3417x = 3;
                return 3;
            }
            if (I5 != 93) {
                if (I5 == 123) {
                    this.f3417x = 1;
                    return 1;
                }
                this.f3413t--;
                if (this.C == 1) {
                    l();
                }
                int S = S();
                if (S != 0) {
                    return S;
                }
                int T = T();
                if (T != 0) {
                    return T;
                }
                if (!w(this.f3412s[this.f3413t])) {
                    throw m0("Expected value");
                }
                l();
                this.f3417x = 10;
                return 10;
            }
            if (i8 == 1) {
                this.f3417x = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            throw m0("Unexpected value");
        }
        l();
        this.f3413t--;
        this.f3417x = 7;
        return 7;
    }

    private boolean q(int i7) {
        int i8;
        int i9;
        char[] cArr = this.f3412s;
        int i10 = this.f3416w;
        int i11 = this.f3413t;
        this.f3416w = i10 - i11;
        int i12 = this.f3414u;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f3414u = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f3414u = 0;
        }
        this.f3413t = 0;
        do {
            Reader reader = this.f3410q;
            int i14 = this.f3414u;
            int read = reader.read(cArr, i14, cArr.length - i14);
            if (read == -1) {
                return false;
            }
            i8 = this.f3414u + read;
            this.f3414u = i8;
            if (this.f3415v == 0 && (i9 = this.f3416w) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f3413t++;
                this.f3416w = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r() {
        return (this.f3413t - this.f3416w) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s() {
        return this.f3415v + 1;
    }

    private boolean w(char c8) {
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
        l();
        return false;
    }

    public double B() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 15) {
            this.f3417x = 0;
            int[] iArr = this.E;
            int i8 = this.C - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f3418y;
        }
        if (i7 == 16) {
            this.A = new String(this.f3412s, this.f3413t, this.f3419z);
            this.f3413t += this.f3419z;
        } else if (i7 == 8 || i7 == 9) {
            this.A = M(i7 == 8 ? '\'' : '\"');
        } else if (i7 == 10) {
            this.A = P();
        } else if (i7 != 11) {
            throw new IllegalStateException("Expected a double but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
        }
        this.f3417x = 11;
        double parseDouble = Double.parseDouble(this.A);
        if (this.f3411r || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.A = null;
            this.f3417x = 0;
            int[] iArr2 = this.E;
            int i9 = this.C - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + " at line " + s() + " column " + r() + " path " + r0());
    }

    public int F() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 15) {
            long j7 = this.f3418y;
            int i8 = (int) j7;
            if (j7 == i8) {
                this.f3417x = 0;
                int[] iArr = this.E;
                int i9 = this.C - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new NumberFormatException("Expected an int but was " + this.f3418y + " at line " + s() + " column " + r() + " path " + r0());
        }
        if (i7 == 16) {
            this.A = new String(this.f3412s, this.f3413t, this.f3419z);
            this.f3413t += this.f3419z;
        } else {
            if (i7 != 8 && i7 != 9) {
                throw new IllegalStateException("Expected an int but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
            }
            String M = M(i7 == 8 ? '\'' : '\"');
            this.A = M;
            try {
                int parseInt = Integer.parseInt(M);
                this.f3417x = 0;
                int[] iArr2 = this.E;
                int i10 = this.C - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3417x = 11;
        double parseDouble = Double.parseDouble(this.A);
        int i11 = (int) parseDouble;
        if (i11 == parseDouble) {
            this.A = null;
            this.f3417x = 0;
            int[] iArr3 = this.E;
            int i12 = this.C - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        }
        throw new NumberFormatException("Expected an int but was " + this.A + " at line " + s() + " column " + r() + " path " + r0());
    }

    public long G() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 15) {
            this.f3417x = 0;
            int[] iArr = this.E;
            int i8 = this.C - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f3418y;
        }
        if (i7 == 16) {
            this.A = new String(this.f3412s, this.f3413t, this.f3419z);
            this.f3413t += this.f3419z;
        } else {
            if (i7 != 8 && i7 != 9) {
                throw new IllegalStateException("Expected a long but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
            }
            String M = M(i7 == 8 ? '\'' : '\"');
            this.A = M;
            try {
                long parseLong = Long.parseLong(M);
                this.f3417x = 0;
                int[] iArr2 = this.E;
                int i9 = this.C - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3417x = 11;
        double parseDouble = Double.parseDouble(this.A);
        long j7 = (long) parseDouble;
        if (j7 == parseDouble) {
            this.A = null;
            this.f3417x = 0;
            int[] iArr3 = this.E;
            int i10 = this.C - 1;
            iArr3[i10] = iArr3[i10] + 1;
            return j7;
        }
        throw new NumberFormatException("Expected a long but was " + this.A + " at line " + s() + " column " + r() + " path " + r0());
    }

    public String H() {
        String M;
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 14) {
            M = P();
        } else if (i7 == 12) {
            M = M('\'');
        } else {
            if (i7 != 13) {
                throw new IllegalStateException("Expected a name but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
            }
            M = M('\"');
        }
        this.f3417x = 0;
        this.D[this.C - 1] = M;
        return M;
    }

    public void L() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 7) {
            this.f3417x = 0;
            int[] iArr = this.E;
            int i8 = this.C - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }

    public String O() {
        String str;
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 10) {
            str = P();
        } else if (i7 == 8) {
            str = M('\'');
        } else if (i7 == 9) {
            str = M('\"');
        } else if (i7 == 11) {
            str = this.A;
            this.A = null;
        } else if (i7 == 15) {
            str = Long.toString(this.f3418y);
        } else {
            if (i7 != 16) {
                throw new IllegalStateException("Expected a string but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
            }
            str = new String(this.f3412s, this.f3413t, this.f3419z);
            this.f3413t += this.f3419z;
        }
        this.f3417x = 0;
        int[] iArr = this.E;
        int i8 = this.C - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    public b R() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        switch (i7) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void a0(boolean z7) {
        this.f3411r = z7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3417x = 0;
        this.B[0] = 8;
        this.C = 1;
        this.f3410q.close();
    }

    public void j() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 3) {
            U(1);
            this.E[this.C - 1] = 0;
            this.f3417x = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }

    public void j0() {
        int i7 = 0;
        do {
            int i8 = this.f3417x;
            if (i8 == 0) {
                i8 = n();
            }
            if (i8 == 3) {
                U(1);
            } else if (i8 == 1) {
                U(3);
            } else {
                if (i8 == 4) {
                    this.C--;
                } else if (i8 == 2) {
                    this.C--;
                } else {
                    if (i8 == 14 || i8 == 10) {
                        g0();
                    } else if (i8 == 8 || i8 == 12) {
                        b0('\'');
                    } else if (i8 == 9 || i8 == 13) {
                        b0('\"');
                    } else if (i8 == 16) {
                        this.f3413t += this.f3419z;
                    }
                    this.f3417x = 0;
                }
                i7--;
                this.f3417x = 0;
            }
            i7++;
            this.f3417x = 0;
        } while (i7 != 0);
        int[] iArr = this.E;
        int i9 = this.C;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.D[i9 - 1] = "null";
    }

    public void k() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 1) {
            U(3);
            this.f3417x = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }

    public void o() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 4) {
            int i8 = this.C;
            this.C = i8 - 1;
            int[] iArr = this.E;
            int i9 = i8 - 2;
            iArr[i9] = iArr[i9] + 1;
            this.f3417x = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }

    public void p() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 2) {
            int i8 = this.C;
            int i9 = i8 - 1;
            this.C = i9;
            this.D[i9] = null;
            int[] iArr = this.E;
            int i10 = i8 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.f3417x = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }

    public String r0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i7 = this.C;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.B[i8];
            if (i9 == 1 || i9 == 2) {
                sb.append('[');
                sb.append(this.E[i8]);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.D[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean t() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        return (i7 == 2 || i7 == 4) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + " at line " + s() + " column " + r();
    }

    public final boolean u() {
        return this.f3411r;
    }

    public boolean z() {
        int i7 = this.f3417x;
        if (i7 == 0) {
            i7 = n();
        }
        if (i7 == 5) {
            this.f3417x = 0;
            int[] iArr = this.E;
            int i8 = this.C - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (i7 == 6) {
            this.f3417x = 0;
            int[] iArr2 = this.E;
            int i9 = this.C - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + R() + " at line " + s() + " column " + r() + " path " + r0());
    }
}
