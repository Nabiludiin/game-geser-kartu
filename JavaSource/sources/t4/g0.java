package t4;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract /* synthetic */ class g0 {
    public static /* synthetic */ Map.Entry a(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
