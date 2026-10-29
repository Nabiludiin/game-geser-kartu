package y5;

import java.io.Writer;
import z5.l;

/* compiled from: MyApplication */
public abstract class j {

    /* compiled from: MyApplication */
    private static final class b extends Writer {

        /* renamed from: q, reason: collision with root package name */
        private final Appendable f27799q;

        /* renamed from: r, reason: collision with root package name */
        private final a f27800r;

        /* compiled from: MyApplication */
        static class a implements CharSequence {

            /* renamed from: q, reason: collision with root package name */
            char[] f27801q;

            a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i7) {
                return this.f27801q[i7];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f27801q.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i7, int i8) {
                return new String(this.f27801q, i7, i8 - i7);
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) {
            a aVar = this.f27800r;
            aVar.f27801q = cArr;
            this.f27799q.append(aVar, i7, i8 + i7);
        }

        private b(Appendable appendable) {
            this.f27800r = new a();
            this.f27799q = appendable;
        }

        @Override // java.io.Writer
        public void write(int i7) {
            this.f27799q.append((char) i7);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static void a(w5.g gVar, b6.c cVar) {
        l.P.c(cVar, gVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }
}
