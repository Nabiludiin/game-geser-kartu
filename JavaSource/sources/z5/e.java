package z5;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class e extends b6.c {
    private static final Writer E = new a();
    private static final w5.l F = new w5.l("closed");
    private final List B;
    private String C;
    private w5.g D;

    /* compiled from: MyApplication */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    }

    public e() {
        super(E);
        this.B = new ArrayList();
        this.D = w5.i.f27176q;
    }

    private w5.g R() {
        return (w5.g) this.B.get(r0.size() - 1);
    }

    private void S(w5.g gVar) {
        if (this.C != null) {
            if (!gVar.i() || l()) {
                ((w5.j) R()).l(this.C, gVar);
            }
            this.C = null;
            return;
        }
        if (this.B.isEmpty()) {
            this.D = gVar;
            return;
        }
        w5.g R = R();
        if (!(R instanceof w5.e)) {
            throw new IllegalStateException();
        }
        ((w5.e) R).l(gVar);
    }

    @Override // b6.c
    public b6.c H(long j7) {
        S(new w5.l(Long.valueOf(j7)));
        return this;
    }

    @Override // b6.c
    public b6.c I(Number number) {
        if (number == null) {
            return q();
        }
        if (!n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        S(new w5.l(number));
        return this;
    }

    @Override // b6.c
    public b6.c L(String str) {
        if (str == null) {
            return q();
        }
        S(new w5.l(str));
        return this;
    }

    @Override // b6.c
    public b6.c M(boolean z7) {
        S(new w5.l(Boolean.valueOf(z7)));
        return this;
    }

    public w5.g P() {
        if (this.B.isEmpty()) {
            return this.D;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.B);
    }

    @Override // b6.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.B.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.B.add(F);
    }

    @Override // b6.c
    public b6.c e() {
        w5.e eVar = new w5.e();
        S(eVar);
        this.B.add(eVar);
        return this;
    }

    @Override // b6.c
    public b6.c g() {
        w5.j jVar = new w5.j();
        S(jVar);
        this.B.add(jVar);
        return this;
    }

    @Override // b6.c
    public b6.c j() {
        if (this.B.isEmpty() || this.C != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof w5.e)) {
            throw new IllegalStateException();
        }
        this.B.remove(r0.size() - 1);
        return this;
    }

    @Override // b6.c
    public b6.c k() {
        if (this.B.isEmpty() || this.C != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof w5.j)) {
            throw new IllegalStateException();
        }
        this.B.remove(r0.size() - 1);
        return this;
    }

    @Override // b6.c
    public b6.c o(String str) {
        if (this.B.isEmpty() || this.C != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof w5.j)) {
            throw new IllegalStateException();
        }
        this.C = str;
        return this;
    }

    @Override // b6.c
    public b6.c q() {
        S(w5.i.f27176q);
        return this;
    }

    @Override // b6.c, java.io.Flushable
    public void flush() {
    }
}
