package x0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* compiled from: MyApplication */
public interface b extends Closeable {
    List C();

    void D(String str);

    f K(String str);

    void X();

    void Y(String str, Object[] objArr);

    Cursor i0(String str);

    boolean isOpen();

    void l0();

    String r0();

    Cursor s0(e eVar, CancellationSignal cancellationSignal);

    boolean t0();

    Cursor v(e eVar);

    void x();
}
