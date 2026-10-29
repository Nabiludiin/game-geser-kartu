package y6;

import android.os.Build;
import g6.i;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import x6.e0;

/* compiled from: MyApplication */
public final class b extends g6.a implements e0 {
    private volatile Object _preHandler;

    public b() {
        super(e0.f27380o);
        this._preHandler = this;
    }

    private final Method h() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // x6.e0
    public void w(i iVar, Throwable th) {
        int i7 = Build.VERSION.SDK_INT;
        if (26 > i7 || i7 >= 28) {
            return;
        }
        Method h8 = h();
        Object invoke = h8 != null ? h8.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
