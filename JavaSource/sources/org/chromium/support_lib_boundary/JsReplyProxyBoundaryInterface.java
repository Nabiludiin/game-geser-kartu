package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: MyApplication */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}
