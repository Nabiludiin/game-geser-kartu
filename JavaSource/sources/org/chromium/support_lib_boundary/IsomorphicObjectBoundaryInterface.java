package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}
