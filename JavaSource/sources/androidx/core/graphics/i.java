package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* compiled from: MyApplication */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final o f1720a;

    /* renamed from: b, reason: collision with root package name */
    private static final r.f f1721b;

    /* compiled from: MyApplication */
    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f1722a;

        public a(h.e eVar) {
            this.f1722a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i7) {
            h.e eVar = this.f1722a;
            if (eVar != null) {
                eVar.f(i7);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f1722a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f1720a = new n();
        } else if (i7 >= 28) {
            f1720a = new m();
        } else if (i7 >= 26) {
            f1720a = new l();
        } else if (i7 < 24 || !k.j()) {
            f1720a = new j();
        } else {
            f1720a = new k();
        }
        f1721b = new r.f(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        return f1720a.b(context, cancellationSignal, bVarArr, i7);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i7, String str, int i8, int i9, h.e eVar, Handler handler, boolean z7) {
        Typeface a8;
        if (bVar instanceof e.C0025e) {
            e.C0025e c0025e = (e.C0025e) bVar;
            Typeface g8 = g(c0025e.c());
            if (g8 != null) {
                if (eVar != null) {
                    eVar.d(g8, handler);
                }
                return g8;
            }
            a8 = androidx.core.provider.g.c(context, c0025e.b(), i9, !z7 ? eVar != null : c0025e.a() != 0, z7 ? c0025e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            a8 = f1720a.a(context, (e.c) bVar, resources, i9);
            if (eVar != null) {
                if (a8 != null) {
                    eVar.d(a8, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a8 != null) {
            f1721b.d(e(resources, i7, str, i8, i9), a8);
        }
        return a8;
    }

    public static Typeface d(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface d8 = f1720a.d(context, resources, i7, str, i9);
        if (d8 != null) {
            f1721b.d(e(resources, i7, str, i8, i9), d8);
        }
        return d8;
    }

    private static String e(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    public static Typeface f(Resources resources, int i7, String str, int i8, int i9) {
        return (Typeface) f1721b.c(e(resources, i7, str, i8, i9));
    }

    private static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
