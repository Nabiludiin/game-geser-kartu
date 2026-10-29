package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class mz4 {
    static ez4 a(Class cls) {
        ClassLoader classLoader = mz4.class.getClassLoader();
        if (cls.equals(ez4.class)) {
            try {
                try {
                    android.support.v4.media.session.b.a(Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (ReflectiveOperationException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(mz4.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            } catch (ServiceConfigurationError e9) {
                Logger.getLogger(az4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e9);
            }
        }
        if (arrayList.size() == 1) {
            return (ez4) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (ez4) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
