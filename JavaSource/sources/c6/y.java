package c6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import c6.t;
import java.io.InputStream;

/* compiled from: MyApplication */
public abstract class y {

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final t.e f3762a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f3763b;

        /* renamed from: c, reason: collision with root package name */
        private final InputStream f3764c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3765d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) e0.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.f3763b;
        }

        int b() {
            return this.f3765d;
        }

        public t.e c() {
            return this.f3762a;
        }

        public InputStream d() {
            return this.f3764c;
        }

        public a(InputStream inputStream, t.e eVar) {
            this(null, (InputStream) e0.d(inputStream, "stream == null"), eVar, 0);
        }

        a(Bitmap bitmap, InputStream inputStream, t.e eVar, int i7) {
            if ((inputStream != null) ^ (bitmap != null)) {
                this.f3763b = bitmap;
                this.f3764c = inputStream;
                this.f3762a = (t.e) e0.d(eVar, "loadedFrom == null");
                this.f3765d = i7;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i7, int i8, int i9, int i10, BitmapFactory.Options options, w wVar) {
        int max;
        double floor;
        if (i10 > i8 || i9 > i7) {
            if (i8 == 0) {
                floor = Math.floor(i9 / i7);
            } else if (i7 == 0) {
                floor = Math.floor(i10 / i8);
            } else {
                int floor2 = (int) Math.floor(i10 / i8);
                int floor3 = (int) Math.floor(i9 / i7);
                max = wVar.f3726k ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    static void b(int i7, int i8, BitmapFactory.Options options, w wVar) {
        a(i7, i8, options.outWidth, options.outHeight, options, wVar);
    }

    static BitmapFactory.Options d(w wVar) {
        boolean c8 = wVar.c();
        boolean z7 = wVar.f3732q != null;
        if (!c8 && !z7) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c8;
        if (z7) {
            options.inPreferredConfig = wVar.f3732q;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    int e() {
        return 0;
    }

    public abstract a f(w wVar, int i7);

    boolean h(boolean z7, NetworkInfo networkInfo) {
        return false;
    }

    boolean i() {
        return false;
    }
}
