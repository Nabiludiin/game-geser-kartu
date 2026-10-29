package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f1739a = new ConcurrentHashMap();

    /* compiled from: MyApplication */
    class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.o.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: MyApplication */
    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    o() {
    }

    private static Object e(Object[] objArr, int i7, b bVar) {
        return f(objArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i7, boolean z7, b bVar) {
        Object obj = null;
        int i8 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i7) * 2) + (bVar.b(obj2) == z7 ? 0 : 1);
            if (obj == null || i8 > abs) {
                obj = obj2;
                i8 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i7);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7);

    protected Typeface c(Context context, InputStream inputStream) {
        File e8 = p.e(context);
        if (e8 == null) {
            return null;
        }
        try {
            if (p.d(e8, inputStream)) {
                return Typeface.createFromFile(e8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e8.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        File e8 = p.e(context);
        if (e8 == null) {
            return null;
        }
        try {
            if (p.c(e8, resources, i7)) {
                return Typeface.createFromFile(e8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e8.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i7) {
        return (g.b) e(bVarArr, i7, new a());
    }
}
