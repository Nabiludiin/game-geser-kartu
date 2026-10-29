package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: MyApplication */
final class a0 extends Writer {

    /* renamed from: q, reason: collision with root package name */
    private final String f2148q;

    /* renamed from: r, reason: collision with root package name */
    private StringBuilder f2149r = new StringBuilder(128);

    a0(String str) {
        this.f2148q = str;
    }

    private void a() {
        if (this.f2149r.length() > 0) {
            Log.d(this.f2148q, this.f2149r.toString());
            StringBuilder sb = this.f2149r;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c8 = cArr[i7 + i9];
            if (c8 == '\n') {
                a();
            } else {
                this.f2149r.append(c8);
            }
        }
    }
}
