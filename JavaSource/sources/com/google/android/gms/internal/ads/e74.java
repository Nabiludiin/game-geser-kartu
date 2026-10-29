package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class e74 extends a54 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f7457x;

    e74(Runnable runnable) {
        runnable.getClass();
        this.f7457x = runnable;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        String obj = this.f7457x.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7457x.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
