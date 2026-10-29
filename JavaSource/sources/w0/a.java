package w0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MyApplication */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f27014e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f27015a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f27016b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27017c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f27018d;

    public a(String str, File file, boolean z7) {
        File file2 = new File(file, str + ".lck");
        this.f27015a = file2;
        this.f27016b = a(file2.getAbsolutePath());
        this.f27017c = z7;
    }

    private static Lock a(String str) {
        Lock lock;
        Map map = f27014e;
        synchronized (map) {
            try {
                lock = (Lock) map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lock;
    }

    public void b() {
        this.f27016b.lock();
        if (this.f27017c) {
            try {
                FileChannel channel = new FileOutputStream(this.f27015a).getChannel();
                this.f27018d = channel;
                channel.lock();
            } catch (IOException e8) {
                throw new IllegalStateException("Unable to grab copy lock.", e8);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f27018d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f27016b.unlock();
    }
}
