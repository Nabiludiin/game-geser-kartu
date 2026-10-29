package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class p implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList f1638q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private final Context f1639r;

    /* compiled from: MyApplication */
    public interface a {
        Intent f();
    }

    private p(Context context) {
        this.f1639r = context;
    }

    public static p h(Context context) {
        return new p(context);
    }

    public p c(Intent intent) {
        this.f1638q.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p e(Activity activity) {
        Intent f8 = activity instanceof a ? ((a) activity).f() : null;
        if (f8 == null) {
            f8 = g.a(activity);
        }
        if (f8 != null) {
            ComponentName component = f8.getComponent();
            if (component == null) {
                component = f8.resolveActivity(this.f1639r.getPackageManager());
            }
            g(component);
            c(f8);
        }
        return this;
    }

    public p g(ComponentName componentName) {
        int size = this.f1638q.size();
        try {
            Intent b8 = g.b(this.f1639r, componentName);
            while (b8 != null) {
                this.f1638q.add(size, b8);
                b8 = g.b(this.f1639r, b8.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    public void i() {
        j(null);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f1638q.iterator();
    }

    public void j(Bundle bundle) {
        if (this.f1638q.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1638q.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.i(this.f1639r, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1639r.startActivity(intent);
    }
}
