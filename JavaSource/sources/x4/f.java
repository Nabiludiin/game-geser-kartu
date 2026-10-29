package x4;

import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import p4.l0;
import p4.q1;
import x4.b;

/* compiled from: MyApplication */
public abstract class f {

    /* compiled from: MyApplication */
    public interface a {
        void a(e eVar);
    }

    /* compiled from: MyApplication */
    public interface b {
        void b(x4.b bVar);
    }

    public static c a(Context context) {
        return p4.a.a(context).b();
    }

    public static void b(final Activity activity, final b.a aVar) {
        if (p4.a.a(activity).b().b()) {
            aVar.a(null);
            return;
        }
        l0 c8 = p4.a.a(activity).c();
        q1.a();
        b bVar = new b() { // from class: p4.j0
            @Override // x4.f.b
            public final void b(x4.b bVar2) {
                bVar2.a(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        c8.b(bVar, new a() { // from class: p4.k0
            @Override // x4.f.a
            public final void a(x4.e eVar) {
                b.a.this.a(eVar);
            }
        });
    }
}
