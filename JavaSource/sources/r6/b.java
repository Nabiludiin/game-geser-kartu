package r6;

import java.util.Random;
import q6.i;

/* compiled from: MyApplication */
public final class b extends r6.a {

    /* renamed from: s, reason: collision with root package name */
    private final a f25900s = new a();

    /* compiled from: MyApplication */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // r6.a
    public Random c() {
        Object obj = this.f25900s.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
