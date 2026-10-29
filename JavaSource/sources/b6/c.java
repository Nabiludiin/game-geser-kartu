package b6;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: MyApplication */
public class c implements Closeable, Flushable {
    private static final String[] A;

    /* renamed from: z, reason: collision with root package name */
    private static final String[] f3430z = new String[128];

    /* renamed from: q, reason: collision with root package name */
    private final Writer f3431q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f3432r = new int[32];

    /* renamed from: s, reason: collision with root package name */
    private int f3433s = 0;

    /* renamed from: t, reason: collision with root package name */
    private String f3434t;

    /* renamed from: u, reason: collision with root package name */
    private String f3435u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3436v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3437w;

    /* renamed from: x, reason: collision with root package name */
    private String f3438x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3439y;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f3430z[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f3430z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        A = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        t(6);
        this.f3435u = ":";
        this.f3439y = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f3431q = writer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f3437w
            if (r0 == 0) goto L7
            java.lang.String[] r0 = b6.c.A
            goto L9
        L7:
            java.lang.String[] r0 = b6.c.f3430z
        L9:
            java.io.Writer r1 = r8.f3431q
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f3431q
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f3431q
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f3431q
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f3431q
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c.G(java.lang.String):void");
    }

    private void O() {
        if (this.f3438x != null) {
            a();
            G(this.f3438x);
            this.f3438x = null;
        }
    }

    private void a() {
        int s7 = s();
        if (s7 == 5) {
            this.f3431q.write(44);
        } else if (s7 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        p();
        u(4);
    }

    private void c(boolean z7) {
        int s7 = s();
        if (s7 == 1) {
            u(2);
            p();
            return;
        }
        if (s7 == 2) {
            this.f3431q.append(',');
            p();
            return;
        }
        if (s7 == 4) {
            this.f3431q.append((CharSequence) this.f3435u);
            u(5);
            return;
        }
        if (s7 != 6) {
            if (s7 != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.f3436v) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        if (!this.f3436v && !z7) {
            throw new IllegalStateException("JSON must start with an array or an object.");
        }
        u(7);
    }

    private c h(int i7, int i8, String str) {
        int s7 = s();
        if (s7 != i8 && s7 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f3438x != null) {
            throw new IllegalStateException("Dangling name: " + this.f3438x);
        }
        this.f3433s--;
        if (s7 == i8) {
            p();
        }
        this.f3431q.write(str);
        return this;
    }

    private void p() {
        if (this.f3434t == null) {
            return;
        }
        this.f3431q.write("\n");
        int i7 = this.f3433s;
        for (int i8 = 1; i8 < i7; i8++) {
            this.f3431q.write(this.f3434t);
        }
    }

    private c r(int i7, String str) {
        c(true);
        t(i7);
        this.f3431q.write(str);
        return this;
    }

    private int s() {
        int i7 = this.f3433s;
        if (i7 != 0) {
            return this.f3432r[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void t(int i7) {
        int i8 = this.f3433s;
        int[] iArr = this.f3432r;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[i8 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f3432r = iArr2;
        }
        int[] iArr3 = this.f3432r;
        int i9 = this.f3433s;
        this.f3433s = i9 + 1;
        iArr3[i9] = i7;
    }

    private void u(int i7) {
        this.f3432r[this.f3433s - 1] = i7;
    }

    public final void B(boolean z7) {
        this.f3436v = z7;
    }

    public final void F(boolean z7) {
        this.f3439y = z7;
    }

    public c H(long j7) {
        O();
        c(false);
        this.f3431q.write(Long.toString(j7));
        return this;
    }

    public c I(Number number) {
        if (number == null) {
            return q();
        }
        O();
        String obj = number.toString();
        if (this.f3436v || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            c(false);
            this.f3431q.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c L(String str) {
        if (str == null) {
            return q();
        }
        O();
        c(false);
        G(str);
        return this;
    }

    public c M(boolean z7) {
        O();
        c(false);
        this.f3431q.write(z7 ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3431q.close();
        int i7 = this.f3433s;
        if (i7 > 1 || (i7 == 1 && this.f3432r[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3433s = 0;
    }

    public c e() {
        O();
        return r(1, "[");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f3433s == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f3431q.flush();
    }

    public c g() {
        O();
        return r(3, "{");
    }

    public c j() {
        return h(1, 2, "]");
    }

    public c k() {
        return h(3, 5, "}");
    }

    public final boolean l() {
        return this.f3439y;
    }

    public final boolean m() {
        return this.f3437w;
    }

    public boolean n() {
        return this.f3436v;
    }

    public c o(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f3438x != null) {
            throw new IllegalStateException();
        }
        if (this.f3433s == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f3438x = str;
        return this;
    }

    public c q() {
        if (this.f3438x != null) {
            if (!this.f3439y) {
                this.f3438x = null;
                return this;
            }
            O();
        }
        c(false);
        this.f3431q.write("null");
        return this;
    }

    public final void w(boolean z7) {
        this.f3437w = z7;
    }

    public final void z(String str) {
        if (str.length() == 0) {
            this.f3434t = null;
            this.f3435u = ":";
        } else {
            this.f3434t = str;
            this.f3435u = ": ";
        }
    }
}
