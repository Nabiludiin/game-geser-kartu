package d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f23047a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f23048b;

    public void a(b bVar) {
        if (this.f23048b != null) {
            bVar.a(this.f23048b);
        }
        this.f23047a.add(bVar);
    }

    public void b() {
        this.f23048b = null;
    }

    public void c(Context context) {
        this.f23048b = context;
        Iterator it = this.f23047a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
