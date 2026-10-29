package f5;

import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public class s extends t {

    /* renamed from: q, reason: collision with root package name */
    private final List f23781q;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f23781q = list;
    }
}
