package z4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public abstract class l {

    /* compiled from: MyApplication */
    class a extends z {

        /* renamed from: q, reason: collision with root package name */
        boolean f27873q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f27874r;

        a(Object obj) {
            this.f27874r = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f27873q;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f27873q) {
                throw new NoSuchElementException();
            }
            this.f27873q = true;
            return this.f27874r;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !y4.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static z b(Object obj) {
        return new a(obj);
    }
}
