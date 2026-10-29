package c7;

import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class h {
    public static final void a(g6.i iVar, Throwable th) {
        Iterator it = g.a().iterator();
        while (it.hasNext()) {
            try {
                ((x6.e0) it.next()).w(iVar, th);
            } catch (Throwable th2) {
                g.b(x6.f0.b(th, th2));
            }
        }
        try {
            e6.a.a(th, new i(iVar));
        } catch (Throwable unused) {
        }
        g.b(th);
    }
}
