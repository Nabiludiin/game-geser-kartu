package k3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f24459a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f24460b = new LinkedBlockingQueue();

    public IBinder a(long j7, TimeUnit timeUnit) {
        p3.o.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f24459a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f24459a = true;
        IBinder iBinder = (IBinder) this.f24460b.poll(j7, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24460b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
