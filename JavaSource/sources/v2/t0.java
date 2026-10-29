package v2;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f26847a = new ConcurrentHashMap();

    public t0() {
        new AtomicInteger(0);
    }

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f26847a.get(num);
    }
}
