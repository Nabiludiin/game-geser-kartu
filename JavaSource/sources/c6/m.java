package c6;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* compiled from: MyApplication */
public class m implements d {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f3635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3636b;

    /* renamed from: c, reason: collision with root package name */
    private int f3637c;

    /* renamed from: d, reason: collision with root package name */
    private int f3638d;

    /* renamed from: e, reason: collision with root package name */
    private int f3639e;

    /* renamed from: f, reason: collision with root package name */
    private int f3640f;

    /* renamed from: g, reason: collision with root package name */
    private int f3641g;

    public m(Context context) {
        this(e0.b(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f3637c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r3.f3635a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f3637c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r4 = move-exception
            goto L74
        L14:
            int r0 = r3.f3637c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L53
            java.util.LinkedHashMap r0 = r3.f3635a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r3.f3635a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r3.f3635a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = r3.f3637c     // Catch: java.lang.Throwable -> L12
            int r0 = c6.e0.k(r0)     // Catch: java.lang.Throwable -> L12
            int r1 = r1 - r0
            r3.f3637c = r1     // Catch: java.lang.Throwable -> L12
            int r0 = r3.f3639e     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f3639e = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.m.d(int):void");
    }

    @Override // c6.d
    public Bitmap a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmap = (Bitmap) this.f3635a.get(str);
                if (bitmap != null) {
                    this.f3640f++;
                    return bitmap;
                }
                this.f3641g++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.d
    public final synchronized int b() {
        return this.f3636b;
    }

    @Override // c6.d
    public void c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            try {
                this.f3638d++;
                this.f3637c += e0.k(bitmap);
                Bitmap bitmap2 = (Bitmap) this.f3635a.put(str, bitmap);
                if (bitmap2 != null) {
                    this.f3637c -= e0.k(bitmap2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d(this.f3636b);
    }

    @Override // c6.d
    public final synchronized int size() {
        return this.f3637c;
    }

    public m(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f3636b = i7;
        this.f3635a = new LinkedHashMap(0, 0.75f, true);
    }
}
