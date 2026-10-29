package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class o1 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f833c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f834d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f835a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f836b;

    private o1(Context context) {
        super(context);
        if (!y1.c()) {
            this.f835a = new q1(this, context.getResources());
            this.f836b = null;
            return;
        }
        y1 y1Var = new y1(this, context.getResources());
        this.f835a = y1Var;
        Resources.Theme newTheme = y1Var.newTheme();
        this.f836b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof o1) || (context.getResources() instanceof q1) || (context.getResources() instanceof y1) || !y1.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f833c) {
            try {
                ArrayList arrayList = f834d;
                if (arrayList == null) {
                    f834d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f834d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f834d.remove(size);
                        }
                    }
                    for (int size2 = f834d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f834d.get(size2);
                        o1 o1Var = weakReference2 != null ? (o1) weakReference2.get() : null;
                        if (o1Var != null && o1Var.getBaseContext() == context) {
                            return o1Var;
                        }
                    }
                }
                o1 o1Var2 = new o1(context);
                f834d.add(new WeakReference(o1Var2));
                return o1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f835a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f835a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f836b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f836b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
