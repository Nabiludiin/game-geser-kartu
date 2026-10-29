package c6;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MyApplication */
public interface j {

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final InputStream f3629a;

        /* renamed from: b, reason: collision with root package name */
        final Bitmap f3630b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f3631c;

        /* renamed from: d, reason: collision with root package name */
        final long f3632d;

        public a(InputStream inputStream, boolean z7, long j7) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f3629a = inputStream;
            this.f3630b = null;
            this.f3631c = z7;
            this.f3632d = j7;
        }

        public Bitmap a() {
            return this.f3630b;
        }

        public long b() {
            return this.f3632d;
        }

        public InputStream c() {
            return this.f3629a;
        }
    }

    /* compiled from: MyApplication */
    public static class b extends IOException {

        /* renamed from: q, reason: collision with root package name */
        final boolean f3633q;

        /* renamed from: r, reason: collision with root package name */
        final int f3634r;

        public b(String str, int i7, int i8) {
            super(str);
            this.f3633q = q.c(i7);
            this.f3634r = i8;
        }
    }

    a a(Uri uri, int i7);
}
