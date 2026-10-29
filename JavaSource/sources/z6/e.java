package z6;

/* compiled from: MyApplication */
public abstract class e {
    public static final d a(int i7, a aVar, p6.l lVar) {
        if (i7 == -2) {
            return aVar == a.f27990q ? new b(d.f28030a.a(), lVar) : new k(1, aVar, lVar);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? aVar == a.f27990q ? new b(i7, lVar) : new k(i7, aVar, lVar) : new b(Integer.MAX_VALUE, lVar) : aVar == a.f27990q ? new b(0, lVar) : new k(1, aVar, lVar);
        }
        if (aVar == a.f27990q) {
            return new k(1, a.f27991r, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ d b(int i7, a aVar, p6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            aVar = a.f27990q;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return a(i7, aVar, lVar);
    }
}
