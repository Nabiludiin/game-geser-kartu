package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.i;

/* compiled from: MyApplication */
public abstract class g {

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1799a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f1800b;

        public a(int i7, b[] bVarArr) {
            this.f1799a = i7;
            this.f1800b = bVarArr;
        }

        static a a(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        public b[] b() {
            return this.f1800b;
        }

        public int c() {
            return this.f1799a;
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1801a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1802b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1803c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1804d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1805e;

        public b(Uri uri, int i7, int i8, boolean z7, int i9) {
            this.f1801a = (Uri) androidx.core.util.e.f(uri);
            this.f1802b = i7;
            this.f1803c = i8;
            this.f1804d = z7;
            this.f1805e = i9;
        }

        static b a(Uri uri, int i7, int i8, boolean z7, int i9) {
            return new b(uri, i7, i8, z7, i9);
        }

        public int b() {
            return this.f1805e;
        }

        public int c() {
            return this.f1802b;
        }

        public Uri d() {
            return this.f1801a;
        }

        public int e() {
            return this.f1803c;
        }

        public boolean f() {
            return this.f1804d;
        }
    }

    /* compiled from: MyApplication */
    public static class c {
        public abstract void a(int i7);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i7, boolean z7, int i8, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z7 ? f.e(context, eVar, aVar, i7, i8) : f.d(context, eVar, i7, null, aVar);
    }
}
