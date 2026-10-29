package u0;

import androidx.room.h;
import x0.f;

/* compiled from: MyApplication */
public abstract class a extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, Object obj);

    public final void h(Object obj) {
        f a8 = a();
        try {
            g(a8, obj);
            a8.I0();
        } finally {
            f(a8);
        }
    }
}
