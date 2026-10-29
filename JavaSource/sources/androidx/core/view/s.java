package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f1943a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f1944b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f1945c = new HashMap();

    public s(Runnable runnable) {
        this.f1943a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f1944b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator it = this.f1944b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
