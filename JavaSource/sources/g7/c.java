package g7;

import c7.f0;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final f0 f24062a = new f0("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final f0 f24063b = new f0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z7) {
        return new b(z7);
    }

    public static /* synthetic */ a b(boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return a(z7);
    }
}
