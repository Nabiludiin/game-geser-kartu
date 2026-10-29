package w3;

import android.content.Context;
import android.os.IBinder;
import k3.k;
import p3.o;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f27105a;

    /* renamed from: b, reason: collision with root package name */
    private Object f27106b;

    /* compiled from: MyApplication */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f27105a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) {
        if (this.f27106b == null) {
            o.m(context);
            Context d8 = k.d(context);
            if (d8 == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f27106b = a((IBinder) d8.getClassLoader().loadClass(this.f27105a).newInstance());
            } catch (ClassNotFoundException e8) {
                throw new a("Could not load creator class.", e8);
            } catch (IllegalAccessException e9) {
                throw new a("Could not access creator.", e9);
            } catch (InstantiationException e10) {
                throw new a("Could not instantiate creator.", e10);
            }
        }
        return this.f27106b;
    }
}
