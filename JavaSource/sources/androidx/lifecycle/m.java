package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: MyApplication */
public abstract class m extends Service implements k {

    /* renamed from: q, reason: collision with root package name */
    private final v f2525q = new v(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f2525q.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2525q.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f2525q.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i7) {
        this.f2525q.e();
        super.onStart(intent, i7);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }

    @Override // androidx.lifecycle.k
    public g t() {
        return this.f2525q.a();
    }
}
