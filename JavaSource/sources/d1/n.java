package d1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* compiled from: MyApplication */
public class n implements c1.d {

    /* renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f23072a;

    private n(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f23072a = scriptHandlerBoundaryInterface;
    }

    public static n a(InvocationHandler invocationHandler) {
        return new n((ScriptHandlerBoundaryInterface) h7.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
