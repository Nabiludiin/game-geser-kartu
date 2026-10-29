package d1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: MyApplication */
public abstract class p implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f23076a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static c1.f[] a(InvocationHandler[] invocationHandlerArr) {
        c1.f[] fVarArr = new c1.f[invocationHandlerArr.length];
        for (int i7 = 0; i7 < invocationHandlerArr.length; i7++) {
            fVarArr[i7] = new r(invocationHandlerArr[i7]);
        }
        return fVarArr;
    }

    public static c1.e b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        c1.f[] a8 = a(webMessageBoundaryInterface.getPorts());
        if (!s.C.d()) {
            return new c1.e(webMessageBoundaryInterface.getData(), a8);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) h7.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new c1.e(webMessagePayloadBoundaryInterface.getAsString(), a8);
        }
        if (type != 1) {
            return null;
        }
        return new c1.e(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a8);
    }
}
