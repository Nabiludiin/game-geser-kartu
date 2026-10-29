package v6;

import java.util.Iterator;
import q6.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class f extends e {

    /* compiled from: MyApplication */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f26917a;

        public a(Iterator it) {
            this.f26917a = it;
        }

        @Override // v6.b
        public Iterator iterator() {
            return this.f26917a;
        }
    }

    public static b a(Iterator it) {
        i.e(it, "<this>");
        return b(new a(it));
    }

    public static final b b(b bVar) {
        i.e(bVar, "<this>");
        return bVar instanceof v6.a ? bVar : new v6.a(bVar);
    }
}
