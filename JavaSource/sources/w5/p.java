package w5;

import java.io.IOException;

/* compiled from: MyApplication */
public abstract class p {
    public abstract Object a(b6.a aVar);

    public final g b(Object obj) {
        try {
            z5.e eVar = new z5.e();
            c(eVar, obj);
            return eVar.P();
        } catch (IOException e8) {
            throw new h(e8);
        }
    }

    public abstract void c(b6.c cVar, Object obj);
}
