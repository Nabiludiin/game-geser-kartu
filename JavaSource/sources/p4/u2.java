package p4;

import android.util.Log;

/* compiled from: MyApplication */
public final class u2 extends Exception {

    /* renamed from: q, reason: collision with root package name */
    private final int f25516q;

    public u2(int i7, String str) {
        super(str);
        this.f25516q = i7;
    }

    public final x4.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new x4.e(this.f25516q, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public u2(int i7, String str, Throwable th) {
        super(str, th);
        this.f25516q = i7;
    }
}
