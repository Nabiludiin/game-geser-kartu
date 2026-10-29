package y6;

import android.os.Looper;
import c7.t;
import java.util.List;
import x6.x1;

/* compiled from: MyApplication */
public final class a implements t {
    @Override // c7.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // c7.t
    public x1 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // c7.t
    public int c() {
        return 1073741823;
    }
}
