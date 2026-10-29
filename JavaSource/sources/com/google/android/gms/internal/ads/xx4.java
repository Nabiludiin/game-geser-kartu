package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class xx4 implements Closeable, Flushable {
    private static final String[] B;

    /* renamed from: q, reason: collision with root package name */
    private final Writer f19289q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f19290r = new int[32];

    /* renamed from: s, reason: collision with root package name */
    private int f19291s = 0;

    /* renamed from: t, reason: collision with root package name */
    private final nw4 f19292t;

    /* renamed from: u, reason: collision with root package name */
    private final String f19293u;

    /* renamed from: v, reason: collision with root package name */
    private String f19294v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f19295w;

    /* renamed from: x, reason: collision with root package name */
    private uw4 f19296x;

    /* renamed from: y, reason: collision with root package name */
    private String f19297y;

    /* renamed from: z, reason: collision with root package name */
    private static final Pattern f19288z = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] A = new String[128];

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            A[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = A;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        B = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public xx4(Writer writer) {
        boolean z7 = false;
        q(6);
        this.f19296x = uw4.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.f19289q = writer;
        nw4 nw4Var = nw4.f13086d;
        Objects.requireNonNull(nw4Var);
        this.f19292t = nw4Var;
        this.f19294v = ",";
        if (nw4Var.c()) {
            this.f19293u = ": ";
            if (nw4Var.a().isEmpty()) {
                this.f19294v = ", ";
            }
        } else {
            this.f19293u = ":";
        }
        if (nw4Var.a().isEmpty() && nw4Var.b().isEmpty()) {
            z7 = true;
        }
        this.f19295w = z7;
    }

    private final xx4 o(int i7, char c8) {
        z();
        q(i7);
        this.f19289q.write(c8);
        return this;
    }

    private final xx4 p(int i7, int i8, char c8) {
        int r7 = r();
        if (r7 != i8 && r7 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f19297y;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f19291s--;
        if (r7 == i8) {
            w();
        }
        this.f19289q.write(c8);
        return this;
    }

    private final void q(int i7) {
        int i8 = this.f19291s;
        int[] iArr = this.f19290r;
        if (i8 == iArr.length) {
            this.f19290r = Arrays.copyOf(iArr, i8 + i8);
        }
        int[] iArr2 = this.f19290r;
        int i9 = this.f19291s;
        this.f19291s = i9 + 1;
        iArr2[i9] = i7;
    }

    private final int r() {
        int i7 = this.f19291s;
        if (i7 != 0) {
            return this.f19290r[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void s(int i7) {
        this.f19290r[this.f19291s - 1] = i7;
    }

    private final void t() {
        if (this.f19297y != null) {
            int r7 = r();
            if (r7 == 5) {
                this.f19289q.write(this.f19294v);
            } else if (r7 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            w();
            s(4);
            u(this.f19297y);
            this.f19297y = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(java.lang.String r10) {
        /*
            r9 = this;
            java.io.Writer r0 = r9.f19289q
            java.lang.String[] r1 = com.google.android.gms.internal.ads.xx4.A
            r2 = 34
            r0.write(r2)
            int r3 = r10.length()
            r4 = 0
            r5 = r4
        Lf:
            if (r4 >= r3) goto L39
            int r6 = r4 + 1
            char r7 = r10.charAt(r4)
            r8 = 128(0x80, float:1.8E-43)
            if (r7 >= r8) goto L20
            r7 = r1[r7]
            if (r7 == 0) goto L37
            goto L2d
        L20:
            r8 = 8232(0x2028, float:1.1535E-41)
            if (r7 != r8) goto L27
            java.lang.String r7 = "\\u2028"
            goto L2d
        L27:
            r8 = 8233(0x2029, float:1.1537E-41)
            if (r7 != r8) goto L37
            java.lang.String r7 = "\\u2029"
        L2d:
            if (r5 >= r4) goto L33
            int r4 = r4 - r5
            r0.write(r10, r5, r4)
        L33:
            r0.write(r7)
            r5 = r6
        L37:
            r4 = r6
            goto Lf
        L39:
            if (r5 >= r3) goto L3f
            int r3 = r3 - r5
            r0.write(r10, r5, r3)
        L3f:
            r0.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xx4.u(java.lang.String):void");
    }

    private final void w() {
        if (this.f19295w) {
            return;
        }
        Writer writer = this.f19289q;
        nw4 nw4Var = this.f19292t;
        writer.write(nw4Var.a());
        int i7 = this.f19291s;
        for (int i8 = 1; i8 < i7; i8++) {
            writer.write(nw4Var.b());
        }
    }

    private final void z() {
        int r7 = r();
        if (r7 == 1) {
            s(2);
            w();
            return;
        }
        if (r7 == 2) {
            this.f19289q.append((CharSequence) this.f19294v);
            w();
        } else {
            if (r7 == 4) {
                this.f19289q.append((CharSequence) this.f19293u);
                s(5);
                return;
            }
            if (r7 != 6) {
                if (r7 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f19296x != uw4.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            s(7);
        }
    }

    public final void a(uw4 uw4Var) {
        Objects.requireNonNull(uw4Var);
        this.f19296x = uw4Var;
    }

    public final xx4 c() {
        t();
        o(1, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19289q.close();
        int i7 = this.f19291s;
        if (i7 > 1 || (i7 == 1 && this.f19290r[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19291s = 0;
    }

    public final xx4 e() {
        p(1, 2, ']');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f19291s == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19289q.flush();
    }

    public final xx4 g() {
        t();
        o(3, '{');
        return this;
    }

    public final xx4 h() {
        p(3, 5, '}');
        return this;
    }

    public final xx4 j(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f19297y != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int r7 = r();
        if (r7 != 3 && r7 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f19297y = str;
        return this;
    }

    public final xx4 k(String str) {
        if (str == null) {
            n();
            return this;
        }
        t();
        z();
        u(str);
        return this;
    }

    public final xx4 l(boolean z7) {
        t();
        z();
        this.f19289q.write(true != z7 ? "false" : "true");
        return this;
    }

    public final xx4 m(Number number) {
        if (number == null) {
            n();
            return this;
        }
        t();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f19296x != uw4.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !f19288z.matcher(obj).matches()) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47 + obj.length());
                sb.append("String created by ");
                sb.append(valueOf);
                sb.append(" is not a valid JSON number: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        z();
        this.f19289q.append((CharSequence) obj);
        return this;
    }

    public final xx4 n() {
        if (this.f19297y != null) {
            t();
        }
        z();
        this.f19289q.write("null");
        return this;
    }
}
