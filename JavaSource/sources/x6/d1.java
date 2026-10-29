package x6;

import g6.i;
import java.io.Closeable;

/* compiled from: MyApplication */
public abstract class d1 extends d0 implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f27377s = new a(null);

    /* compiled from: MyApplication */
    public static final class a extends g6.b {

        /* compiled from: MyApplication */
        /* renamed from: x6.d1$a$a, reason: collision with other inner class name */
        static final class C0149a extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            public static final C0149a f27378r = new C0149a();

            C0149a() {
                super(1);
            }

            @Override // p6.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d1 g(i.b bVar) {
                if (bVar instanceof d1) {
                    return (d1) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
            super(d0.f27375r, C0149a.f27378r);
        }
    }
}
