package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: q, reason: collision with root package name */
    private static int f247q = -100;

    /* renamed from: r, reason: collision with root package name */
    private static final r.b f248r = new r.b();

    /* renamed from: s, reason: collision with root package name */
    private static final Object f249s = new Object();

    d() {
    }

    static void c(d dVar) {
        synchronized (f249s) {
            y(dVar);
            f248r.add(new WeakReference(dVar));
        }
    }

    public static d g(Activity activity, g.a aVar) {
        return new e(activity, aVar);
    }

    public static d h(Dialog dialog, g.a aVar) {
        return new e(dialog, aVar);
    }

    public static int j() {
        return f247q;
    }

    static void x(d dVar) {
        synchronized (f249s) {
            y(dVar);
        }
    }

    private static void y(d dVar) {
        synchronized (f249s) {
            try {
                Iterator it = f248r.iterator();
                while (it.hasNext()) {
                    d dVar2 = (d) ((WeakReference) it.next()).get();
                    if (dVar2 == dVar || dVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(int i7);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(int i7);

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract View i(int i7);

    public abstract int k();

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i7);

    public void e(Context context) {
    }
}
